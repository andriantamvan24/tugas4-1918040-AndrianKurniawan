package com.example.projectrecycleviewneww;

import java.util.ArrayList;

public class MediaData {
    private static String [] mediaName ={
            "Instagram",
            "Twitter",
            "Facebook",
            "Telegram",
            "WhatsApp",
            "Google",
            "Mozila",
            "UC Browser",
            "Line",
            "Tiktok",
            "Youtube",
            "Snapchat"

    };

    private static String [] mediaDetail = {
            "Instagram adalah sebuah aplikasi berbagi foto dan video",
            "Twitter adalah Layanan bagi teman dan keluarga untuk berkomunikasi dan tetap terhubung",
            "Facebook adalah Situs jejaring sosial/networking yang dapat berinteraksi sosial dan berbagi informasi",
            "Telegram adalah aplikasi pengirim pesan instan multiplatform bersifat gratis",
            "Whatsapp adalah Aplikasi pesan untuk ponsel cerdas atau lintas platform yang memungkinkan bertukar pesan tanpa pulsa",
            "Google adalah Sebuah gudang informasi tak terbatas diinternet",
            "Mozila adalah sebuah aplikasi yang berisi informasi yang tak terbatas",
            "UC browser adalah aplikasi penjelajah web untuk telepon genggam",
            "Line adalah sebuah aplikasi pengirim pesan instan gratis yang dapat digunakan berbagai perangkat lunak",
            "Tiktok adalah sebuah jaringan sosial dan platform video musik",
            "Youtube adalah sebuah situs web berbagi video",
            "Snapchat adalah sebuah aplikasi pesan foto"
    };

    private static int [] mediaImage = {
            R.drawable.instragram,
            R.drawable.twiter,
            R.drawable.facebook,
            R.drawable.telegram,
            R.drawable.whatsapp,
            R.drawable.google,
            R.drawable.mozila,
            R.drawable.uc,
            R.drawable.line,
            R.drawable.tiktok,
            R.drawable.youtube,
            R.drawable.snapchat

    };

    static ArrayList<Media> getListData() {
        ArrayList<Media> list = new ArrayList<>();
        for (int position = 0; position < mediaName.length; position++) {
            Media media = new Media();
            media.setName(mediaName[position]);
            media.setDetail(mediaDetail[position]);
            media.setPhoto(mediaImage[position]);
            list.add(media);
        }
        return  list;
    }

}
