package bianlifeng;

import java.util.*;
//CUNKOU,GUIGE
//north,north,north,east,east,east,east,north,north,north,west
public class Main2 {
    public static class Node {
        public String address;
        public Node east;
        public Node south;
        public Node west;
        public Node north;
        public boolean visited;

        public Node(String address) {
            this.address = address;
            this.visited = false;
        }

        public void linkWest(Node node) {
            this.west = node;
            node.east = this;
        }

        public void linkEast(Node node) {
            this.east = node;
            node.west = this;
        }

        public void linkNorth(Node node) {
            this.north = node;
            node.south = this;
        }

        public void linkSouth(Node node) {
            this.south = node;
            node.north = this;
        }
    }
    public static Node head = new Node("NONGSHE");
    public static String path = "";
    public static String shortestPath = "";
    public Main2() {
        //head.address = "NONGSHE";
        Node cunKou = new Node("CUNKOU");
        head.linkWest(cunKou);
        Node tuLu = new Node("TULU");
        cunKou.linkNorth(tuLu);
        Node daoTian = new Node("DAOTIAN");
        tuLu.linkNorth(daoTian);
        Node tuLu1 = new Node("TULU1");
        daoTian.linkNorth(tuLu1);
        Node daoTian1 = new Node("DAOTIAN1");
        tuLu1.linkNorth(daoTian1);
        Node tuLu2 = new Node("TULU2");
        tuLu1.linkEast(tuLu2);
        Node jieDao = new Node("JIEDAO");
        tuLu2.linkEast(jieDao);
        Node liuJiaBuDian = new Node("LIUJIABUDIAN");
        jieDao.linkNorth(liuJiaBuDian);
        Node tiePu = new Node("TIEPU");
        jieDao.linkSouth(tiePu);
        Node jieDao1 = new Node("JIEDAO1");
        jieDao.linkEast(jieDao1);
        Node xiaoJiuGuan = new Node("XIAOJIUGUAN");
        jieDao1.linkSouth(xiaoJiuGuan);
        Node gaoJiaDaYuan = new Node("GAOJIADAYUAN");
        jieDao1.linkEast(gaoJiaDaYuan);
        Node jieDao2 = new Node("JIEDAO2");
        gaoJiaDaYuan.linkEast(jieDao2);
        Node tuLu3 = new Node("TULU3");
        jieDao2.linkEast(tuLu3);
        Node qingShiLu = new Node("QINGSHILU");
        tuLu3.linkEast(qingShiLu);
        Node zhengYuan = new Node("ZHENGYUAN");
        gaoJiaDaYuan.linkNorth(zhengYuan);
        Node zhangFang = new Node("ZHANGFAN");
        zhengYuan.linkWest(zhangFang);
        Node pianFang = new Node("PIANFANG");
        zhengYuan.linkEast(pianFang);
        Node zhengTing = new Node("ZHENGTING");
        zhengYuan.linkNorth(zhengTing);
        Node pianTing = new Node("PIANTING");
        zhengTing.linkWest(pianTing);
        Node fanTing = new Node("FANTING");
        zhengTing.linkEast(fanTing);
        Node houYuan = new Node("HOUYUAN");
        zhengTing.linkNorth(houYuan);
        Node guiGe = new Node("GUIGE");
        houYuan.linkWest(guiGe);
        Node yaShi = new Node("YASHI");
        guiGe.linkNorth(yaShi);
        Node xiyiFang = new Node("XIYIFANG");
        houYuan.linkEast(xiyiFang);
        Node huaYuan = new Node("HUAYUAN");
        houYuan.linkNorth(huaYuan);

    }
    public static Node get(Node node, String address) {
        if (node != null && node.address.equals(address)) {
            return node;
        }
        else if (node != null && node.east != null) {
            return get(node.east, address);
        }
        else if (node != null && node.west != null) {
            return get(node.west, address);
        }
        else if (node != null && node.north != null) {
            return get(node.north, address);
        }
        else if (node != null && node.south != null) {
            return get(node.south, address);
        }
        else {
            return null;
        }
    }

    public static void dfs(Node node, String address) {
           if (node != null && node.address.equals(address)) {
               String newPath = path.substring(0, path.length() - 1);
               int newPathLength = newPath.split(",").length;
               int shorestLength = shortestPath.split(",").length;
               if(shortestPath.equals("") || newPathLength < shorestLength ) {
                   shortestPath = newPath;
               }
               System.out.println(path);
               return;
           }
        if (node != null && node.east != null && !node.east.visited) {
            String origin = path;
            path += "east,";
            node.east.visited = true;
            dfs(node.east, address);
            node.east.visited = false;
            path = origin;
        }
        if (node != null && node.west != null && !node.west.visited) {
            String origin = path;
            path += "west,";
            node.west.visited = true;
            dfs(node.west, address);
            node.west.visited = false;
            path = origin;
        }
        if (node != null && node.north != null && !node.north.visited) {
            String origin = path;
            path += "north,";
            node.north.visited = true;
            dfs(node.north, address);
            node.north.visited = false;
            path = origin;
        }
        if (node != null && node.south != null && !node.south.visited) {
            String origin = path;
            path += "south,";
            node.south.visited = true;
            dfs(node.south, address);
            node.south.visited = false;
            path = origin;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] strArr = line.split(",");
        String from = strArr[0];
        String to = strArr[1];
        Main2 main2 = new Main2();
        Node wuKong = get(head, from);
        dfs(wuKong, to);
        System.out.println(shortestPath);

    }
}
