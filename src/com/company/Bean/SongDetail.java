package com.company.Bean;

import com.google.gson.annotations.*;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by Lee on 2017/3/12.
 */
public class SongDetail implements Serializable{
    @SerializedName("code")
    private int code;
    @SerializedName("url")
    private Map<String,String> url;
    @SerializedName("url1")
    private Url1Bean url1;
    @SerializedName("joox")
    private int joox;
    @SerializedName("data")
    private List<DataBean> data;
    @SerializedName("extra_data")
    private List<?> extraData;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Map<String, String> getUrl() {
        return url;
    }

    public void setUrl(Map<String,String> url) {
        this.url = url;
    }

    public Url1Bean getUrl1() {
        return url1;
    }

    public void setUrl1(Url1Bean url1) {
        this.url1 = url1;
    }

    public int getJoox() {
        return joox;
    }

    public void setJoox(int joox) {
        this.joox = joox;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public List<?> getExtraData() {
        return extraData;
    }

    public void setExtraData(List<?> extraData) {
        this.extraData = extraData;
    }

    public static class Url1Bean {
    }

    public static class DataBean {
        /**
         * action : {"alert":2,"icons":8060,"msgdown":0,"msgfav":0,"msgid":14,"msgpay":6,"msgshare":0,"switch":636675}
         * album : {"id":852856,"mid":"001uqejs3d6EID","name":"哎呦，不错哦","subtitle":"","title":"哎呦，不错哦"}
         * bpm : 107
         * file : {"media_mid":"001Js78a40BZU6","size_128":4632445,"size_128mp3":4632445,"size_192aac":6989683,"size_192ogg":6708265,"size_24aac":904204,"size_320":11580808,"size_320mp3":11580808,"size_48aac":1844880,"size_96aac":3724969,"size_aac":6989683,"size_ape":31933476,"size_dts":0,"size_flac":32002118,"size_ogg":6708265,"size_try":568841,"try_begin":89941,"try_end":125441}
         * fnote : 4009
         * genre : 1
         * id : 101369814
         * index_album : 3
         * index_cd : 0
         * interval : 289
         * isonly : 1
         * ksong : {"id":0,"mid":"000bkVDn2cW5wU"}
         * label : 4611686018431582209
         * language : 0
         * mid : 001Js78a40BZU6
         * mv : {"id":303718,"vid":"c0015vx9gdg"}
         * name : 算什么男人
         * pay : {"pay_down":1,"pay_month":1,"pay_play":0,"pay_status":0,"price_album":2000,"price_track":200,"time_free":0}
         * singer : [{"id":4558,"mid":"0025NhlN2yWrP4","name":"周杰伦","title":"周杰伦","type":0,"uin":0}]
         * status : 0
         * subtitle :
         * time_public : 2014-12-26
         * title : 算什么男人
         * type : 0
         * url : http://stream6.qqmusic.qq.com/113369814.wma
         * volume : {"gain":-9.01099967956543,"lra":9.28600025177002,"peak":0.9900000095367432}
         */

        @SerializedName("action")
        private ActionBean action;
        @SerializedName("album")
        private AlbumBean album;
        @SerializedName("bpm")
        private int bpm;
        @SerializedName("file")
        private FileBean file;
        @SerializedName("fnote")
        private int fnote;
        @SerializedName("genre")
        private int genre;
        @SerializedName("id")
        private int id;
        @SerializedName("index_album")
        private int indexAlbum;
        @SerializedName("index_cd")
        private int indexCd;
        @SerializedName("interval")
        private int interval;
        @SerializedName("isonly")
        private int isonly;
        @SerializedName("ksong")
        private KsongBean ksong;
        @SerializedName("label")
        private String label;
        @SerializedName("language")
        private int language;
        @SerializedName("mid")
        private String mid;
        @SerializedName("mv")
        private MvBean mv;
        @SerializedName("name")
        private String nameX;
        @SerializedName("pay")
        private PayBean pay;
        @SerializedName("status")
        private int status;
        @SerializedName("subtitle")
        private String subtitle;
        @SerializedName("time_public")
        private String timePublic;
        @SerializedName("title")
        private String title;
        @SerializedName("type")
        private int type;
        @SerializedName("url")
        private String url;
        @SerializedName("volume")
        private VolumeBean volume;
        @SerializedName("singer")
        private List<SingerBean> singerX;

        public ActionBean getAction() {
            return action;
        }

        public void setAction(ActionBean action) {
            this.action = action;
        }

        public AlbumBean getAlbum() {
            return album;
        }

        public void setAlbum(AlbumBean album) {
            this.album = album;
        }

        public int getBpm() {
            return bpm;
        }

        public void setBpm(int bpm) {
            this.bpm = bpm;
        }

        public FileBean getFile() {
            return file;
        }

        public void setFile(FileBean file) {
            this.file = file;
        }

        public int getFnote() {
            return fnote;
        }

        public void setFnote(int fnote) {
            this.fnote = fnote;
        }

        public int getGenre() {
            return genre;
        }

        public void setGenre(int genre) {
            this.genre = genre;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getIndexAlbum() {
            return indexAlbum;
        }

        public void setIndexAlbum(int indexAlbum) {
            this.indexAlbum = indexAlbum;
        }

        public int getIndexCd() {
            return indexCd;
        }

        public void setIndexCd(int indexCd) {
            this.indexCd = indexCd;
        }

        public int getInterval() {
            return interval;
        }

        public void setInterval(int interval) {
            this.interval = interval;
        }

        public int getIsonly() {
            return isonly;
        }

        public void setIsonly(int isonly) {
            this.isonly = isonly;
        }

        public KsongBean getKsong() {
            return ksong;
        }

        public void setKsong(KsongBean ksong) {
            this.ksong = ksong;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public int getLanguage() {
            return language;
        }

        public void setLanguage(int language) {
            this.language = language;
        }

        public String getMid() {
            return mid;
        }

        public void setMid(String mid) {
            this.mid = mid;
        }

        public MvBean getMv() {
            return mv;
        }

        public void setMv(MvBean mv) {
            this.mv = mv;
        }

        public String getNameX() {
            return nameX;
        }

        public void setNameX(String nameX) {
            this.nameX = nameX;
        }

        public PayBean getPay() {
            return pay;
        }

        public void setPay(PayBean pay) {
            this.pay = pay;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getTimePublic() {
            return timePublic;
        }

        public void setTimePublic(String timePublic) {
            this.timePublic = timePublic;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public VolumeBean getVolume() {
            return volume;
        }

        public void setVolume(VolumeBean volume) {
            this.volume = volume;
        }

        public List<SingerBean> getSingerX() {
            return singerX;
        }

        public void setSingerX(List<SingerBean> singerX) {
            this.singerX = singerX;
        }

        public static class ActionBean {
            /**
             * alert : 2
             * icons : 8060
             * msgdown : 0
             * msgfav : 0
             * msgid : 14
             * msgpay : 6
             * msgshare : 0
             * switch : 636675
             */

            @SerializedName("alert")
            private int alert;
            @SerializedName("icons")
            private int icons;
            @SerializedName("msgdown")
            private int msgdown;
            @SerializedName("msgfav")
            private int msgfav;
            @SerializedName("msgid")
            private int msgid;
            @SerializedName("msgpay")
            private int msgpay;
            @SerializedName("msgshare")
            private int msgshare;
            @SerializedName("switch")
            private int switchX;

            public int getAlert() {
                return alert;
            }

            public void setAlert(int alert) {
                this.alert = alert;
            }

            public int getIcons() {
                return icons;
            }

            public void setIcons(int icons) {
                this.icons = icons;
            }

            public int getMsgdown() {
                return msgdown;
            }

            public void setMsgdown(int msgdown) {
                this.msgdown = msgdown;
            }

            public int getMsgfav() {
                return msgfav;
            }

            public void setMsgfav(int msgfav) {
                this.msgfav = msgfav;
            }

            public int getMsgid() {
                return msgid;
            }

            public void setMsgid(int msgid) {
                this.msgid = msgid;
            }

            public int getMsgpay() {
                return msgpay;
            }

            public void setMsgpay(int msgpay) {
                this.msgpay = msgpay;
            }

            public int getMsgshare() {
                return msgshare;
            }

            public void setMsgshare(int msgshare) {
                this.msgshare = msgshare;
            }

            public int getSwitchX() {
                return switchX;
            }

            public void setSwitchX(int switchX) {
                this.switchX = switchX;
            }
        }

        public static class AlbumBean {
            /**
             * id : 852856
             * mid : 001uqejs3d6EID
             * name : 哎呦，不错哦
             * subtitle :
             * title : 哎呦，不错哦
             */

            @SerializedName("id")
            private int id;
            @SerializedName("mid")
            private String mid;
            @SerializedName("name")
            private String nameX;
            @SerializedName("subtitle")
            private String subtitle;
            @SerializedName("title")
            private String title;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMid() {
                return mid;
            }

            public void setMid(String mid) {
                this.mid = mid;
            }

            public String getNameX() {
                return nameX;
            }

            public void setNameX(String nameX) {
                this.nameX = nameX;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class FileBean {
            /**
             * media_mid : 001Js78a40BZU6
             * size_128 : 4632445
             * size_128mp3 : 4632445
             * size_192aac : 6989683
             * size_192ogg : 6708265
             * size_24aac : 904204
             * size_320 : 11580808
             * size_320mp3 : 11580808
             * size_48aac : 1844880
             * size_96aac : 3724969
             * size_aac : 6989683
             * size_ape : 31933476
             * size_dts : 0
             * size_flac : 32002118
             * size_ogg : 6708265
             * size_try : 568841
             * try_begin : 89941
             * try_end : 125441
             */

            @SerializedName("media_mid")
            private String mediaMid;
            @SerializedName("size_128")
            private int size128;
            @SerializedName("size_128mp3")
            private int size128mp3;
            @SerializedName("size_192aac")
            private int size192aac;
            @SerializedName("size_192ogg")
            private int size192ogg;
            @SerializedName("size_24aac")
            private int size24aac;
            @SerializedName("size_320")
            private int size320;
            @SerializedName("size_320mp3")
            private int size320mp3;
            @SerializedName("size_48aac")
            private int size48aac;
            @SerializedName("size_96aac")
            private int size96aac;
            @SerializedName("size_aac")
            private int sizeAac;
            @SerializedName("size_ape")
            private int sizeApe;
            @SerializedName("size_dts")
            private int sizeDts;
            @SerializedName("size_flac")
            private int sizeFlac;
            @SerializedName("size_ogg")
            private int sizeOgg;
            @SerializedName("size_try")
            private int sizeTry;
            @SerializedName("try_begin")
            private int tryBegin;
            @SerializedName("try_end")
            private int tryEnd;

            public String getMediaMid() {
                return mediaMid;
            }

            public void setMediaMid(String mediaMid) {
                this.mediaMid = mediaMid;
            }

            public int getSize128() {
                return size128;
            }

            public void setSize128(int size128) {
                this.size128 = size128;
            }

            public int getSize128mp3() {
                return size128mp3;
            }

            public void setSize128mp3(int size128mp3) {
                this.size128mp3 = size128mp3;
            }

            public int getSize192aac() {
                return size192aac;
            }

            public void setSize192aac(int size192aac) {
                this.size192aac = size192aac;
            }

            public int getSize192ogg() {
                return size192ogg;
            }

            public void setSize192ogg(int size192ogg) {
                this.size192ogg = size192ogg;
            }

            public int getSize24aac() {
                return size24aac;
            }

            public void setSize24aac(int size24aac) {
                this.size24aac = size24aac;
            }

            public int getSize320() {
                return size320;
            }

            public void setSize320(int size320) {
                this.size320 = size320;
            }

            public int getSize320mp3() {
                return size320mp3;
            }

            public void setSize320mp3(int size320mp3) {
                this.size320mp3 = size320mp3;
            }

            public int getSize48aac() {
                return size48aac;
            }

            public void setSize48aac(int size48aac) {
                this.size48aac = size48aac;
            }

            public int getSize96aac() {
                return size96aac;
            }

            public void setSize96aac(int size96aac) {
                this.size96aac = size96aac;
            }

            public int getSizeAac() {
                return sizeAac;
            }

            public void setSizeAac(int sizeAac) {
                this.sizeAac = sizeAac;
            }

            public int getSizeApe() {
                return sizeApe;
            }

            public void setSizeApe(int sizeApe) {
                this.sizeApe = sizeApe;
            }

            public int getSizeDts() {
                return sizeDts;
            }

            public void setSizeDts(int sizeDts) {
                this.sizeDts = sizeDts;
            }

            public int getSizeFlac() {
                return sizeFlac;
            }

            public void setSizeFlac(int sizeFlac) {
                this.sizeFlac = sizeFlac;
            }

            public int getSizeOgg() {
                return sizeOgg;
            }

            public void setSizeOgg(int sizeOgg) {
                this.sizeOgg = sizeOgg;
            }

            public int getSizeTry() {
                return sizeTry;
            }

            public void setSizeTry(int sizeTry) {
                this.sizeTry = sizeTry;
            }

            public int getTryBegin() {
                return tryBegin;
            }

            public void setTryBegin(int tryBegin) {
                this.tryBegin = tryBegin;
            }

            public int getTryEnd() {
                return tryEnd;
            }

            public void setTryEnd(int tryEnd) {
                this.tryEnd = tryEnd;
            }
        }

        public static class KsongBean {
            /**
             * id : 0
             * mid : 000bkVDn2cW5wU
             */

            @SerializedName("id")
            private int id;
            @SerializedName("mid")
            private String mid;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMid() {
                return mid;
            }

            public void setMid(String mid) {
                this.mid = mid;
            }
        }

        public static class MvBean {
            /**
             * id : 303718
             * vid : c0015vx9gdg
             */

            @SerializedName("id")
            private int id;
            @SerializedName("vid")
            private String vid;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getVid() {
                return vid;
            }

            public void setVid(String vid) {
                this.vid = vid;
            }
        }

        public static class PayBean {
            /**
             * pay_down : 1
             * pay_month : 1
             * pay_play : 0
             * pay_status : 0
             * price_album : 2000
             * price_track : 200
             * time_free : 0
             */

            @SerializedName("pay_down")
            private int payDown;
            @SerializedName("pay_month")
            private int payMonth;
            @SerializedName("pay_play")
            private int payPlay;
            @SerializedName("pay_status")
            private int payStatus;
            @SerializedName("price_album")
            private int priceAlbum;
            @SerializedName("price_track")
            private int priceTrack;
            @SerializedName("time_free")
            private int timeFree;

            public int getPayDown() {
                return payDown;
            }

            public void setPayDown(int payDown) {
                this.payDown = payDown;
            }

            public int getPayMonth() {
                return payMonth;
            }

            public void setPayMonth(int payMonth) {
                this.payMonth = payMonth;
            }

            public int getPayPlay() {
                return payPlay;
            }

            public void setPayPlay(int payPlay) {
                this.payPlay = payPlay;
            }

            public int getPayStatus() {
                return payStatus;
            }

            public void setPayStatus(int payStatus) {
                this.payStatus = payStatus;
            }

            public int getPriceAlbum() {
                return priceAlbum;
            }

            public void setPriceAlbum(int priceAlbum) {
                this.priceAlbum = priceAlbum;
            }

            public int getPriceTrack() {
                return priceTrack;
            }

            public void setPriceTrack(int priceTrack) {
                this.priceTrack = priceTrack;
            }

            public int getTimeFree() {
                return timeFree;
            }

            public void setTimeFree(int timeFree) {
                this.timeFree = timeFree;
            }
        }

        public static class VolumeBean {
            /**
             * gain : -9.01099967956543
             * lra : 9.28600025177002
             * peak : 0.9900000095367432
             */

            @SerializedName("gain")
            private double gain;
            @SerializedName("lra")
            private double lra;
            @SerializedName("peak")
            private double peak;

            public double getGain() {
                return gain;
            }

            public void setGain(double gain) {
                this.gain = gain;
            }

            public double getLra() {
                return lra;
            }

            public void setLra(double lra) {
                this.lra = lra;
            }

            public double getPeak() {
                return peak;
            }

            public void setPeak(double peak) {
                this.peak = peak;
            }
        }

        public static class SingerBean {
            /**
             * id : 4558
             * mid : 0025NhlN2yWrP4
             * name : 周杰伦
             * title : 周杰伦
             * type : 0
             * uin : 0
             */

            @SerializedName("id")
            private int id;
            @SerializedName("mid")
            private String mid;
            @SerializedName("name")
            private String nameX;
            @SerializedName("title")
            private String title;
            @SerializedName("type")
            private int type;
            @SerializedName("uin")
            private int uin;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMid() {
                return mid;
            }

            public void setMid(String mid) {
                this.mid = mid;
            }

            public String getNameX() {
                return nameX;
            }

            public void setNameX(String nameX) {
                this.nameX = nameX;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUin() {
                return uin;
            }

            public void setUin(int uin) {
                this.uin = uin;
            }
        }
    }
}

