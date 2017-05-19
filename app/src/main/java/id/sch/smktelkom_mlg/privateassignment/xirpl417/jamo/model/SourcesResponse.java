package id.sch.smktelkom_mlg.privateassignment.xirpl417.jamo.model;

/**
 * Created by Smktelkomm on 5/19/2017.
 */

import java.util.List;

public class SourcesResponse {
    //    "status": "ok",
    //    "results": [{
    //            "id": "abc-news-au",
    //            "name": "ABC News (AU)",
    //            "description": "Australia's most trusted source of local, national and world news. Comprehensive, independent, in-depth analysis, the latest business, sport, weather and more.",
    //            "url": "http://www.abc.net.au/news",
    //            "category": "general",
    //            "language": "en",
    //            "country": "au",
    //            "urlsToLogos": {
    //                "small": "",
    //                "medium": "",
    //                "large": ""
    //            },
    //            "sortBysAvailable": ["top"]
    //            },]

    public String status;
    public List<Result> results;

}
