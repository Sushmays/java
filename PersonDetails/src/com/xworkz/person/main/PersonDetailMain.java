package com.xworkz.person.main;

import com.xworkz.person.dto.PersonDTO;
import com.xworkz.person.repository.PersonRepository;
import com.xworkz.person.repository.PersonRepositoryImpl;
import com.xworkz.person.service.PersonService;
import com.xworkz.person.service.PersonServiceImpl;

public class PersonDetailMain {

	public static void main(String[] args) {
		
		PersonDTO dto=new PersonDTO(1,"Prem","prem@gmail.com",9632915011L,"Male","Diploma",false,true,"BMTC",30000,27,3,"Bengaluru","Maddur","Karnataka", "India",551995007654L,"LAEPP2772F",true,1234567890981L);
		PersonDTO dto1=new PersonDTO(2,"Ranjith","ranjith@gmail.com",7406153703L,"Male","B-com",true, true,"Girish export",32000,29,8,"Nagara","Maddur","Karnataka", "India",561985007654L,"LAEPP2992F",true,1004567660981L);
		PersonDTO dto2=new PersonDTO(3,"Nandan","nandu@gmail.com",8197623032L,"Male","ITI",false, true,"Solar",25000,24,4,"Ramanagara","Maddur","Karnataka", "India",551995247654L,"LAEPP2442F",true,4243567890981L);
		PersonDTO dto3=new PersonDTO(4,"Sushma","sushma@gmail.com",9538963993L,"Female","BE",false, true,"AOS",15000,25,2,"Harohalli","Kanakapura","Karnataka", "India",580018580437L,"LAEPP2142F",true,2234555890981L);
		PersonDTO dto4=new PersonDTO(5,"Siddegowda","sgowda@gmail.com",8105524108L,"Male","PU",true, true,"AG",31000,60,3,"Yaladahalii","Maddur","Karnataka", "India",580016580437L,"LAEPP2272F",true,1234566890981L);
		PersonDTO dto5=new PersonDTO(6,"Manjula","manju@gmail.com",9731388166L,"Female","PU",true, true,"HW",32000,48,3,"Yaladahalii","Maddur","Karnataka", "India",580118580437L,"LAEPP2372F",true,1334367890981L);
		PersonDTO dto6=new PersonDTO(7,"Nandish","nandi@gmail.com",8884344246L,"Male","ITI",false, true,"BEL",30300,31,3,"AC Halli","Maddur","Karnataka", "India",580218580437L,"LAEPP2472F",true,1234566890981L);
		PersonDTO dto7=new PersonDTO(8,"Sathish","sathi@gmail.com",8632915011L,"Male","Diploma",false, true,"Infotech",300000,35,3,"Bengaluru","Bengaluru","Karnataka", "India",580318580437L,"LAEPP2572F",true,1274547890981L);
		PersonDTO dto8=new PersonDTO(9,"Abhi","abhi@gmail.com",9686964613L,"Male","ITI",true, true,"tech",60000,32,3,"Bengaluru","Bengaluru","Karnataka", "India",580418580437L,"LAEPP2672F",true,1264567830981L);
		PersonDTO dto9=new PersonDTO(10,"Sunil","suni@gmail.com",9639215011L,"Male","SSLC",false, true,"Mahindra",40000,24,3,"Bengaluru","Bengaluru","Karnataka", "India",580518580437L,"LAEPP2972F",true,1254517890981L);
		PersonDTO dto10=new PersonDTO(11,"Sahana","saanu@gmail.com",7632915011L,"Female","MCA",false, true,"Sujuki",70000,22,3,"Mysore","Mysore","Karnataka", "India",580618580437L,"LAEPP1772F",true,1240567890981L);
		PersonDTO dto11=new PersonDTO(12,"Sanju","sanju@gmail.com",8932915011L,"Female","BSC",true, true,"AOS",80000,30,3,"Bengaluru","Bengaluru","Karnataka", "India",580718580437L,"LAEPP3772F",true,2124567890981L);
		PersonDTO dto12=new PersonDTO(13,"Shankar","shankar@gmail.com",9362915011L,"Male","BBA",true, true,"Info",90000,41,3,"Bengaluru","Bengaluru","Karnataka", "India",580818580437L,"LAEPP4772F",true,8214567890981L);
		PersonDTO dto13=new PersonDTO(14,"Sheela","sheela@gmail.com",9633915011L,"Female","PUC",true, true,"TCS",10000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",589018580437L,"LAEPP5772F",true,7230567890981L);
		PersonDTO dto14=new PersonDTO(15,"Prathiksha","prathi@gmail.com",8634915011L,"Female","Diploma",false, true,"BMTC",30500,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551095007654L,"LAEPP6772F",true,6234566890981L);
		PersonDTO dto15=new PersonDTO(16,"Keerthi","keerthi@gmail.com",9236915011L,"Female","BA",true, true,"Tudip",30000,43,3,"Bengaluru","Bengaluru","Karnataka", "India",551195007654L,"LAEPP7772F",true,4234565890981L);
		PersonDTO dto16=new PersonDTO(17,"Hemanth","hemu@gmail.com",9326915011L,"Male","CA",false, true,"Hp",35000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551295007654L,"LAEPP8772F",true,5234564890981L);
		PersonDTO dto17=new PersonDTO(18,"Divya","divya@gmail.com",9632519011L,"Female","Diploma",false, true,"Capgemin",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551395007654L,"LAEPP9772F",true,2334563890981L);
		PersonDTO dto18=new PersonDTO(19,"Vidya","viddu@gmail.com",9632159011L,"Female","BE",false, true,"AOS",38000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551495007654L,"LAEPP2702F",true,2234562890981L);
		PersonDTO dto19=new PersonDTO(20,"Deepthi","deepu@gmail.com",9632195011L,"Female","Mtech",false, true,"Genpact",40000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551955007654L,"LAEPP2712F",true,1250561890981L);
		PersonDTO dto20=new PersonDTO(21,"Nagendra","nagu@gmail.com",9632591011L,"Male","Diploma",false, true,"Emposys",42000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551695007654L,"LAEPP2722F",true,1249560890981L);
		PersonDTO dto21=new PersonDTO(22,"Latha","latha@gmail.com",9639215011L,"Female","BTech",false, true,"ColorToken",45000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551795007654L,"LAEPP2732F",true,1248567890911L);
		PersonDTO dto22=new PersonDTO(23,"Yogesh","yogi@gmail.com",9631925011L,"Male","Diploma",false, true,"Incedo",60000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551985007654L,"LAEPP2742F",true,1247567890921L);
		PersonDTO dto23=new PersonDTO(24,"Arpitha","arpi@gmail.com",9619915011L,"Female","Degree",false, true,"GlobalLogic",58000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",651999007654L,"LAEPP2752F",true,1246567890931L);
		PersonDTO dto24=new PersonDTO(25,"Sushmitha","sush@gmail.com",9639915011L,"Female","Bcom",false, true,"NEC",65000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551220007654L,"LAEPP2762F",true,1245567890941L);
		PersonDTO dto25=new PersonDTO(26,"Kanasu","kanasu@gmail.com",9634915011L,"Female","Diploma",false, true,"Indiamart",55000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995447654L,"LAEPP2770F",true,1244567890951L);
		PersonDTO dto26=new PersonDTO(27,"Srujana","sruju@gmail.com",9636915011L,"Female","BBA",false, true,"ReddyExport",25000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995557654L,"LAEPP2779F",true,1243567890961L);
		PersonDTO dto27=new PersonDTO(28,"Sinchana","sinchu@gmail.com",9682915011L,"Female","BA",false, true,"Mahindra",18000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995777654L,"LAEPP2778F",true,2021567890971L);
		PersonDTO dto28=new PersonDTO(29,"Sindhu","sindhu@gmail.com",9632935011L,"Female","MBA",false, true,"BMTC",300000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995077654L,"LAEPP2777F",true,3234567890991L);
		PersonDTO dto29=new PersonDTO(30,"Sagar","sagu@gmail.com",9632912011L,"Male","CA",false, true,"BMTC",3000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995006654L,"LAEPP2776F",true,2234567890901L);
		PersonDTO dto30=new PersonDTO(31,"Lokesh","loki@gmail.com",9632915211L,"Male","Diploma",false, true,"BMTC",630000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551992007654L,"LAEPP2775F",true,1934567890981L);
		PersonDTO dto31=new PersonDTO(32,"Siddaraju","siddu@gmail.com",9632915061L,"Male","MCA",true, true,"Mahindra",90000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551195007654L,"LAEPP2774F",true,1834567890981L);
		PersonDTO dto32=new PersonDTO(33,"Shivu","shivu@gmail.com",9632915017L,"Male","BCA",false, true,"KSRTC",96000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551935007654L,"LAEPP2773F",true,1734567890981L);
		PersonDTO dto33=new PersonDTO(34,"Raghu","raghu@gmail.com",9632925011L,"Male","Diploma",true, true,"BMTC",92000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551905007654L,"LAEPP2700F",true,1634567890981L);
		PersonDTO dto34=new PersonDTO(35,"Rajesh","rajesh@gmail.com",9632955011L,"Male","BE",false, true,"ReddyExport",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551295007654L,"LAEAP2772F",true,1534567890981L);
		PersonDTO dto35=new PersonDTO(36,"Prathik","prathi@gmail.com",9632965011L,"Male","BE",false, true,"KSRTC",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995907654L,"LAESP2772F",true,1434567890981L);
		PersonDTO dto36=new PersonDTO(37,"Vivek","vivek@gmail.com",9632915041L,"Male","Diploma",true, true,"BMTC",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551992207654L,"LAEDP2772F",true,1334567890981L);
		PersonDTO dto37=new PersonDTO(38,"Kanchana","kanchu@gmail.com",9632975011L,"Female","MTech",true, true,"Mahindra",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007654L,"LAEFP2772F",true,1134567890981L);
		PersonDTO dto38=new PersonDTO(39,"Keerthana","keeru@gmail.com",9632905011L,"Female","BTech",false, true,"ReddyExport",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007654L,"LAEGP2772F",true,1034567890981L);
		PersonDTO dto39=new PersonDTO(40,"Chanadana","chandu@gmail.com",9642915011L,"Female","Diploma",true, true,"BMTC",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007654L,"LAEHP2772F",true,1234567890989L);
		PersonDTO dto40=new PersonDTO(41,"Chethan","chethu@gmail.com",9652915011L,"Male","Diploma",false, true,"KSRTC",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007554L,"LAEPJ2772F",true,1234567890988L);
		PersonDTO dto41=new PersonDTO(42,"Mamatha","mama@gmail.com",9636915011L,"Female","Diploma",false, true,"BMTC",30000,37,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007454L,"LAEPK2772F",true,1234567890987L);
		PersonDTO dto42=new PersonDTO(43,"Mahesh","mahes@gmail.com",9637915011L,"Male","Diploma",false, true,"BMTC",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007354L,"LAEPL2772F",true,1234567890986L);
		PersonDTO dto43=new PersonDTO(44,"Renuka","renuka@gmail.com",9682915011L,"Female","BE",false, true,"Mahindra",30000,37,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007254L,"LAEQP2772F",true,1234567890985L);
		PersonDTO dto44=new PersonDTO(45,"Kumar","kumar@gmail.com",9632995011L,"Male","BE",true, true,"Mphasis",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007154L,"LAEPW2772F",true,1234567890984L);
		PersonDTO dto45=new PersonDTO(46,"Bhagya","bagya@gmail.com",8832915011L,"Female","BE",true, true,"BMTC",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007634L,"LAEEP2772F",true,1234567890983L);
		PersonDTO dto46=new PersonDTO(47,"Rathnamma","ramma@gmail.com",9722915011L,"Female","Diploma",true, true,"KSRTC",30000,37,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007674L,"LAERP2772F",true,1234567890982L);
		PersonDTO dto48=new PersonDTO(48,"Rajath","rajath@gmail.com",9000915011L,"Male","BE",false, true,"Mphasis",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007684L,"LAEPT2772F",true,1234567890980L);
		PersonDTO dto49=new PersonDTO(49,"Mahadev","mahadev@gmail.com",9630915011L,"Male","Diploma",true, true,"Mahindra",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007954L,"LAEYP2772F",true,1294567890981L);
		PersonDTO dto50=new PersonDTO(50,"Teju","teju@gmail.com",9632915000L,"Female","Diploma",true, true,"BMTC",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007659L,"LAEUP2772F",true,1284567890981L);
		PersonDTO dto51=new PersonDTO(51,"Manya","pinki@gmail.com",9632635011L,"Female","BE",true, true,"ReddyExport",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007658L,"LAEIP2772F",true,1274567890981L);
		PersonDTO dto52=new PersonDTO(52,"Kishan","kisan@gmail.com",8907654321L,"Male","Diploma",true, true,"Mphasis",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007657L,"LAEOP2772F",true,1264567890981L);
		PersonDTO dto53=new PersonDTO(53,"Suguna","sugu@gmail.com",8907754321L,"Female","MBA",false, true,"BMTC",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007656L,"LAPPP2772F",true,1254567890981L);
		PersonDTO dto54=new PersonDTO(54,"Ramya","ramya@gmail.com",8927654321L,"Female","Diploma",true, true,"BMTC",30000,37,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007655L,"LZEPP2772F",true,1244567890981L);
		PersonDTO dto55=new PersonDTO(55,"Preethu","preethu@gmail.com",8907154321L,"Male","BE",false, true,"HItech",30000,84,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007653L,"LXEPP2772F",true,1224567890981L);
		PersonDTO dto56=new PersonDTO(56,"Suresh","suri@gmail.com",8974654321L,"Male","Diploma",false, true,"Mphasis",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007634L,"LCEPP2772F",true,1214567890981L);
		PersonDTO dto57=new PersonDTO(57,"Amulya","ammu@gmail.com",9901155514L,"Female","BE",false, true,"ReddyExport",30000,72,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007254L,"LVEPP2772F",true,1204567890981L);
		PersonDTO dto58=new PersonDTO(58,"Anu","anu@gmail.com",8095013765L,"Female","Diploma",true, true,"Mphasis",30000,29,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007154L,"LBEPP2772F",true,1234567990981L);
		PersonDTO dto59=new PersonDTO(59,"Nandini","nandini@gmail.com",8919461471L,"Female","Diploma",false, true,"BMTC",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",559195007654L,"LNEPP2772F",true,1234567790981L);
		PersonDTO dto60=new PersonDTO(60,"Thriveni","thri@gmail.com",9611558179L,"Female","BE",false, true,"Mphasis",30000,24,3,"Bengaluru","Bengaluru","Karnataka", "India",551990507654L,"LAMPP2772F",true,1234567690981L);
		PersonDTO dto61=new PersonDTO(61,"Surya","surya@gmail.com",8660516747L,"Male","Diploma",true, true,"ReddyExport",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551959007654L,"LANPP2772F",true,1234567590981L);
		PersonDTO dto62=new PersonDTO(62,"Raju","raj@gmail.com",7975357097L,"Male","BE",false, true,"KSRTC",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551996667654L,"LABPP2772F",true,1234567490981L);
		PersonDTO dto63=new PersonDTO(63,"Gajendra","gaja@gmail.com",9742471144L,"Male","Diploma",false, true,"Infitech",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007554L,"DAEPP2772F",true,1234567390981L);
		PersonDTO dto64=new PersonDTO(64,"Mittu","mittu@gmail.com",9980701790L,"Male","Diploma",true, true,"BMTC",140000,26,3,"Bengaluru","Bengaluru","Karnataka", "India",557995007654L,"LAEPP2772S",true,1234567290981L);
		PersonDTO dto65=new PersonDTO(65,"Shashi","shashi@gmail.com",6362986832L,"Male","MBA",false, true,"Mahindra",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551905007654L,"LAEPP2772A",true,1234567190981L);
		PersonDTO dto66=new PersonDTO(66,"Harshitha","harshi@gmail.com",7892996976L,"Female","Diploma",false, true,"BMTC",430000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551005007654L,"LAEPP2772E",true,1234567090981L);
		PersonDTO dto67=new PersonDTO(67,"Neha","neha@gmail.com",88677972667L,"Female","MCA",true, true,"Infitech",830000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551995007654L,"LAEPP2772Q",true,1234597890981L);
		PersonDTO dto68=new PersonDTO(68,"Ashok","ashok@gmail.com",8951008832L,"Male","Diploma",true, true,"KSRTC",18000,25,3,"Bengaluru","Bengaluru","Karnataka", "India",551995027654L,"LAEPP2772U",true,1234587890981L);
		PersonDTO dto69=new PersonDTO(69,"lalitha","lalitha@gmail.com",9743521291L,"Female","Mtech",false, true,"KSIT",30000,24,3,"Bengaluru","Bengaluru","Karnataka", "India",551995004654L,"LAEPP2772H",true,1234577890981L);
		PersonDTO dto70=new PersonDTO(70,"Chidvan","chidvan@gmail.com",9739372822L,"Male","Diploma",false, true,"Mahindra",330000,26,3,"Bengaluru","Bengaluru","Karnataka", "India",551965007654L,"LAEPP2772J",true,1234557890981L);
		PersonDTO dto71=new PersonDTO(71,"Srusti","srusti@gmail.com",8884818202L,"Female","Btech",false, true,"BMTC",230000,22,3,"Bengaluru","Bengaluru","Karnataka", "India",551945007654L,"LAEPP2772X",true,1234547890981L);
		PersonDTO dto72=new PersonDTO(72,"Brunda","brunda@gmail.com",9916671611L,"Female","Diploma",false, true,"Infitech",30000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",541995007654L,"LAEPP2772O",true,1234537890981L);
		PersonDTO dto73=new PersonDTO(73,"Vinay","vinay@gmail.com",9686615872L,"Male","BBA",true, true,"Infitech",18000,27,3,"Bengaluru","Bengaluru","Karnataka", "India",551695007654L,"LAEPP2772K",true,1234527890981L);
		PersonDTO dto74=new PersonDTO(74,"Vikas","vikas@gmail.com",7760918457L,"Male","Bcom",false, true,"Infitech",30000,37,3,"Bengaluru","Bengaluru","Karnataka", "India",651995007654L,"LAEPP2772V",true,1234517890981L);
		PersonDTO dto75=new PersonDTO(75,"Krishna","krishna@gmail.com",9686620924L,"Male","BSc",false, true,"BMTC",18000,40,3,"Bengaluru","Bengaluru","Karnataka", "India",561995007654L,"LAEPP2772A",true,1234507890981L);
		
		PersonService service=new PersonServiceImpl();
		service.validateAndSave(dto);
		service.validateAndSave(dto1);
		service.validateAndSave(dto2);
		service.validateAndSave(dto3);
		service.validateAndSave(dto4);
		service.validateAndSave(dto5);
		service.validateAndSave(dto6);
		service.validateAndSave(dto7);
		service.validateAndSave(dto8);
		service.validateAndSave(dto9);
		service.validateAndSave(dto10);
		service.validateAndSave(dto11);
		service.validateAndSave(dto12);
		service.validateAndSave(dto13);
		service.validateAndSave(dto14);
		service.validateAndSave(dto15);
		service.validateAndSave(dto16);
		service.validateAndSave(dto17);
		service.validateAndSave(dto18);
		service.validateAndSave(dto19);
		service.validateAndSave(dto20);
		service.validateAndSave(dto21);
		service.validateAndSave(dto22);
		service.validateAndSave(dto23);
		service.validateAndSave(dto24);
		service.validateAndSave(dto25);
		service.validateAndSave(dto26);
		service.validateAndSave(dto27);
		service.validateAndSave(dto28);
		service.validateAndSave(dto29);
		service.validateAndSave(dto30);
		service.validateAndSave(dto31);
		service.validateAndSave(dto32);
		service.validateAndSave(dto33);
		service.validateAndSave(dto34);
		service.validateAndSave(dto35);
		service.validateAndSave(dto36);
		service.validateAndSave(dto37);
		service.validateAndSave(dto38);
		service.validateAndSave(dto39);
		service.validateAndSave(dto40);
		service.validateAndSave(dto41);
		service.validateAndSave(dto42);
		service.validateAndSave(dto43);
		service.validateAndSave(dto44);
		service.validateAndSave(dto45);
		service.validateAndSave(dto46);
		service.validateAndSave(dto48);
		service.validateAndSave(dto49);
		service.validateAndSave(dto50);
		service.validateAndSave(dto51);
		service.validateAndSave(dto52);
		service.validateAndSave(dto53);
		service.validateAndSave(dto54);
		service.validateAndSave(dto55);
		service.validateAndSave(dto56);
		service.validateAndSave(dto57);
		service.validateAndSave(dto58);
		service.validateAndSave(dto59);
		service.validateAndSave(dto60);
		service.validateAndSave(dto61);
		service.validateAndSave(dto62);
		service.validateAndSave(dto63);
		service.validateAndSave(dto64);
		service.validateAndSave(dto65);
		service.validateAndSave(dto66);
		service.validateAndSave(dto67);
		service.validateAndSave(dto68);
		service.validateAndSave(dto69);
		service.validateAndSave(dto70);
		service.validateAndSave(dto71);
		service.validateAndSave(dto72);
		service.validateAndSave(dto73);
		service.validateAndSave(dto74);
		service.validateAndSave(dto75);
		
		
		
		PersonService serv=new PersonServiceImpl();
		serv.displayAll();
		PersonService serv1=new PersonServiceImpl();
		serv1.displayAllAgeGreaterThanOrderByName(25);
		PersonService serv2=new PersonServiceImpl();
		serv2.displayAllByGenderDescOrderByName("Male");
		PersonService serv3=new PersonServiceImpl();
		serv3.displayAllBySalaryGreaterThanOrderByDesc(100000);
		PersonService serv4=new PersonServiceImpl();
		serv4.displayCount();
		PersonService serv5=new PersonServiceImpl();
		serv5.displaySumOfSalary();
		
		
		
		
	}

}
