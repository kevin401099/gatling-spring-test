package io.test;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class Sim extends Simulation {
	String baseUrl = System.getProperty("baseUrl", "https://lsvtest.dla.go.th");
    
  private HttpProtocolBuilder httpProtocol = http
    .baseUrl(baseUrl)
    .inferHtmlResources()
  ;
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "none"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private Map<CharSequence, String> headers_1 = Map.ofEntries(
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private Map<CharSequence, String> headers_17 = Map.ofEntries(
    Map.entry("Origin", "https://lsvtest.dla.go.th"),
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private Map<CharSequence, String> headers_27 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("Origin", "https://lsvtest.dla.go.th"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private Map<CharSequence, String> headers_60 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private Map<CharSequence, String> headers_65 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Sec-Fetch-Dest", "script"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private Map<CharSequence, String> headers_68 = Map.ofEntries(
    Map.entry("Accept", "text/css,*/*;q=0.1"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Sec-Fetch-Dest", "style"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private Map<CharSequence, String> headers_73 = Map.ofEntries(
    Map.entry("Accept", "application/json, text/javascript, */*; q=0.01"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("X-Requested-With", "XMLHttpRequest"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private Map<CharSequence, String> headers_109 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private Map<CharSequence, String> headers_118 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("If-Modified-Since", "Thu, 04 Jul 2024 03:05:48 GMT"),
    Map.entry("If-None-Match", "1720062348000"),
    Map.entry("Sec-Fetch-Dest", "script"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private Map<CharSequence, String> headers_161 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("Content-Type", "multipart/form-data; boundary=----WebKitFormBoundarymr0DZdPpnC9gcZBK"),
    Map.entry("Origin", "https://lsvtest.dla.go.th"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private Map<CharSequence, String> headers_209 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("Content-Type", "multipart/form-data; boundary=----WebKitFormBoundaryyY3aiduImBFeRpO4"),
    Map.entry("Origin", "https://lsvtest.dla.go.th"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private Map<CharSequence, String> headers_262 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("Content-Type", "multipart/form-data; boundary=----WebKitFormBoundarykgxeKZhGWAEMt62O"),
    Map.entry("Origin", "https://lsvtest.dla.go.th"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private Map<CharSequence, String> headers_268 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Content-Type", "text/plain"),
    Map.entry("Origin", "https://lsvtest.dla.go.th"),
    Map.entry("Sec-Fetch-Dest", "empty"),
    Map.entry("Sec-Fetch-Mode", "cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private Map<CharSequence, String> headers_308 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("Content-Type", "multipart/form-data; boundary=----WebKitFormBoundaryD756cD8ABKweJTbR"),
    Map.entry("Origin", "https://lsvtest.dla.go.th"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private Map<CharSequence, String> headers_334 = Map.ofEntries(
    Map.entry("accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"),
    Map.entry("accept-encoding", "gzip, deflate, br, zstd"),
    Map.entry("accept-language", "en-US,en;q=0.9"),
    Map.entry("origin", "https://lsvtest.dla.go.th"),
    Map.entry("priority", "i"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS"),
    Map.entry("sec-fetch-dest", "image"),
    Map.entry("sec-fetch-mode", "cors"),
    Map.entry("sec-fetch-site", "cross-site"),
    Map.entry("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("x-client-data", "CKe1yQEIjLbJAQiktskBCKmdygEIneDKAQiVocsBCIagzQEIp6LOARiPzs0B")
  );
  
  private Map<CharSequence, String> headers_372 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7"),
    Map.entry("Accept-Encoding", "gzip, deflate, br, zstd"),
    Map.entry("Accept-Language", "en-US,en;q=0.9"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("Content-Type", "multipart/form-data; boundary=----WebKitFormBoundarydXY6mWBzZa1PRvAc"),
    Map.entry("Origin", "https://lsvtest.dla.go.th"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36"),
    Map.entry("sec-ch-ua", "Not/A)Brand\";v=\"8\", \"Chromium\";v=\"126\", \"Google Chrome\";v=\"126"),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "macOS")
  );
  
  private String uri1 = "https://mt0.google.com/vt";

  private ScenarioBuilder scn = scenario("Sim")
    .exec(
      http("index")
        .get("/index_bak.jsp")
        .headers(headers_0),
      pause(1),
      http("login")
        .post("/login.do")
        .headers(headers_27)
        .formParam("cmd", "doLogin")
        .formParam("urlToken", "")
        .formParam("login", "population")
        .formParam("password", "123456"),
//        .formParam("_df_check_id", "8a6930c6-f672-4a42-9d7d-1f792996673e"),
      pause(1),
      http("gocreate")
        .get("/adv/adv001.do?random=1720758618240&cmd=goCreate")
        .headers(headers_109),
      pause(1),
      http("form1")
	      .post("/adv/adv001.do")
	      .headers(headers_161)
	      .formParam("cmd", "goForm2")
	      .formParam("formTab", "1")
	      .formParam("formData.id", "0")
	      .formParam("editable", "true")
	      .formParam("formData.petition.person.titleId", "1")
	      .formParam("formData.petition.person.firstName", "หมื่นนา")
	      .formParam("formData.petition.person.lastName", "มานะ")
	      .formParam("formData.petition.person.birthDateStr", "12/03/2523")
	      .formParam("formData.petition.person.ageStr", "41")
	      .formParam("formData.petition.person.nationalityId", "1")
	      .formParam("formData.petition.person.addrNo", "888")
	      .formParam("formData.petition.person.moo", "1")
	      .formParam("formData.petition.person.soi", "99")
	      .formParam("formData.petition.person.road", "ทดสอบ")
	      .formParam("formData.petition.person.postCode", "62120")
	      .formParam("provinceCode1", "62")
	      .formParam("amphurCode1", "6205")
	      .formParam("districtCode1", "620504")
	      .formParam("formData.petition.person.phoneNo", "0881234568")
	      .formParam("formData.petition.person.email", "test@depth1st.com")
	      .formParam("formData.petition.person.contactAddrNo", "888")
	      .formParam("formData.petition.person.contactMoo", "1")
	      .formParam("formData.petition.person.contactMoo", "99")
	      .formParam("formData.petition.person.contactRoad", "ทดสอบ")
	      .formParam("provinceCode1Contact", "62")
	      .formParam("amphurCode1Contact", "6205")
	      .formParam("districtCode1Contact", "620504")
	      .formParam("formData.petition.person.phoneNo", "0881234568")
	      .formParam("formData.petition.person.email", "test@depth1st.com"),
//	      .formParam("_df_check_id", "f06924b8-8f66-4826-885d-0809a56ec1a5"),
      pause(1),
      http("upload file")
      	.post("/adv/adv001.do")
      	.headers(headers_262)
      	.formParam("cmd", "doUploadFile")
      	.formParam("data_index", "uploadfile")
//      	.formParam("attachFile1", "test.jpeg")
      	.bodyPart(RawFileBodyPart("attachFile1", "test.jpeg").fileName("test.jpeg"))
      	.bodyPart(RawFileBodyPart("attachFile2", "test.jpeg").fileName("test.jpeg"))
      	.bodyPart(RawFileBodyPart("attachFile3", "test.jpeg").fileName("test.jpeg"))
      	.bodyPart(RawFileBodyPart("attachFile4", "test.jpeg").fileName("test.jpeg")),
      pause(1),
      http("form2")
      	.post("/adv/adv001.do")
      	.headers(headers_262)
      	.formParam("cmd", "goForm3")
      	.formParam("formTab", "2")
        .formParam("formData.id", "0")
        .formParam("editable", "true")
        .formParam("provinceCode2", "81")
        .formParam("amphurCode2", "8103")
        .formParam("orgCode2", "6869")
        .formParam("formData.startDateStr", "12/07/2567")
        .formParam("formData.endDateStr", "19/07/2567")
        .formParam("formData.durationDayStr", "8")
        .formParam("formData.adType", "1")
        .formParam("formData.posterMaterial", "1")
        .formParam("formData.posterWidthStr", "1.0")
        .formParam("formData.posterLengthStr", "1.0")
        .formParam("formData.posterQtyStr", "1")
        .formParam("formData.petition.paymentList[0].feeAmountStr", "100.0"),
//        .formParam("attachFile1", "test.jpeg")
//        .bodyPart(RawFileBodyPart("attachFile2", "/Users/kevin401099/Downloads/test.jpeg").fileName("file"))
//        .bodyPart(RawFileBodyPart("attachFile3", "/Users/kevin401099/Downloads/test.jpeg").fileName("file"))
//        .bodyPart(RawFileBodyPart("attachFile4", "/Users/kevin401099/Downloads/test.jpeg").fileName("file"))
//        .formParam("_df_check_id", "131672c7-feba-4278-9cbb-2f57625c9931"),
      pause(1),
      http("form3")
        .post("/adv/adv001.do")
        .headers(headers_308)
        .formParam("cmd", "doSave")
      	.formParam("formTab", "3")
        .formParam("formData.id", "0")
        .formParam("formData.posterQty", "1")
        .formParam("editable", "true")
        .formParam("provinceCode2", "81")
//        .formParam("formData.petition.petAdMapList[0].orgAdAreaId", "6869")
        .formParam("formData.petition.petAdMapList[0].lat", "8.073347")
        .formParam("formData.petition.petAdMapList[0].lon", "98.928784")
//        .formParam("formData.petition.petAdMapList[0].amphurCode", "8103")
//        .formParam("formData.petition.petAdMapList[0].districtCode", "810301")
        .formParam("formData.petition.petAdMapList[0].posterQtyStr", "1")
        .formParam("map0", "1")
    );

  {
	  int userCount = Integer.parseInt(System.getProperty("userCount", "1"));
	  int durationSeconds = Integer.parseInt(System.getProperty("durationSeconds", "1"));
	  System.out.println("userCount " + userCount);
	  System.out.println("userCountProperty " + System.getProperty("durationSeconds", "2"));
	  setUp(scn.injectOpen(constantUsersPerSec((double)userCount / durationSeconds).during(durationSeconds))).protocols(httpProtocol);
  }
}
