package com.example.wangyajie.myapplication;

import java.util.List;

/**
 * Created by wangyajie on 2018/7/24.
 */

public class JavaBean {
    /**
     * limit : 1000
     * subscribed : []
     * others : [{"color":15007,"thumbnail":"http://pic3.zhimg.com/0e71e90fd6be47630399d63c58beebfc.jpg","description":"了解自己和别人，了解彼此的欲望和局限。","id":13,"name":"日常心理学"},{"color":8307764,"thumbnail":"http://pic4.zhimg.com/2c38a96e84b5cc8331a901920a87ea71.jpg","description":"内容由知乎用户推荐，海纳主题百万，趣味上天入地","id":12,"name":"用户推荐日报"},{"color":14483535,"thumbnail":"http://pic3.zhimg.com/00eba01080138a5ac861d581a64ff9bd.jpg","description":"除了经典和新片，我们还关注技术和产业","id":3,"name":"电影日报"},{"color":8307764,"thumbnail":"http://pic4.zhimg.com/4aa8400ba46d3d46e34a9836744ea232.jpg","description":"为你发现最有趣的新鲜事，建议在 WiFi 下查看","id":11,"name":"不许无聊"},{"color":62140,"thumbnail":"http://p1.zhimg.com/d3/7b/d37b38d5c82b4345ccd7e50c4ae997da.jpg","description":"好设计需要打磨和研习，我们分享灵感和路径","id":4,"name":"设计日报"},{"color":1615359,"thumbnail":"http://pic4.zhimg.com/aa94e197491fb9c44d384c4747773810.jpg","description":"商业世界变化越来越快，就是这些家伙干的","id":5,"name":"大公司日报"},{"color":16031744,"thumbnail":"http://pic2.zhimg.com/f2e97ff073e5cf9e79c7ed498727ebd6.jpg","description":"从业者推荐的财经金融资讯","id":6,"name":"财经日报"},{"color":9699556,"thumbnail":"http://pic2.zhimg.com/98d7b4f8169c596efb6ee8487a30c8ee.jpg","description":"把黑客知识科普到你的面前","id":10,"name":"互联网安全"},{"color":59647,"thumbnail":"http://pic3.zhimg.com/2f214a4ca51855670668530f7d333fd8.jpg","description":"如果你喜欢游戏，就从这里开始","id":2,"name":"开始游戏"},{"color":1564695,"thumbnail":"http://pic4.zhimg.com/eac535117ed895983bd2721f35d6e8dc.jpg","description":"有音乐就很好","id":7,"name":"音乐日报"},{"color":6123007,"thumbnail":"http://pic1.zhimg.com/a0f97c523c64e749c700b2ddc96cfd7c.jpg","description":"用技术的眼睛仔细看懂每一部动画和漫画","id":9,"name":"动漫日报"},{"color":16046124,"thumbnail":"http://pic1.zhimg.com/bcf7d594f126e5ceb22691be32b2650a.jpg","description":"关注体育，不吵架。","id":8,"name":"体育日报"}]
     */

    private int limit;
    private List<?> subscribed;
    private List<OthersBean> others;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<?> getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(List<?> subscribed) {
        this.subscribed = subscribed;
    }

    public List<OthersBean> getOthers() {
        return others;
    }

    public void setOthers(List<OthersBean> others) {
        this.others = others;
    }

    public static class OthersBean {
        /**
         * color : 15007
         * thumbnail : http://pic3.zhimg.com/0e71e90fd6be47630399d63c58beebfc.jpg
         * description : 了解自己和别人，了解彼此的欲望和局限。
         * id : 13
         * name : 日常心理学
         */

        private int color;
        private String thumbnail;
        private String description;
        private int id;
        private String name;

        public int getColor() {
            return color;
        }

        public void setColor(int color) {
            this.color = color;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String toString() {
            return "标题='" + name + '\'' + "图片链接=" + thumbnail;
        }

    }


//    /**
//     * date : 20131118
//     * stories : [{"images":["http://p4.zhimg.com/7b/c8/7bc8ef5947b069513c51e4b9521b5c82.jpg"],"type":0,"id":1747159,"ga_prefix":"111822","title":"深夜食堂 · 我的张曼妮"},{"images":["http://p3.zhimg.com/21/0c/210c7b63b931932fa7a1e62bf0113e7b.jpg"],"type":0,"id":1858551,"ga_prefix":"111822","title":"清朝皇帝上朝的时候说的是满语还是汉语？"},{"images":["http://p4.zhimg.com/7c/d1/7cd1496541c7964b2cf8614b9fa664b0.jpg"],"type":0,"id":1848791,"ga_prefix":"111821","title":"淘宝上那些适合送爸妈的东西"},{"images":["http://p2.zhimg.com/11/05/1105cfa3d12f3539ef35fa603614ed92.jpg"],"type":0,"id":1849914,"ga_prefix":"111820","title":"恋爱里的男子汉，迎头专心刷榜才是正经事"},{"images":["http://p4.zhimg.com/cf/1f/cf1fd58f22d3c5fd2fd2a5543d70f81d.jpg"],"type":0,"id":1854693,"ga_prefix":"111819","title":"鸡蛋黄和蛋清长成了的话分别是鸡的什么部位？"},{"images":["http://p2.zhimg.com/e3/d1/e3d15e98b3db498d53d9ed1b85d2fab5.jpg"],"type":0,"id":1861205,"ga_prefix":"111818","title":"鲜柚游戏周报\r\n回顾一周 iOS 精品游戏"},{"title":"吃很重要 · 第一口就开始 high 了（多图）","ga_prefix":"111818","images":["http://p2.zhimg.com/14/3b/143bd74ec7a0299b76d17e6b095799aa.jpg"],"multipic":true,"type":0,"id":1858917},{"images":["http://p2.zhimg.com/51/32/51324fa89e1aba7a337e20e98c9664f1.jpg"],"type":0,"id":1856401,"ga_prefix":"111818","title":"追女孩教练传授：妹子玩手机的话，你就也玩手机，挺好的"},{"images":["http://p3.zhimg.com/f0/97/f0973d30830eed315d46b531f38719cf.jpg"],"type":0,"id":1854400,"ga_prefix":"111817","title":"最美应用 · 给你一种新邮箱Molto"},{"images":["http://p1.zhimg.com/d6/11/d611dd7d57d144621779ec36c8df42fb.jpg"],"type":0,"id":1848590,"ga_prefix":"111817","title":"谁在维护比特币的核心算法？"},{"images":["http://p3.zhimg.com/f8/70/f870fac8fea14e56d2cddf926a4800f2.jpg"],"type":0,"id":1847175,"ga_prefix":"111816","title":"离岸金融：一种光明正大的钻空子行为"},{"images":["http://p1.zhimg.com/d4/30/d430ba0d8d9e51482b6a0bd8ff5ef6ee.jpg"],"type":0,"id":1846706,"ga_prefix":"111815","title":"银泰全面支持支付宝钱包付款，两个初学者的第一次"},{"images":["http://p1.zhimg.com/4b/8c/4b8c8f9c40f08fa9a1a830095131c67c.jpg"],"type":0,"id":1846781,"ga_prefix":"111814","title":"仅售 179 美元，Moto G 为什么定价这么低"},{"images":["http://p3.zhimg.com/2c/ce/2cce90676f6841e01ab683384f4daaf0.jpg"],"type":0,"id":1844934,"ga_prefix":"111813","title":"导演张一白：青春小说到青春电影，中间有层面纱"},{"images":["http://p4.zhimg.com/39/ff/39ff45effc9f6083bb8da5a6f768eaa2.jpg"],"type":0,"id":1838196,"ga_prefix":"111812","title":"知天下 · 圆顶事实上是宗教建筑中常用的一种造型"},{"images":["http://p1.zhimg.com/80/26/802617acf921694c7a2e732008e6c2cf.jpg"],"type":0,"id":1844302,"ga_prefix":"111811","title":"PrimeSense：苹果正在试图收购这个革命性体感控制设备"},{"images":["http://p2.zhimg.com/a6/42/a6423122d959de347cc8a8c61d150c21.jpg"],"type":0,"id":1844263,"ga_prefix":"111810","title":"家庭用 100M 光纤使用什么无线路由器才能发挥最大网速？"},{"images":["http://p2.zhimg.com/52/94/52941a00e16bffffe480e19c387d07d9.jpg"],"type":0,"id":1843578,"ga_prefix":"111809","title":"金融产品也有物流，并且好处多多"},{"images":["http://p1.zhimg.com/86/79/86799f8608bf39171b78456675a9f4f0.jpg"],"type":0,"id":1839454,"ga_prefix":"111807","title":"召回六十多万辆车，大众继续焦头烂额处理变速箱问题"},{"images":["http://p4.zhimg.com/3a/dd/3adda8a964695f3d0c84944fbb676cda.jpg"],"type":0,"id":1843290,"ga_prefix":"111807","title":"全方位冬日晨跑注意事项已供上，假设你已起床"},{"images":["http://p2.zhimg.com/a8/a6/a8a677d04d27a96cdb457e6c1a430d68.jpg"],"type":0,"id":1838920,"ga_prefix":"111807","title":"独处时才是了解自己的最好机会，你上完厕所会冲吗？"},{"images":["http://p4.zhimg.com/c5/7d/c57d1d0ee1ba83df700982a4f8e5ac26.jpg"],"type":0,"id":1843557,"ga_prefix":"111807","title":"李宗盛：既然青春留不住，不如听大叔讲故事"},{"images":["http://p3.zhimg.com/b7/b2/b7b223eaa3a6daaf680f266973803c75.jpg"],"type":0,"id":1839693,"ga_prefix":"111807","title":"创业公司财务怎么做，绝大多数创业初期年轻人不知道这个"},{"images":["http://p3.zhimg.com/21/32/21328ba459bee7961dc71de398002638.jpg"],"type":0,"id":1841395,"ga_prefix":"111806","title":"瞎扯 · 如何正确地吐槽"}]
//     */
//
//    private String date;
//    private List<StoriesBean> stories;
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public List<StoriesBean> getStories() {
//        return stories;
//    }
//
//    public void setStories(List<StoriesBean> stories) {
//        this.stories = stories;
//    }
//
//    public static class StoriesBean {
//        /**
//         * images : ["http://p4.zhimg.com/7b/c8/7bc8ef5947b069513c51e4b9521b5c82.jpg"]
//         * type : 0
//         * id : 1747159
//         * ga_prefix : 111822
//         * title : 深夜食堂 · 我的张曼妮
//         * multipic : true
//         */
//
//        private int type;
//        private int id;
//        private String ga_prefix;
//        private String title;
//        private boolean multipic;
//        private List<String> images;
//
//        public int getType() {
//            return type;
//        }
//
//        public void setType(int type) {
//            this.type = type;
//        }
//
//        public int getId() {
//            return id;
//        }
//
//        public void setId(int id) {
//            this.id = id;
//        }
//
//        public String getGa_prefix() {
//            return ga_prefix;
//        }
//
//        public void setGa_prefix(String ga_prefix) {
//            this.ga_prefix = ga_prefix;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public void setTitle(String title) {
//            this.title = title;
//        }
//
//        public boolean isMultipic() {
//            return multipic;
//        }
//
//        public void setMultipic(boolean multipic) {
//            this.multipic = multipic;
//        }
//
//        public List<String> getImages() {
//            return images;
//        }
//
//        public void setImages(List<String> images) {
//            this.images = images;
//        }
//
//        @Override
//        public String toString() {
//            return "标题='" + title + '\'' + "图片链接=" + images;
//        }
//    }
}
