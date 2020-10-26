/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Berkay
 */ 

public class PROJE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> check=new ArrayList<String>();
       
        
        MainScreen ms=new MainScreen();
        ms.setVisible(true);
       
        
       /* Map map=new Map();
        map.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        map.pack();
        map.setTitle("GÜZERGAH");
        map.setSize(1600,818);
        map.setVisible(true);*/
        
        
        
        
                
       
    
        
        
        /*Node adana=new Node("Adana",1);                                                                  
        Node adiyaman=new Node("Adıyaman",2);
        Node afyonkarahisar=new Node("Afyonkarahisar",3);
        Node agri=new Node("Ağrı",4);
        Node amasya=new Node("Amasya",5);
        Node ankara=new Node("Ankara",6);
        Node antalya=new Node("Antalya",7);
        Node artvin=new Node("Artvin",8);
        Node aydin=new Node("Aydın",9);
        Node balikesir=new Node("Balıkesir",10);
        Node bilecik=new Node("Bilecik",11);
        Node bingöl=new Node("Bingöl",12);
        Node bitlis=new Node("Bitlis",13);
        Node bolu=new Node("Bolu",14);
        Node burdur=new Node("Burdur",15);
        Node bursa=new Node("Bursa",16);
        Node canakkale=new Node("Çanakkale",17);
        Node cankiri=new Node("Çankırı",18);
        Node corum=new Node("Çorum",19);
        Node denizli=new Node("Denizli",20);
        Node diyarbakir=new Node("Diyarbakır",21);
        Node edirne=new Node("Edirne",22);
        Node elazig=new Node("Elazığ",23);
        Node erzincan=new Node("Erzincan",24);
        Node erzurum=new Node("Erzurum",25);
        Node eskisehir=new Node("Eşkişehir",26);
        Node gaziantep=new Node("Gaziantep",27);
        Node giresun=new Node("Giresun",28);
        Node gumushane=new Node("Gümüşhane",29);
        Node hakkari=new Node("Hakkari",30);
        Node hatay=new Node("Hatay",31);
        Node isparta=new Node("Isparta",32);
        Node mersin=new Node("Mersin",33);
        Node istanbul=new Node("İstanbul",34);
        Node izmir=new Node("İzmir",35);
        Node kars=new Node("Kars",36);
        Node kastamonu=new Node("Kastamonu",37);
        Node kayseri=new Node("Kayseri",38);
        Node kirklareli=new Node("Kırklareli",39);
        Node kirsehir=new Node("Kırşehir",40);
        Node kocaeli=new Node("Kocaeli",41);
        Node konya=new Node("Konya",42);
        Node kutahya=new Node("Kütahya",43);
        Node malatya=new Node("Malatya",44);
        Node manisa=new Node("Manisa",45);
        Node kahramanmaras=new Node("Kahramanmaraş",46);
        Node mardin =new Node("Mardin",47);
        Node mugla=new Node("Muğla",48);
        Node mus=new Node("Muş",49);
        Node nevsehir=new Node("Nevşehir",50);
        Node nigde=new Node("Niğde",51);
        Node ordu=new Node("Ordu",52);
        Node rize=new Node("Rize",53);
        Node sakarya=new Node("Sakarya",54);
        Node samsun=new Node("Samsun",55);
        Node siirt=new Node("Siirt",56);
        Node sinop=new Node("Sinop",57);
        Node sivas=new Node("Sivas",58);
        Node tekirdag=new Node("Tekirdağ",59);
        Node tokat=new Node("Tokat",60);
        Node trabzon=new Node("Trabzon",61);
        Node tunceli=new Node("Tunceli",62);
        Node sanliurfa=new Node("Şanlıurfa",63);
        Node usak=new Node("Uşak",64);
        Node van=new Node("Van",65);
        Node yozgat=new Node("Yozgat",66);
        Node zonguldak=new Node("Zonguldak",67);
        Node aksaray=new Node("Aksaray",68);
        Node bayburt=new Node("Bayburt",69);
        Node karaman=new Node("Karaman",70);
        Node kirikkale=new Node("Kırıkkale",71);
        Node batman=new Node("Batman",72);
        Node sirnak=new Node("Şırnak",73);
        Node bartin=new Node("Bartın",74);
        Node ardahan=new Node("Ardahan",75);
        Node igdir=new Node("Iğdır",76);
        Node yalova=new Node("Yalova",77);
        Node karabuk=new Node("Karabük",78);
        Node kilis=new Node("Kilis",79);
        Node osmaniye=new Node("Osmaniye",80);
        Node duzce=new Node("Düzce",81);
        
        
        
        adana.addNeighbour(hatay);  adana.addNeighbour(osmaniye);  adana.addNeighbour(kahramanmaras);  adana.addNeighbour(kayseri);  adana.addNeighbour(nigde);  adana.addNeighbour(mersin);
        adana.addDistance(191);  adana.addDistance(87); adana.addDistance(192); adana.addDistance(335); adana.addDistance(207); adana.addDistance(69);
        
        adiyaman.addNeighbour(sanliurfa);  adana.addNeighbour(diyarbakir);  adana.addNeighbour(malatya);  adana.addNeighbour(kahramanmaras);  adana.addNeighbour(gaziantep);
        adiyaman.addDistance(112); adiyaman.addDistance(207); adiyaman.addDistance(187); adiyaman.addDistance(163); adiyaman.addDistance(150);
        
        afyonkarahisar.addNeighbour(isparta); afyonkarahisar.addNeighbour(konya); afyonkarahisar.addNeighbour(eskisehir); afyonkarahisar.addNeighbour(kutahya); afyonkarahisar.addNeighbour(usak); afyonkarahisar.addNeighbour(denizli); afyonkarahisar.addNeighbour(burdur);
        afyonkarahisar.addDistance(168); afyonkarahisar.addDistance(223); afyonkarahisar.addDistance(144); afyonkarahisar.addDistance(100); afyonkarahisar.addDistance(115); afyonkarahisar.addDistance(222); afyonkarahisar.addDistance(169);
        
        agri.addNeighbour(van); agri.addNeighbour(igdir); agri.addNeighbour(kars); agri.addNeighbour(erzurum); agri.addNeighbour(mus); agri.addNeighbour(bitlis);
        agri.addDistance(228); agri.addDistance(143); agri.addDistance(214); agri.addDistance(183); agri.addDistance(245); agri.addDistance(234);
        
        amasya.addNeighbour(yozgat); amasya.addNeighbour(tokat); amasya.addNeighbour(samsun); amasya.addNeighbour(corum);
        amasya.addDistance(200); amasya.addDistance(114); amasya.addDistance(131); amasya.addDistance(92);
        
        ankara.addNeighbour(konya); ankara.addNeighbour(aksaray); ankara.addNeighbour(kirsehir); ankara.addNeighbour(kirikkale); ankara.addNeighbour(cankiri); ankara.addNeighbour(bolu); ankara.addNeighbour(eskisehir);
        ankara.addDistance(258); ankara.addDistance(225); ankara.addDistance(184); ankara.addDistance(75); ankara.addDistance(130); ankara.addDistance(191); ankara.addDistance(233);
        
        antalya.addNeighbour(mersin); antalya.addNeighbour(karaman); antalya.addNeighbour(konya); antalya.addNeighbour(isparta); antalya.addNeighbour(burdur); antalya.addNeighbour(mugla);
        antalya.addDistance(466); antalya.addDistance(374); antalya.addDistance(322); antalya.addDistance(130); antalya.addDistance(122); antalya.addDistance(311);
        
        artvin.addNeighbour(rize); artvin.addNeighbour(erzurum); artvin.addNeighbour(ardahan);
        artvin.addDistance(161); artvin.addDistance(226); artvin.addDistance(116);
        
        aydin.addNeighbour(mugla); aydin.addNeighbour(denizli); aydin.addNeighbour(manisa); aydin.addNeighbour(izmir);
        aydin.addDistance(99); aydin.addDistance(126); aydin.addDistance(155); aydin.addDistance(126);
        
        balikesir.addNeighbour(izmir); balikesir.addNeighbour(manisa); balikesir.addNeighbour(kutahya); balikesir.addNeighbour(bursa); balikesir.addNeighbour(canakkale);
        balikesir.addDistance(176); balikesir.addDistance(141); balikesir.addDistance(228); balikesir.addDistance(151); balikesir.addDistance(198);
        
        bilecik.addNeighbour(kutahya); bilecik.addNeighbour(eskisehir); bilecik.addNeighbour(bolu); bilecik.addNeighbour(sakarya); bilecik.addNeighbour(bursa);
        bilecik.addDistance(112); bilecik.addDistance(83); bilecik.addDistance(213); bilecik.addDistance(99); bilecik.addDistance(94); 
        
        bingöl.addNeighbour(diyarbakir); bingöl.addNeighbour(mus); bingöl.addNeighbour(erzurum); bingöl.addNeighbour(erzincan); bingöl.addNeighbour(tunceli); bingöl.addNeighbour(elazig);
        bingöl.addDistance(141); bingöl.addDistance(111); bingöl.addDistance(177); bingöl.addDistance(275); bingöl.addDistance(144); bingöl.addDistance(144);
        
        bitlis.addNeighbour(siirt); bitlis.addNeighbour(van); bitlis.addNeighbour(agri); bitlis.addNeighbour(mus); bitlis.addNeighbour(batman);
        bitlis.addDistance(96); bitlis.addDistance(161); bitlis.addDistance(234); bitlis.addDistance(83); bitlis.addDistance(135);
        
        bolu.addNeighbour(eskisehir); bolu.addNeighbour(ankara); bolu.addNeighbour(cankiri); bolu.addNeighbour(zonguldak); bolu.addNeighbour(duzce); bolu.addNeighbour(sakarya); bolu.addNeighbour(bilecik); bolu.addNeighbour(karabuk);
        bolu.addDistance(291); bolu.addDistance(191); bolu.addDistance(233); bolu.addDistance(157); bolu.addDistance(45); bolu.addDistance(114); bolu.addDistance(213); bolu.addDistance(134);
        
        burdur.addNeighbour(mugla); burdur.addNeighbour(antalya); burdur.addNeighbour(isparta); burdur.addNeighbour(afyonkarahisar); burdur.addNeighbour(denizli);
        burdur.addDistance(241); burdur.addDistance(122); burdur.addDistance(51); burdur.addDistance(169); burdur.addDistance(150);
        
        bursa.addNeighbour(balikesir); bursa.addNeighbour(kutahya); bursa.addNeighbour(bilecik); bursa.addNeighbour(sakarya); bursa.addNeighbour(kocaeli); bursa.addNeighbour(yalova);
        bursa.addDistance(151); bursa.addDistance(177); bursa.addDistance(94); bursa.addDistance(157); bursa.addDistance(132); bursa.addDistance(69);
        
        canakkale.addNeighbour(balikesir); canakkale.addNeighbour(tekirdag); canakkale.addNeighbour(edirne);
        canakkale.addDistance(198); canakkale.addDistance(187); canakkale.addDistance(216);
        
        cankiri.addNeighbour(ankara); cankiri.addNeighbour(kirikkale); cankiri.addNeighbour(corum); cankiri.addNeighbour(kastamonu); cankiri.addNeighbour(bolu); cankiri.addNeighbour(karabuk);
        cankiri.addDistance(130); cankiri.addDistance(104); cankiri.addDistance(156); cankiri.addDistance(106); cankiri.addDistance(233); cankiri.addDistance(193);
        
        corum.addNeighbour(yozgat); corum.addNeighbour(amasya); corum.addNeighbour(samsun); corum.addNeighbour(sinop); corum.addNeighbour(kastamonu); corum.addNeighbour(cankiri); corum.addNeighbour(kirikkale);
        corum.addDistance(108); corum.addDistance(92); corum.addDistance(172); corum.addDistance(266); corum.addDistance(197); corum.addDistance(156); corum.addDistance(166);
        
        denizli.addNeighbour(mugla); denizli.addNeighbour(burdur); denizli.addNeighbour(afyonkarahisar); denizli.addNeighbour(usak); denizli.addNeighbour(manisa); denizli.addNeighbour(aydin);
        denizli.addDistance(145); denizli.addDistance(150); denizli.addDistance(222); denizli.addDistance(150); denizli.addDistance(208); denizli.addDistance(126);
        
        diyarbakir.addNeighbour(sanliurfa); diyarbakir.addNeighbour(mardin); diyarbakir.addNeighbour(batman); diyarbakir.addNeighbour(mus); diyarbakir.addNeighbour(bingöl); diyarbakir.addNeighbour(elazig); diyarbakir.addNeighbour(malatya); diyarbakir.addNeighbour(adiyaman);
        diyarbakir.addDistance(176); diyarbakir.addDistance(96); diyarbakir.addDistance(100); diyarbakir.addDistance(252); diyarbakir.addDistance(141); diyarbakir.addDistance(153); diyarbakir.addDistance(249); diyarbakir.addDistance(207); 
        
        edirne.addNeighbour(canakkale); edirne.addNeighbour(tekirdag); edirne.addNeighbour(kirklareli);
        edirne.addDistance(216); edirne.addDistance(140); edirne.addDistance(62);
                
        
        elazig.addNeighbour(diyarbakir); elazig.addNeighbour(bingöl); elazig.addNeighbour(tunceli); elazig.addNeighbour(erzincan); elazig.addNeighbour(malatya);
        elazig.addDistance(153); elazig.addDistance(144); elazig.addDistance(136); elazig.addDistance(267); elazig.addDistance(98);
        
        erzincan.addNeighbour(elazig); erzincan.addNeighbour(tunceli); erzincan.addNeighbour(bingöl); erzincan.addNeighbour(erzurum); erzincan.addNeighbour(bayburt); erzincan.addNeighbour(gumushane); erzincan.addNeighbour(giresun); erzincan.addNeighbour(sivas); erzincan.addNeighbour(malatya);
        erzincan.addDistance(267); erzincan.addDistance(131); erzincan.addDistance(275); erzincan.addDistance(190); erzincan.addDistance(155); erzincan.addDistance(133); erzincan.addDistance(295); erzincan.addDistance(248); erzincan.addDistance(363);
        
        erzurum.addNeighbour(bingöl); erzurum.addNeighbour(mus); erzurum.addNeighbour(agri); erzurum.addNeighbour(kars); erzurum.addNeighbour(ardahan); erzurum.addNeighbour(artvin); erzurum.addNeighbour(rize); erzurum.addNeighbour(bayburt); erzurum.addNeighbour(erzincan);
        erzurum.addDistance(177); erzurum.addDistance(266); erzurum.addDistance(183); erzurum.addDistance(203); erzurum.addDistance(233); erzurum.addDistance(226); erzurum.addDistance(259); erzurum.addDistance(125); erzurum.addDistance(190);
        
        eskisehir.addNeighbour(afyonkarahisar); eskisehir.addNeighbour(konya); eskisehir.addNeighbour(ankara); eskisehir.addNeighbour(bolu); eskisehir.addNeighbour(bilecik); eskisehir.addNeighbour(kutahya);
        eskisehir.addDistance(144); eskisehir.addDistance(338); eskisehir.addDistance(233); eskisehir.addDistance(291); eskisehir.addDistance(83); eskisehir.addDistance(78);
        
        gaziantep.addNeighbour(kilis); gaziantep.addNeighbour(sanliurfa); gaziantep.addNeighbour(adiyaman); gaziantep.addNeighbour(kahramanmaras); gaziantep.addNeighbour(osmaniye); gaziantep.addNeighbour(hatay);
        gaziantep.addDistance(64); gaziantep.addDistance(137); gaziantep.addDistance(150); gaziantep.addDistance(76); gaziantep.addDistance(125); gaziantep.addDistance(193);
        
        giresun.addNeighbour(gumushane); giresun.addNeighbour(trabzon); giresun.addNeighbour(erzincan); giresun.addNeighbour(sivas); giresun.addNeighbour(ordu);
        giresun.addDistance(162); giresun.addDistance(136); giresun.addDistance(295); giresun.addDistance(298); giresun.addDistance(44);
        
        gumushane.addNeighbour(erzincan); gumushane.addNeighbour(bayburt); gumushane.addNeighbour(trabzon); gumushane.addNeighbour(giresun);
        gumushane.addDistance(133); gumushane.addDistance(78); gumushane.addDistance(100); gumushane.addDistance(162);
        
        hakkari.addNeighbour(van); hakkari.addNeighbour(sirnak);
        hakkari.addDistance(197); hakkari.addDistance(189);
        
        hatay.addNeighbour(gaziantep); hatay.addNeighbour(osmaniye); hatay.addNeighbour(adana);
        hatay.addDistance(193); hatay.addDistance(129); hatay.addDistance(191);
        
        isparta.addNeighbour(antalya); isparta.addNeighbour(konya); isparta.addNeighbour(afyonkarahisar); isparta.addNeighbour(burdur);
        isparta.addDistance(130); isparta.addDistance(263); isparta.addDistance(168); isparta.addDistance(51);
        
        mersin.addNeighbour(adana); mersin.addNeighbour(nigde); mersin.addNeighbour(konya); mersin.addNeighbour(karaman); mersin.addNeighbour(antalya);
        mersin.addDistance(69); mersin.addDistance(200); mersin.addDistance(348); mersin.addDistance(235); mersin.addDistance(466);
        
        istanbul.addNeighbour(kocaeli); istanbul.addNeighbour(tekirdag);
        istanbul.addDistance(111); istanbul.addDistance(131);
        
        izmir.addNeighbour(aydin); izmir.addNeighbour(manisa); izmir.addNeighbour(balikesir);
        izmir.addDistance(126); izmir.addDistance(35); izmir.addDistance(176);
        
        kars.addNeighbour(agri); kars.addNeighbour(igdir); kars.addNeighbour(ardahan); kars.addNeighbour(erzurum);
        kars.addDistance(214); kars.addDistance(140); kars.addDistance(94); kars.addDistance(203);
        
        kastamonu.addNeighbour(corum); kastamonu.addNeighbour(sinop); kastamonu.addNeighbour(cankiri); kastamonu.addNeighbour(bartin); kastamonu.addNeighbour(karabuk);
        kastamonu.addDistance(197); kastamonu.addDistance(183); kastamonu.addDistance(106); kastamonu.addDistance(183); kastamonu.addDistance(114);
        
        kayseri.addNeighbour(adana); kayseri.addNeighbour(kahramanmaras); kayseri.addNeighbour(sivas); kayseri.addNeighbour(yozgat); kayseri.addNeighbour(nevsehir); kayseri.addNeighbour(nigde);
        kayseri.addDistance(335); kayseri.addDistance(261); kayseri.addDistance(194); kayseri.addDistance(197); kayseri.addDistance(81); kayseri.addDistance(128);
        
        kirklareli.addNeighbour(edirne); kirklareli.addNeighbour(tekirdag);
        kirklareli.addDistance(62); kirklareli.addDistance(121);
        
        kirsehir.addNeighbour(nevsehir); kirsehir.addNeighbour(yozgat); kirsehir.addNeighbour(kirikkale); kirsehir.addNeighbour(ankara); kirsehir.addNeighbour(aksaray);
        kirsehir.addDistance(91); kirsehir.addDistance(112); kirsehir.addDistance(113); kirsehir.addDistance(184); kirsehir.addDistance(110);
        
        kocaeli.addNeighbour(yalova); kocaeli.addNeighbour(istanbul); kocaeli.addNeighbour(bursa); kocaeli.addNeighbour(sakarya);
        kocaeli.addDistance(65); kocaeli.addDistance(111); kocaeli.addDistance(132); kocaeli.addDistance(37);
        
        konya.addNeighbour(antalya); konya.addNeighbour(karaman); konya.addNeighbour(mersin); konya.addNeighbour(nigde); konya.addNeighbour(aksaray); konya.addNeighbour(ankara); konya.addNeighbour(eskisehir); konya.addNeighbour(afyonkarahisar); konya.addNeighbour(isparta);
        konya.addDistance(322); konya.addDistance(119); konya.addDistance(348); konya.addDistance(242); konya.addDistance(148); konya.addDistance(258); konya.addDistance(338); konya.addDistance(223); konya.addDistance(263);
        
        kutahya.addNeighbour(manisa); kutahya.addNeighbour(usak); kutahya.addNeighbour(afyonkarahisar); kutahya.addNeighbour(eskisehir); kutahya.addNeighbour(bilecik); kutahya.addNeighbour(bursa); kutahya.addNeighbour(balikesir);
        kutahya.addDistance(316); kutahya.addDistance(139); kutahya.addDistance(100); kutahya.addDistance(78); kutahya.addDistance(112); kutahya.addDistance(177); kutahya.addDistance(228);
        
        malatya.addNeighbour(kahramanmaras); malatya.addNeighbour(adiyaman); malatya.addNeighbour(diyarbakir); malatya.addNeighbour(elazig); malatya.addNeighbour(erzincan); malatya.addNeighbour(sivas);
        malatya.addDistance(224); malatya.addDistance(187); malatya.addDistance(249); malatya.addDistance(98); malatya.addDistance(363); malatya.addDistance(243);
        
        manisa.addNeighbour(izmir); manisa.addNeighbour(aydin); manisa.addNeighbour(denizli); manisa.addNeighbour(usak); manisa.addNeighbour(kutahya); manisa.addNeighbour(balikesir);
        manisa.addDistance(35); manisa.addDistance(155); manisa.addDistance(208); manisa.addDistance(195); manisa.addDistance(316); manisa.addDistance(141);
        
        kahramanmaras.addNeighbour(gaziantep); kahramanmaras.addNeighbour(adiyaman); kahramanmaras.addNeighbour(malatya); kahramanmaras.addNeighbour(sivas); kahramanmaras.addNeighbour(kayseri); kahramanmaras.addNeighbour(adana); kahramanmaras.addNeighbour(osmaniye);
        kahramanmaras.addDistance(76); kahramanmaras.addDistance(163); kahramanmaras.addDistance(224); kahramanmaras.addDistance(327); kahramanmaras.addDistance(261); kahramanmaras.addDistance(192); kahramanmaras.addDistance(105);
        
        mardin.addNeighbour(sanliurfa); mardin.addNeighbour(diyarbakir); mardin.addNeighbour(batman); mardin.addNeighbour(siirt); mardin.addNeighbour(sirnak);
        mardin.addDistance(188); mardin.addDistance(96); mardin.addDistance(150); mardin.addDistance(227); mardin.addDistance(197);
        
        mugla.addNeighbour(antalya); mugla.addNeighbour(burdur); mugla.addNeighbour(denizli); mugla.addNeighbour(aydin);
        mugla.addDistance(311); mugla.addDistance(241); mugla.addDistance(145); mugla.addDistance(99);
        
        mus.addNeighbour(diyarbakir); mus.addNeighbour(batman); mus.addNeighbour(bitlis); mus.addNeighbour(agri); mus.addNeighbour(erzurum); mus.addNeighbour(bingöl);
        mus.addDistance(252); mus.addDistance(218); mus.addDistance(83); mus.addDistance(245); mus.addDistance(266); mus.addDistance(111);
        
        
        nevsehir.addNeighbour(nigde); nevsehir.addNeighbour(kayseri); nevsehir.addNeighbour(yozgat); nevsehir.addNeighbour(kirsehir); nevsehir.addNeighbour(aksaray);
        nevsehir.addDistance(82); nevsehir.addDistance(81); nevsehir.addDistance(203); nevsehir.addDistance(91); nevsehir.addDistance(75);
        
        nigde.addNeighbour(nevsehir); nigde.addNeighbour(kayseri); nigde.addNeighbour(adana); nigde.addNeighbour(mersin); nigde.addNeighbour(konya); nigde.addNeighbour(aksaray);
        nigde.addDistance(82); nigde.addDistance(128); nigde.addDistance(207); nigde.addDistance(200); nigde.addDistance(242); nigde.addDistance(122);
        
        ordu.addNeighbour(samsun); ordu.addNeighbour(tokat); ordu.addNeighbour(giresun); ordu.addNeighbour(sivas);
        ordu.addDistance(150); ordu.addDistance(216); ordu.addDistance(44); ordu.addDistance(314);
        
        rize.addNeighbour(artvin); rize.addNeighbour(erzurum); rize.addNeighbour(bayburt); rize.addNeighbour(trabzon);
        rize.addDistance(161); rize.addDistance(259); rize.addDistance(253); rize.addDistance(75);
        
        sakarya.addNeighbour(duzce); sakarya.addNeighbour(bolu); sakarya.addNeighbour(bilecik); sakarya.addNeighbour(bursa); sakarya.addNeighbour(kocaeli);
        sakarya.addDistance(69); sakarya.addDistance(114); sakarya.addDistance(99); sakarya.addDistance(157); sakarya.addDistance(37);
        
        samsun.addNeighbour(ordu); samsun.addNeighbour(tokat); samsun.addNeighbour(amasya); samsun.addNeighbour(corum); samsun.addNeighbour(sinop);
        samsun.addDistance(150); samsun.addDistance(229); samsun.addDistance(131); samsun.addDistance(172); samsun.addDistance(155);
        
        siirt.addNeighbour(van); siirt.addNeighbour(bitlis); siirt.addNeighbour(batman); siirt.addNeighbour(mardin); siirt.addNeighbour(sirnak);
        siirt.addDistance(257); siirt.addDistance(96); siirt.addDistance(86); siirt.addDistance(227); siirt.addDistance(100);
                
        
        sinop.addNeighbour(samsun); sinop.addNeighbour(corum); sinop.addNeighbour(kastamonu);
        sinop.addDistance(155); sinop.addDistance(266); sinop.addDistance(183);
        
        sivas.addNeighbour(kayseri); sivas.addNeighbour(kahramanmaras); sivas.addNeighbour(malatya); sivas.addNeighbour(erzincan); sivas.addNeighbour(giresun); sivas.addNeighbour(ordu); sivas.addNeighbour(tokat); sivas.addNeighbour(yozgat);
        sivas.addDistance(194); sivas.addDistance(327); sivas.addDistance(243); sivas.addDistance(248); sivas.addDistance(298); sivas.addDistance(314); sivas.addDistance(108); sivas.addDistance(224);
        
        tekirdag.addNeighbour(istanbul); tekirdag.addNeighbour(kirklareli); tekirdag.addNeighbour(edirne); tekirdag.addNeighbour(canakkale);
        tekirdag.addDistance(131); tekirdag.addDistance(121); tekirdag.addDistance(140); tekirdag.addDistance(187);
        
        tokat.addNeighbour(sivas); tokat.addNeighbour(ordu); tokat.addNeighbour(samsun); tokat.addNeighbour(amasya); tokat.addNeighbour(yozgat);
        tokat.addDistance(108); tokat.addDistance(216); tokat.addDistance(229); tokat.addDistance(114); tokat.addDistance(205);
        
        trabzon.addNeighbour(rize); trabzon.addNeighbour(bayburt); trabzon.addNeighbour(gumushane); trabzon.addNeighbour(giresun);
        trabzon.addDistance(75); trabzon.addDistance(178); trabzon.addDistance(100); trabzon.addDistance(136);
        
        tunceli.addNeighbour(elazig); tunceli.addNeighbour(bingöl); tunceli.addNeighbour(erzincan);
        tunceli.addDistance(136); tunceli.addDistance(144); tunceli.addDistance(131);
        
        sanliurfa.addNeighbour(gaziantep); sanliurfa.addNeighbour(adiyaman); sanliurfa.addNeighbour(diyarbakir); sanliurfa.addNeighbour(mardin);
        sanliurfa.addDistance(137); sanliurfa.addDistance(112); sanliurfa.addDistance(176); sanliurfa.addDistance(188);
        
        usak.addNeighbour(manisa); usak.addNeighbour(denizli); usak.addNeighbour(afyonkarahisar); usak.addNeighbour(kutahya);
        usak.addDistance(195); usak.addDistance(150); usak.addDistance(115); usak.addDistance(139);
        
        van.addNeighbour(hakkari); van.addNeighbour(sirnak); van.addNeighbour(siirt); van.addNeighbour(bitlis); van.addNeighbour(agri);
        van.addDistance(197); van.addDistance(357); van.addDistance(257); van.addDistance(161); van.addDistance(228); 
        
        yozgat.addNeighbour(kayseri); yozgat.addNeighbour(sivas); yozgat.addNeighbour(tokat); yozgat.addNeighbour(amasya); yozgat.addNeighbour(corum); yozgat.addNeighbour(kirikkale); yozgat.addNeighbour(kirsehir); yozgat.addNeighbour(nevsehir);
        yozgat.addDistance(197); yozgat.addDistance(224); yozgat.addDistance(205); yozgat.addDistance(200); yozgat.addDistance(108); yozgat.addDistance(140); yozgat.addDistance(112); yozgat.addDistance(203);
        
        zonguldak.addNeighbour(bartin); zonguldak.addNeighbour(bolu); zonguldak.addNeighbour(duzce); zonguldak.addNeighbour(karabuk);
        zonguldak.addDistance(87); zonguldak.addDistance(157); zonguldak.addDistance(113); zonguldak.addDistance(100);
        
        aksaray.addNeighbour(nigde); aksaray.addNeighbour(nevsehir); aksaray.addNeighbour(kirsehir); aksaray.addNeighbour(ankara); aksaray.addNeighbour(konya);
        aksaray.addDistance(122); aksaray.addDistance(75); aksaray.addDistance(110); aksaray.addDistance(225); aksaray.addDistance(148);
        
        bayburt.addNeighbour(erzincan); bayburt.addNeighbour(erzurum); bayburt.addNeighbour(rize); bayburt.addNeighbour(trabzon); bayburt.addNeighbour(gumushane);
        bayburt.addDistance(155); bayburt.addDistance(125); bayburt.addDistance(253); bayburt.addDistance(178); bayburt.addDistance(78);
        
        karaman.addNeighbour(mersin); karaman.addNeighbour(konya); karaman.addNeighbour(antalya);
        karaman.addDistance(235); karaman.addDistance(119); karaman.addDistance(374);
        
        kirikkale.addNeighbour(kirsehir); kirikkale.addNeighbour(yozgat); kirikkale.addNeighbour(corum); kirikkale.addNeighbour(cankiri); kirikkale.addNeighbour(ankara);
        kirikkale.addDistance(113); kirikkale.addDistance(140); kirikkale.addDistance(166); kirikkale.addDistance(104); kirikkale.addDistance(75); 
        
        
        batman.addNeighbour(mardin); batman.addNeighbour(siirt); batman.addNeighbour(bitlis); batman.addNeighbour(mus); batman.addNeighbour(diyarbakir);
        batman.addDistance(150); batman.addDistance(86); batman.addDistance(135); batman.addDistance(218); batman.addDistance(100);
        
        sirnak.addNeighbour(mardin); sirnak.addNeighbour(siirt); sirnak.addNeighbour(van); sirnak.addNeighbour(hakkari);
        sirnak.addDistance(197); sirnak.addDistance(100); sirnak.addDistance(357); sirnak.addDistance(189);
        
        bartin.addNeighbour(kastamonu); bartin.addNeighbour(zonguldak); bartin.addNeighbour(karabuk);
        bartin.addDistance(183); bartin.addDistance(87); bartin.addDistance(89);
        
        ardahan.addNeighbour(kars); ardahan.addNeighbour(erzurum); ardahan.addNeighbour(artvin);
        ardahan.addDistance(94); ardahan.addDistance(233); ardahan.addDistance(116);
        
        igdir.addNeighbour(agri); igdir.addNeighbour(kars);
        igdir.addDistance(143); igdir.addDistance(140);
        
        yalova.addNeighbour(kocaeli); yalova.addNeighbour(bursa);
        yalova.addDistance(65); yalova.addDistance(69);
        
        karabuk.addNeighbour(zonguldak); karabuk.addNeighbour(bartin); karabuk.addNeighbour(kastamonu); karabuk.addNeighbour(cankiri); karabuk.addNeighbour(bolu);
        karabuk.addDistance(100); karabuk.addDistance(89); karabuk.addDistance(114); karabuk.addDistance(193); karabuk.addDistance(134);
        
        kilis.addNeighbour(gaziantep);
        kilis.addDistance(64);
        
        osmaniye.addNeighbour(gaziantep); osmaniye.addNeighbour(kahramanmaras); osmaniye.addNeighbour(adana); osmaniye.addNeighbour(hatay);
        osmaniye.addDistance(125); osmaniye.addDistance(105); osmaniye.addDistance(87); osmaniye.addDistance(129);
        
        duzce.addNeighbour(zonguldak); duzce.addNeighbour(bolu); duzce.addNeighbour(sakarya);
        duzce.addDistance(113); duzce.addDistance(45); duzce.addDistance(69);
        
        
        
       Graph graph =new Graph();
       
       
       graph.createGraph(adana);
       graph.createGraph(adiyaman);
       graph.createGraph(afyonkarahisar);
       graph.createGraph(agri);
       graph.createGraph(amasya);
       graph.createGraph(ankara);
       graph.createGraph(antalya);
       graph.createGraph(artvin);
       graph.createGraph(aydin);
       graph.createGraph(balikesir);
       graph.createGraph(bilecik);
       graph.createGraph(bingöl);
       graph.createGraph(bitlis);
       graph.createGraph(bolu);
       graph.createGraph(burdur);
       graph.createGraph(bursa);
       graph.createGraph(canakkale);
       graph.createGraph(cankiri);
       graph.createGraph(corum);
       graph.createGraph(denizli);
       graph.createGraph(diyarbakir);
       graph.createGraph(edirne);
       graph.createGraph(elazig);
       graph.createGraph(erzincan);
       graph.createGraph(erzurum);
       graph.createGraph(eskisehir);
       graph.createGraph(gaziantep);
       graph.createGraph(giresun);
       graph.createGraph(gumushane);
       graph.createGraph(hakkari);
       graph.createGraph(hatay);
       graph.createGraph(isparta);
       graph.createGraph(mersin);
       graph.createGraph(istanbul);
       graph.createGraph(izmir);
       graph.createGraph(kars);
       graph.createGraph(kastamonu);
       graph.createGraph(kayseri);
       graph.createGraph(kirklareli);
       graph.createGraph(kirsehir);
       graph.createGraph(kocaeli);
       graph.createGraph(konya);
       graph.createGraph(kutahya);
       graph.createGraph(malatya);
       graph.createGraph(manisa);
       graph.createGraph(kahramanmaras);
       graph.createGraph(mardin);
       graph.createGraph(mugla);
       graph.createGraph(mus);
       graph.createGraph(nevsehir);
       graph.createGraph(nigde);
       graph.createGraph(ordu);
       graph.createGraph(rize);
       graph.createGraph(sakarya);
       graph.createGraph(samsun);
       graph.createGraph(siirt);
       graph.createGraph(sinop);
       graph.createGraph(sivas);
       graph.createGraph(tekirdag);
       graph.createGraph(tokat);
       graph.createGraph(trabzon);
       graph.createGraph(tunceli);
       graph.createGraph(sanliurfa);
       graph.createGraph(usak);
       graph.createGraph(van);
       graph.createGraph(yozgat);
       graph.createGraph(zonguldak);
       graph.createGraph(aksaray);
       graph.createGraph(bayburt);
       graph.createGraph(karaman);
       graph.createGraph(kirikkale);
       graph.createGraph(batman);
       graph.createGraph(sirnak);
       graph.createGraph(bartin);
       graph.createGraph(ardahan);
       graph.createGraph(igdir);
       graph.createGraph(yalova);
       graph.createGraph(karabuk);
       graph.createGraph(kilis);
       graph.createGraph(osmaniye);
       graph.createGraph(duzce);*/
       
       
        
       
       
       
      
        
       
        
        
        
        

        
        
        
    }
  
}
