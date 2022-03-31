import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.RecursiveTask;

public class LinkList extends RecursiveTask<String> {
    private String url;//адрес
    private String level;
    private CopyOnWriteArraySet<String> allLinks;

    public LinkList(String url, CopyOnWriteArraySet<String> allLinks) {
        this.url = url;
        this.allLinks = allLinks;
    }

    public LinkList(String url) {
        this.url = url;
        this.allLinks = new CopyOnWriteArraySet<>();
    }

    @Override
    protected String compute() {
        String tabulate = StringUtils.repeat("\t",
                url.lastIndexOf("/") != url.length() - 1 ? StringUtils.countMatches(url, "/") - 2
                        : StringUtils.countMatches(url, "/") - 3);

        StringBuilder stringBuilder = new StringBuilder(tabulate + url + "\n");

        Set<LinkList> allTask = new TreeSet<>(new Comparator<LinkList>() {
            @Override
            public int compare(LinkList o1, LinkList o2) {
                return o1.url.compareTo(o2.url);
            }
        });

        Document document;
        Elements elements;
        try {
            Thread.sleep(150);
            document = Jsoup.connect(url).ignoreContentType(true).maxBodySize(0).get();
            elements = document.select("a[href]");

            for (Element element : elements) {
                String attributeUrl = element.absUrl("href");

                if (attributeUrl.startsWith(url)
                        && !attributeUrl.contains("#")
                        && !allLinks.contains(attributeUrl)) {

                    LinkList links = new LinkList(attributeUrl, allLinks);
                    links.fork();
                    allTask.add(links);
                    allLinks.add(attributeUrl);
                }
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }

        for (LinkList link : allTask) {
            stringBuilder.append(link.join());
        }
        return stringBuilder.toString();
    }
}
