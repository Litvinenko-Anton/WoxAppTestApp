package com.map.woxapptestapp.models.response.directions;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i7-4770k on 19.01.2018
 *
 * {
 "geocoded_waypoints": [
 {
 "geocoder_status": "OK",
 "place_id": "ChIJbcUKj93i20ARbbRo1PEASKk",
 "types": [
 "street_address"
 ]
 },
 {
 "geocoder_status": "OK",
 "place_id": "ChIJoxyCHVHO1EARfn3PQYMRsyc",
 "types": [
 "street_address"
 ]
 }
 ],
 "routes": [
 {
 "bounds": {
 "northeast": {
 "lat": 50.469165,
 "lng": 35.0461765
 },
 "southwest": {
 "lat": 48.4647118,
 "lng": 30.5220434
 }
 },
 "copyrights": "Map data ©2018 Google",
 "legs": [
 {
 "distance": {
 "text": "495 km",
 "value": 494525
 },
 "duration": {
 "text": "6 hours 17 mins",
 "value": 22638
 },
 "end_address": "Khreschatyk St, 20-22, Kyiv, Ukraine, 02000",
 "end_location": {
 "lat": 50.44985029999999,
 "lng": 30.5238646
 },
 "start_address": "Dmytra Yavornytskoho Avenue, 59А, Dnipropetrovs'k, Dnipropetrovsk Oblast, Ukraine, 49000",
 "start_location": {
 "lat": 48.4647118,
 "lng": 35.0461765
 },
 "steps": [
 {
 "distance": {
 "text": "0.4 km",
 "value": 411
 },
 "duration": {
 "text": "2 mins",
 "value": 102
 },
 "end_location": {
 "lat": 48.4670213,
 "lng": 35.0418263
 },
 "html_instructions": "Head <b>northwest</b> on <b>просп. Дмитра Яворницького</b> toward <b>вул. Володимира Мономаха</b>",
 "polyline": {
 "points": "mwxfHs}{tEMVKVyCxG{EfL}@rB"
 },
 "start_location": {
 "lat": 48.4647118,
 "lng": 35.0461765
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.6 km",
 "value": 591
 },
 "duration": {
 "text": "2 mins",
 "value": 136
 },
 "end_location": {
 "lat": 48.4719587,
 "lng": 35.0444993
 },
 "html_instructions": "Turn <b>right</b> onto <b>вул. Воскресенська</b>",
 "maneuver": "turn-right",
 "polyline": {
 "points": "{eyfHmb{tEw@aAc@i@GIg@m@QQIIMKKIMGICWGSGo@SsCu@q@SiBk@YKsDeAGA_DeA"
 },
 "start_location": {
 "lat": 48.4670213,
 "lng": 35.0418263
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "1.5 km",
 "value": 1504
 },
 "duration": {
 "text": "2 mins",
 "value": 141
 },
 "end_location": {
 "lat": 48.47953690000001,
 "lng": 35.0278585
 },
 "html_instructions": "Turn <b>left</b> onto <b>вул. Січеславська наб.</b>/<b>Т0410</b>",
 "maneuver": "turn-left",
 "polyline": {
 "points": "wdzfHcs{tEIh@gAdHMv@Mj@Wl@Ud@eBtD_@x@KRIPy@fB{@fB_BhDsArCi@hAOX[l@a@|@k@lAO^_BlDeBpDKPELELIVOj@K`@_EfPmA~EU`As@vC]tAIHQTMNMPc@f@"
},
 "start_location": {
 "lat": 48.4719587,
 "lng": 35.0444993
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "5.6 km",
 "value": 5619
 },
 "duration": {
 "text": "6 mins",
 "value": 345
 },
 "end_location": {
 "lat": 48.4930037,
 "lng": 34.9578158
 },
 "html_instructions": "Turn <b>right</b> onto <b>пл. Десантників</b>/<b>Е50</b>/<b>М04</b><div style=\"font-size:0.9em\">Continue to follow Е50/М04</div>",
 "maneuver": "turn-right",
 "polyline": {
 "points": "ct{fHckxtEKVOAK?I?MBKDGBGDGJILIPQd@St@]jASv@Sr@Mb@c@nA[x@[n@s@`Bi@rASl@Oj@U~@Ut@Sp@Wt@k@zAiAxCq@nBWz@e@vAu@~BOl@Or@I`@It@Gn@Gz@Gz@GhAQfFCt@SvGQpFCdAGjBGrBIrBIxAI~AOhBU|CQnBo@hGYtCWfC_@nDe@~E[zCa@hEa@rEc@tEc@rE_@xDU|Bi@lFOnAMbAg@hEm@xEk@bESfAMt@k@hDu@rDCLQt@aAfEeBjHkDfNo@jCy@nDOv@Il@Kp@In@Gj@C^Cd@C^Ab@CfACbAAtAAd@AfBG~DAz@EbDEvCEjEAfA?|@@~@Bh@B\\B\\DXN~@TpAf@`Cb@vBdAbFr@jDH^H`@?@Hd@H^Fb@Dd@Dh@@`@?b@?TC`@AXCVCPId@ERENITKTKTS^c@t@}@|Ao@fAcAdBS^[l@KXM\\IVK`@ERKf@UhAGX{AtH_AzEIf@G`@Ef@AZA^A\\?d@@jA@x@BdABf@BV"
 },
 "start_location": {
 "lat": 48.47953690000001,
 "lng": 35.0278585
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.4 km",
 "value": 381
 },
 "duration": {
 "text": "1 min",
 "value": 34
 },
 "end_location": {
 "lat": 48.4922531,
 "lng": 34.9621907
 },
 "html_instructions": "Make a <b>U-turn</b>",
 "maneuver": "uturn-left",
 "polyline": {
 "points": "gh~fHkujtEBNDFBDBBHBD?FADA@A@A@C@CBEBK@I@MDe@G{D?m@AcAAq@?u@@i@@]@WBY@OBWBQDWDUd@}BPy@"
 },
 "start_location": {
 "lat": 48.4930037,
 "lng": 34.9578158
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.3 km",
 "value": 268
 },
 "duration": {
 "text": "1 min",
 "value": 25
 },
 "end_location": {
 "lat": 48.4917564,
 "lng": 34.9615515
 },
 "html_instructions": "Take the ramp to <b>Донецьке ш.</b>/<b>Кайдацький міст</b>/<b>Е50</b>/<b>М04</b>",
 "polyline": {
 "points": "qc~fHupktE`@g@TY^a@DEHCDELEJCHAH?H@HBHFFFFHDFDLDNBJ@N@L?L?PAJAHAJAHCHABGNGFGFGFIDIDI@Q@O?SA"
 },
 "start_location": {
 "lat": 48.4922531,
 "lng": 34.9621907
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "4.1 km",
 "value": 4073
 },
 "duration": {
 "text": "5 mins",
 "value": 286
 },
 "end_location": {
 "lat": 48.5140545,
 "lng": 35.0020214
 },
 "html_instructions": "Continue onto <b>Донецьке ш.</b>/<b>Кайдацький міст</b>/<b>Е50</b>/<b>М04</b><div style=\"font-size:0.9em\">Continue to follow Донецьке ш./Е50/М04</div>",
 "polyline": {
 "points": "o`~fHulktEi@]c@WSMcB{@KGMIwD}BaDmB_Ak@aAk@eAm@yCeBeCwAaBcA_CqAiAm@iCyA}@k@m@a@g@_@o@k@_@][[Y]U[SYIOYa@_@m@o@iAwAsCcAoB_AiB_AkBoAcCWg@u@{Ak@gAc@w@aBaD[o@[o@y@_Bw@yAu@wAmBuDeAuBQa@aAaCo@iBo@oBSw@a@}Ac@wBYaB]{B]iCIu@i@wFQ_BY}CMmAm@gGiAaLK}@SkBQyAQgAKs@Ig@Y{AWkAa@cBOg@eDgLeBaGGYoAiEaAiDGSwD}MEOeB{G"
 },
 "start_location": {
 "lat": 48.4917564,
 "lng": 34.9615515
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.2 km",
 "value": 152
 },
 "duration": {
 "text": "1 min",
 "value": 12
 },
 "end_location": {
 "lat": 48.51470399999999,
 "lng": 35.0038311
 },
 "html_instructions": "Slight <b>right</b> onto <b>Донецьке ш.</b>/<b>вулиця Мурманська</b>/<b>М04</b>",
 "maneuver": "turn-slight-right",
 "polyline": {
 "points": "ykbgHsistEE_@AOAECII_@Ke@_@oA}@sC"
 },
 "start_location": {
 "lat": 48.5140545,
 "lng": 35.0020214
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.2 km",
 "value": 176
 },
 "duration": {
 "text": "1 min",
 "value": 20
 },
 "end_location": {
 "lat": 48.5141249,
 "lng": 35.0036186
 },
 "html_instructions": "Slight <b>right</b> onto the ramp to <b>ПОЛТАВА</b>",
 "polyline": {
 "points": "{obgH}tstE?k@?U@QBQDMDIDIJGHEJAL?J@JDHBFDDFBHDF@J@J?L?J?NCVMz@"
 },
 "start_location": {
 "lat": 48.51470399999999,
 "lng": 35.0038311
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "29.5 km",
 "value": 29482
 },
 "duration": {
 "text": "22 mins",
 "value": 1317
 },
 "end_location": {
 "lat": 48.6544171,
 "lng": 34.6829489
 },
 "html_instructions": "Continue onto <b>вул. Передова</b>/<b>вулиця Мурманська</b>/<b>ш. Полтавське</b>/<b>P52</b>/<b>М04</b><div style=\"font-size:0.9em\">Continue to follow ш. Полтавське/P52</div>",
 "polyline": {
 "points": "glbgHssstEq@~A_BxD[|@m@|AaAnCm@fBi@zAc@rAwAlEgBtFgAjDg@|AqBlFaAjC}@dCQf@_@~@i@tAm@zAM\\GHOjAE^Gd@Gr@Gt@G`AARE|@Gt@Gx@MpAMdAO|@Qx@WfA}@zDMd@eBrHOh@eAtEi@lCw@lEWzA]xBg@vDi@~EQlBWpCMpBK|AK|BSpECv@CbAExACjBCjB?bA?xB?nA@bBB~BBvAJzEHnFDzBHbED~AB|ABz@@~@@x@?fA@tA?rAAlAAj@Ad@Ez@GdAOlBQ`Bc@xCETMr@UdAGZK`@W|@Qr@i@lBY`Aa@|A[dAQl@U`AOl@Kb@UnAId@Ih@Il@It@Gn@I|@Et@Ev@QpCQnCCTKrAOxAIv@Kt@G^Kj@UhAWbAUv@a@fA]~@c@dASd@aCpFeB|Do@vAwC~G}ApDcAzBa@~@Yt@_@~@k@|Ae@vAg@~AI\\o@~Bu@nDMv@Mx@QlAMdAM~@I`AGr@AXEf@M~A]jEKfCOnEMpDI~CMrDOnD]bDWvBKz@GZIn@Ot@Md@Qt@Ux@Ur@[x@c@dA]v@]p@[j@W`@MRUZQRUXgAlAk@h@SN]TWNSJ[N}@`@}@^aAZsBp@yAb@qBn@}@V}@X_AZaBl@uAt@cBhAy@t@YVUTSVY\\STU\\QXSX[d@QXQ^[p@]z@Qb@Qd@[x@CFk@dB_@jAi@|AYt@IV]hAm@nBa@pA[fAUz@gA`EgFlSm@hCc@hB_@`BQz@Sz@]`B]`B_@bBMf@Sv@IZM`@Y~@c@lASf@Yl@Ud@M\\i@|@c@j@m@t@]`@UVYXq@l@e@`@c@^OJMH[PULi@VYJ]L[HWHSB_BTiA@YEICK?]?WAO?QASCYEm@Km@Mi@MaAWk@QqC{@g@O{@Ui@Oi@Ee@E]Aa@?U?SB[BWBWDc@Jm@P]L[LYNYPSNa@ZSPQNQRMP_@f@e@r@[f@Q\\Wn@KXM\\Of@YbAaAnDi@tBuAdFm@~Bs@lCg@lBYbAc@bBWz@]xAk@tBAFkAlEcAxDCHqB|HKd@a@~Aa@xAw@tC]jA]jAc@tAaA~Cm@jBoAfDoA~CeBpEwAlD{AvDq@~Ao@`Bm@zAi@nAs@fBq@fBa@bAeAjCcAhCwAlDeAjCq@bBaAjCq@lB_ApC_@hA_@hAK^k@nBQj@w@nCc@bBi@tBYjAQr@Qx@a@hBa@pB_@lBWvA[dB_@vBWzAMx@QhAMv@M`Aa@dDW|BOzAKjAq@`H]lDc@lEm@tGQ~AUhCUjBMjAWhBQpAKn@Q`AOz@Ot@o@bDw@lDcAvEo@|C{@~DyAzGi@hCWfA}@hEi@dCe@xBq@zCo@vCaApEcA|EiAfFuAjGaApEa@bB[xAg@zBa@jBq@~C{@xD[zAg@tBs@vCs@xCw@tC]jAKb@Sr@Ol@e@xA_ApCi@|A_@fAc@nA_@`Ai@tAWn@CFq@~AaAzBOZ}@nBi@jAe@dA[p@gBxD}@rBo@vAa@|@Yt@i@nAg@hAMXQZc@|@s@|A{DrIq@|A{@jBO\\s@zAg@lAaAtBsAxCu@|Ay@`Ba@t@Wb@{@zAk@~@GJiAjBm@`Ac@p@_AvAm@|@]d@W^U^gAzAgBjCkBpCaAvAwArBe@r@o@`AoAlBm@bAa@r@QXSd@OZQ`@k@~AWv@Wv@_@pA]lAS~@Oz@WxAO`AIh@Gh@UpBKdAKfA_@xDQrBOtAGp@O|ASxBUbC]tDSxBU`CQ~AMdAIt@Mz@[fBSz@UhA_@pAu@lCe@dBgAtD{@xCiAvD_AfDaAjDw@pC{@vCw@nCq@~Ba@tASr@Up@Qr@]hAWv@W~@a@vAg@bB[`Aa@pAk@fB_@hAq@lBa@fAs@jBc@fA]x@w@lB_@~@k@nAkB`EYh@]r@g@`Ai@|@wAhCg@z@w@lAe@v@m@z@k@~@u@fAs@dA_AtAgA`Bw@hAoAlBgA~A}@pA[b@a@l@q@bAeBfCsApByAxBuArBsAnBs@dAu@hAaAvA}A|BgA`BgA`BuArB_ArAk@z@g@v@eAzAo@bA_@h@i@v@eA|A{AzBqAnBo@`Ae@p@c@p@c@n@{@lAg@t@u@fAu@hAaBbC{AxBqAlBcA|Ak@v@q@fA_@l@e@r@c@t@m@`A[j@e@v@a@v@Wd@a@t@m@jAq@rAUf@Wf@c@`Ac@`As@`BYn@]|@a@bAk@xA]~@i@vAcApCk@hBm@hBY~@Sl@Sn@Qp@Uv@i@tBYdAMj@Mf@q@xCQv@S|@YvAUdAUlAUjAWpAUnA]hBY|AY|AOx@Mn@o@`DWlAc@rBYlAWlA[jA]tAYdAo@~Be@bBY~@[`Aq@vB_@fA_@lA[z@Sl@Qd@c@lAq@dBu@jBo@xAo@vAk@nAu@~Aa@z@c@x@k@hAc@z@}@fB{@`Ba@v@Yh@u@vA[l@e@z@i@dAe@bAc@|@k@lA]t@q@|Ac@dA{@rBaA~Bq@`B{@rBoAxCw@jB_AzBcAbCi@nAa@dAsA`DqA~C}ArD_AzBmAvC_@|@_@`Aa@dA_@bAq@hBQf@_@hAO`@[~@_@nAWv@Ux@_@lA[fAYdAW~@Qr@[jAYjAYnAUdA]xAaArE{@zD]`Bw@pD_@dBu@rD_@bBq@~Cs@hDg@`Cg@~BWlAa@hBWlAe@pBU~@"
},
 "start_location": {
 "lat": 48.5141249,
 "lng": 35.0036186
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "7.6 km",
 "value": 7560
 },
 "duration": {
 "text": "6 mins",
 "value": 342
 },
 "end_location": {
 "lat": 48.6965872,
 "lng": 34.6208743
 },
 "html_instructions": "Continue straight",
 "maneuver": "straight",
 "polyline": {
 "points": "cy}gHm_urEEdA_@pBwAnGk@hC]`B}@|DS|@Uz@Y~@[dAi@`Bm@dBkBbEiAjBqBjDmB|BiBpB{BtBoDzCaBhAmBxA_BpAsAjAmAbAy@f@u@l@cBfBuGzEsC~BwB~AgDlCiCfBcC`BmA`AmBdAqCtAeEhByChAkF~AyBr@gElAoFxAkAZeG~AqNzDgDbAsGfB{GpB_IzBqHtBcI|BqGdBiBx@gB`AyCpBuAnAiBhBkB`CmCfEuDzFeBtDgAxDgA~EcAlGcAjIKnBUdEMhF@xFJdKPfMTrMRpHB`BTdOF~EHjFVhNZtNDzF"
 },
 "start_location": {
 "lat": 48.6544171,
 "lng": 34.6829489
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.8 km",
 "value": 786
 },
 "duration": {
 "text": "1 min",
 "value": 65
 },
 "end_location": {
 "lat": 48.7032817,
 "lng": 34.6195913
 },
 "html_instructions": "Turn <b>right</b>",
 "maneuver": "turn-right",
 "polyline": {
 "points": "u`fhHm{hrEkBSk@G_A?_AE}@M{@O}@Sc@Mu@Ky@Ew@B}@Ji@L[HQFeAfAsDbEYRYTWJe@Hi@@i@A_@?g@G"
 },
 "start_location": {
 "lat": 48.6965872,
 "lng": 34.6208743
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.9 km",
 "value": 879
 },
 "duration": {
 "text": "1 min",
 "value": 58
 },
 "end_location": {
 "lat": 48.7103495,
 "lng": 34.624389
 },
 "html_instructions": "Slight <b>right</b> onto <b>вул. Червоноармійська</b>",
 "maneuver": "turn-slight-right",
 "polyline": {
 "points": "ojghHmshrEaAk@e@Q_AWsCw@{A[m@K{@OaAQa@GSAkA]a@Mo@QYSc@[u@q@eBiB{CuDs@aAw@kAk@q@YYSWUU[U"
},
 "start_location": {
 "lat": 48.7032817,
 "lng": 34.6195913
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.2 km",
 "value": 235
 },
 "duration": {
 "text": "1 min",
 "value": 36
 },
 "end_location": {
 "lat": 48.7121947,
 "lng": 34.6228737
 },
 "html_instructions": "Turn <b>left</b> toward <b>вул. Кутузова</b>/<b>ш. Полтавське</b>/<b>P52</b>/<b>T0414</b>/<b>T0441</b>/<b>Т0414</b>/<b>Т0441</b>",
 "maneuver": "turn-left",
 "polyline": {
 "points": "uvhhHmqirEENEFCFCDCDGHEBGDIH[PWNc@VWPSN_@VYTWNOLOLSPIFIFKDMF"
 },
 "start_location": {
 "lat": 48.7103495,
 "lng": 34.624389
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "31.3 km",
 "value": 31343
 },
 "duration": {
 "text": "27 mins",
 "value": 1648
 },
 "end_location": {
 "lat": 48.9448924,
 "lng": 34.4923004
 },
 "html_instructions": "Turn <b>left</b> onto <b>вул. Кутузова</b>/<b>ш. Полтавське</b>/<b>P52</b>/<b>T0414</b>/<b>T0441</b>/<b>Т0414</b>/<b>Т0441</b><div style=\"font-size:0.9em\">Continue to follow ш. Полтавське/P52/T0441/Т0441</div>",
 "maneuver": "turn-left",
 "polyline": {
 "points": "ebihH}girEAHCtCAj@C`AAj@Ex@Ah@Cl@CZAXCVEVCVCLK`@EPIVEJGLKROVKNILMNQRONSRIHcA`AmAhA[Z_@\\YZOP_AfAyAhB}@dAg@j@q@t@o@j@k@d@gA|@w@n@YTcBvA{ApAu@l@{@p@_@XSLWNSLSLe@X_@Rq@`@cAh@YPWJQJOF[N[Jc@Ne@L_@Hs@P]Fw@P[F{AX{@PuAXgB^cB\\sAVc@H]HWFMDMFIDCDEBGHGFEHMPKVEJELELCJI\\e@rBe@tBw@fDk@`Cg@zBYfAYlA_@vASp@Ut@Uh@MZQb@Uf@Uf@{@fBk@jAGLYj@Yh@iAzBi@dA]l@o@fAa@t@q@dAm@~@i@t@ORg@l@UVQVg@h@]^gAhAcAfAcAfAkAnAiAjA_@^q@t@kBlBwAzAm@n@UTMLqArAwAzAoArA}A~AaBfB}@|@{A~AyAzA}A`BkBpBcBfB{A|AqArAcBbBmApAa@^WXkAnA}A|A_B`B_B`BmAlAqAtAqApAiAlA}@|@_@^}@`Aq@r@aAbAk@j@cAdA{A~AuAvA{@z@_@\\_@b@_A~@oApA{A|A_A`A}A`Bs@t@_A~@gAhAaAbAe@f@y@z@aBdBy@z@yBzB{A|A_A`AcBfBsAvAgChCy@z@sAtAyA|AeBfBeBdByB~BqBrBcBdB}A~Ak@j@UT{A`BwAvA_CdCc@b@eBdByA~A_A`Ao@n@qBpB]\\qAnAwAvAq@p@kAjAcA~@_B|AkAhAcAbA_A~@s@p@UTk@j@sArA{BxByCrCiBfBYVYVc@^[Tk@`@u@d@u@b@}@h@q@`@y@d@eAn@iBdAeAl@w@b@yAz@iAp@cBbAw@d@sAx@oAx@iAt@_C|AoBvAuA`AiChBqE`DwCtBmCjBoBtAaCbB_DzBoClBeCbBqA|@o@d@GBm@b@yAfAs@f@e@\\gAx@sA`AURWR]VOL}BhBq@h@oB|A}AlAmA~@iBvAaCnB{AhA{BfByBfBoB|A}AnA{AjAqAbAwAfAqAdAk@d@c@\\mBzAiCpBgCrByBdBsBbBgBxAuAfAkA~@cAv@oAbA{@r@u@p@i@b@c@`@oAjAu@x@g@f@kAlAqArAqAtAmBpBgCjCcCfCgAjA_B`BaAbAs@t@wBzBu@v@m@n@i@h@iAjAm@l@q@t@wAxAyA|Au@v@qArA{@|@{A~A}A`BeBfBe@f@_@`@kAnAuAvAmBrBiBhBmBpBuBxB_BbB_BbBgBjBoAtA_BbB}AbBqAvA{A`BaBfBgAlAaAdAiAlA[^}AbB_AdAaBfBoAtAgAlAu@v@sAzAoBvBgAjA{AbBo@r@q@t@e@f@g@j@]^[ZST[ZURIFIDID[PMHOFQFSFMBMBK@SBM@S?SAQAO?KAMCKAOEIAICSGc@Mo@Sq@Ue@Oe@OcBi@_Bg@kAa@cA[_A[mBm@i@Qu@UYKCAGCGEGCu@WiAY_AYkCq@_AWe@Ms@SmA]iAYy@Ua@K_@IME]IUEWE_@GWESEu@KYCOASAWAUAY?_@Aw@?iAAiAAi@Ao@?m@?Y?Q?S@Q@O?K@MBE@IBIDUJMDEBGDIHKHEFIJIHILOTGHEHGLMVm@hAYh@S\\{@`Bm@hAYf@a@r@INMTORMRILKNIJY^KLMPaKnLWVk@p@_AfAg@j@c@h@g@j@c@f@}@dA_AdAw@|@y@|@c@d@]\\SNYVURWRq@f@eAx@_@V[Ru@j@iAz@c@Zg@^i@^_@X[TYRYRUNQH_@Ta@TYNWNULKHIDOHIHQLWVUTq@v@u@~@cAnAmAvAo@v@mAzASVY^]f@?@SXEHEHGLMXg@pA_@bAe@rAi@vA_@bAQb@Wr@Q`@_@dAaAlC]`Ac@lA_@jA]dA{@vC]lA_@pAcAlDs@bCaAfD[fA_@dAO`@IRQ^U`@QZS^MTOVMRS\\SVQXg@l@s@~@w@`A_@b@g@l@MLMNIFIHGDIDIDKDMBK@G?I?EAI?MEKEOIMGOKKGOM[Yk@i@o@m@}AkB]g@SWm@y@i@s@_AoAY_@Y]OQMMMKKGECICGAE?KAI@G@I@OFMJMLMLONUXSV_@d@UZU\\W^QXOTU\\a@n@k@|@eAhB{@vAy@pAk@|@c@r@e@v@c@r@q@hAm@`Ak@~@m@bAm@bAc@t@MRa@p@k@`Aq@hAWb@W`@OXKNMRMTKNKPKLMLQVs@|@[`@k@p@e@j@e@h@]`@[`@s@v@q@x@e@j@WXaAhAo@v@s@z@WZ_@b@aAjAq@t@i@n@WZUXe@h@k@r@[\\i@p@}@dAu@|@e@l@i@n@i@p@WZY^W\\W\\]h@_@d@_@j@SXOVq@dAYb@QXw@nAiAhBmAnBaAzAu@jAg@v@c@p@k@z@c@r@i@x@o@~@]f@m@z@u@dA_@h@y@fAk@v@_@f@KLMPUZONMLSRKHIFMJOFKFIDSJSHWHODMDSDYFQ@K@S@W@[@WASCQCYESGSEOGSG{@c@YQMKGEGGKKKMQSKQOQOSMSQUSYg@w@[a@[e@SYU[SWOS]_@OOSSYW[W]Yc@]WSa@WSO[QSKQIOGOIQGOEMEGCe@Ki@Kw@Qu@Kw@Mm@GYCQAQ?S?M@K@I@MBKBKBUHQHg@Ta@PYNk@VODSFMBIBQBg@Dg@DiADw@Dy@D_@B_@Bw@Dw@Da@BY@MBK@QBSBQBKBKBQDMDKDIBOFQHWJOFUJUL_@Pq@\\a@Pm@XiAh@cBx@q@Zo@Zq@Xg@Rc@Pg@R_@L]Je@LSFe@L[HUHWJQFa@RQJMHMHKJo@f@a@^[VQNKHIFSHOHODKBQBA@M@M@O?O@O?IAIAGCGCMEKE_HwDWM[OWMw@Yo@Ua@OaA]a@QWM_@UYS_@WYW[Y_@]g@g@SSUSSSSS[[QSUSSQQMOMOIIEIEOIIEWISIe@QYIq@Sm@QYK]Ke@Om@OUISEMCOAQCK?K?O?K?K@QB_@Fc@H[FiAVq@Lm@J]Fi@JQBS@S@O?QAYESEQGSISI_Ac@e@W[Oe@SKEICOEQEUEUE[EQCe@Ei@ESCMCMCMEKCMEQIQIOIMGKIUMOIMIKIOKOMUSQSKKKMOSKMSYU]g@u@m@_Ai@{@a@m@Ya@W]SYSYWYY[kGiGaAiAY_@]g@[e@W_@aA}As@iAy@qAw@oAc@m@g@u@g@y@]g@QWMSYa@OSa@e@Y_@UWSWY]UWa@c@WWEGeBiB}@_AeAgAy@}@k@k@k@m@[_@_@a@YY[[[[_@]YWUSWQ_@Yg@][WQMQOKK]]MSKQIOISKSO_@Sg@KUM[Qe@Si@Qg@So@Oe@GUI[GSESGWMm@EUGUGYI]EMCOGUK[IWISQe@KYMYQa@Qc@Se@Qc@O]Ui@o@wAO[MWOWMUMUIKIKGIQUoCsCa@a@i@o@[_@y@gA[e@a@i@_@g@SYY_@g@q@]a@]_@_@a@[YYY_@]g@e@y@{@e@e@]]e@g@WYWWY[KKg@k@Y]SWGG[_@g@m@SWqBcCe@i@w@}@SQYYQOQMMKGE"
 },
 "start_location": {
 "lat": 48.7121947,
 "lng": 34.6228737
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "32.1 km",
 "value": 32127
 },
 "duration": {
 "text": "27 mins",
 "value": 1613
 },
 "end_location": {
 "lat": 49.1451764,
 "lng": 34.2038779
 },
 "html_instructions": "Slight <b>left</b> onto <b>вул. Кірова</b>/<b>вул. Подолянська</b>/<b>ш. Полтавське</b>/<b>P52</b>/<b>T0441</b>/<b>Т0441</b> (signs for <b>ПОЛТАВА</b>)<div style=\"font-size:0.9em\">Continue to follow ш. Полтавське/P52</div>",
 "maneuver": "turn-slight-left",
 "polyline": {
 "points": "qpviH{woqES?G?E?E@G@E@GBGDIDMF[TMJMJKJILGHCFEFGJELELAHEJALCPCXAL?J?L?L?`@?f@@b@Bz@@p@@n@B|@DpA@|@BnA@dA?VA^?RAVATC`@C^Cj@ADQ`COxBGnAMdBEr@IzAMxBEt@E|@Ep@Gv@En@Gx@KxAGv@Gp@Cb@MrAStBYzCWfCKlAGl@Ip@E^G`@EXEVGZKb@EPETGRGRK^KXKXKVGRMXUf@IRSf@_@x@y@hBw@jBm@tAe@dAa@|@a@~@GPSf@MXMZO^IXITM^Wz@YbAg@dBa@rA[fAUt@y@xCo@xBw@nCm@tBa@zA[fAQn@Up@M^M^Od@KVIRWr@Yn@Wn@Wn@kEtJiCzFUd@a@~@k@lAu@bBgA~Bu@~Am@rAg@dAa@|@c@|@u@|Ak@hAa@|@cAtB}@nB}@jBWl@eAvBoAnCcAvBq@xAgA|Bk@nAwBtEuBrEeBtD}AfDcAvBiA`Co@tAeAzBk@nA}@nB_ApBaApBm@tAo@rAq@vAm@rAy@fB{@fB}@lBu@|A{@jBc@~@[n@g@dAi@jAA@a@|@c@`AYl@KT_@x@c@`A[n@o@xAUd@MX[r@k@lAc@`AQ^Sb@c@~@Yn@Yj@q@xA_ApBYj@_@t@m@pAe@`Aa@z@e@`Ai@hAk@jAu@|Ag@dAa@x@g@bAs@xAYl@CDc@x@k@`Ae@x@g@~@w@pAgAhBiB~Cm@bAw@pAy@vAqAxBoAtB}@zAw@rA}@|As@jAs@jA]j@Yf@U^Ub@u@rA_@l@a@n@}@xA[f@QV[`@WZW\\WZOPMNYX[\\[ZWXg@f@[Zk@l@i@h@SR_@`@k@j@g@h@YXY\\kAjAg@f@c@b@STe@f@g@h@a@`@WXcAdAm@n@u@v@o@p@k@l@Y\\YV[^w@z@y@~@s@v@w@z@w@z@i@l@o@p@WZk@j@gAlA}@`Aw@z@_AbAmApA}@bAy@|@q@r@eAhAq@r@[ZUVc@d@u@x@_A`Ao@p@s@x@q@r@}@~@w@z@a@b@_@`@{@~@aAdA_A`Aw@z@o@n@k@l@YZgAhAk@n@c@b@UVa@d@w@z@o@p@q@t@YZ_@`@SRUXOTMTQTEFEHEHEJEFCFOPY\\YX[\\aBdBSPSNKFGDIDIBKBMBMBM@OB]DI@uFX{@Hm@FYDa@Fs@Pi@NA@y@RSH}Ad@cAXgAZMDc@JgA\\yAd@MBWHu@T[H_@JmA^QJMFMJEDEDKHKLKPGJS^_@p@k@fAk@fAk@jA[j@]p@MVy@zAcAnBa@x@m@lAq@pAc@~@[r@O\\Yl@Sh@Sb@_@`Aa@bAi@pAc@jA_A`Cq@dBg@lAk@tAYt@Wp@Wr@[x@_@bA_@dAWp@a@fAYv@Ob@]bAc@lA]dAWt@_@dA_@`A]`A[`A[z@[z@Up@Sj@[|@Wt@_@dAk@dBYx@Yt@Wt@Un@M\\KVOZKXKRIRS`@MTMVa@p@e@z@e@x@[j@_@p@e@z@Wb@e@v@U`@c@v@Yd@c@x@Ub@q@tAUj@Yn@Sh@Sf@Qd@]z@Yt@Sh@e@lAUl@Sf@_@|@]x@c@jA[v@Wl@Yv@Yp@Uj@{@rBYp@Wn@O^Wl@OZMZS`@Wf@Yf@Yd@[h@_@p@[h@e@x@g@z@g@v@[h@g@|@i@z@e@z@e@x@c@r@k@bA]l@[h@m@lA]r@a@x@Wh@O\\MXUh@_@x@Q`@O^c@dAQd@g@rAo@`B[r@Yr@[x@[v@{@xBk@vAc@hA]z@Wp@m@vAy@vBgAlCw@lBe@lAg@lA_@z@e@dAMVO\\OZa@t@Q\\QZa@p@Wb@a@n@]h@[f@e@v@W^Yd@aAzAiAfBkAjBu@lAEF{@tAo@dA{@rA_@n@k@|@e@t@U`@a@l@]h@q@bAm@~@g@x@u@hAaA`BkAlB}@tA}@vAmAlBkAlB{AbCkAlB_AxA}@vAm@bA{@tA_AvAeAdBcA`BmAnBsAvB_AzAm@~@s@fAq@hAq@fAm@`Ae@t@i@z@q@dA_AzA}@vAy@rA}@xA{@tA]h@Wb@o@dAs@hAu@hAo@bAu@lAi@z@o@bA_@j@kAlBaAzAgAdB_@n@y@rAa@n@_@j@_@j@o@bAa@l@c@r@g@t@OXU\\c@r@Yb@Yd@Wd@Q\\a@t@[l@O\\S`@MZMXO\\MXUl@Od@Od@Of@K\\K\\K\\Kd@K^Qt@S`AS~@Qv@UpAMp@Mv@WbBSnAq@nE_@dCU~AUtAUzAObASnAO|@Kf@Il@Ml@Mp@Ih@K`@Kd@K`@I\\Mf@Ql@M`@IVKXITQb@KZ[p@Q^MXKTMVUb@OVKRS\\MTSXU^a@l@QROPYZOPUTQPONQNc@\\MJc@Z[VUNe@Ze@Xw@f@w@d@QJSJ[RSJy@f@c@VULk@\\i@Z]R{@f@e@Vi@\\e@VSLu@b@aAh@s@b@k@Za@Va@Tu@d@u@b@YP]PWNYNUL_Aj@s@`@eAl@i@Z_Ah@w@d@k@\\y@h@w@f@gAr@YPq@f@m@b@uAdAqAfAe@`@a@^_Av@o@j@u@t@c@`@gAfAe@d@_@`@{@`A_AbAm@r@k@r@[`@a@j@ORMPS\\MTOX]p@Wh@k@hAUb@Yh@c@|@Yl@i@dAa@v@c@z@q@tA]r@c@v@]p@]p@o@pAi@bAa@x@g@bAgAzB_@t@i@bA{@dBg@bAo@lA{@fB_@r@Yl@y@`B{@dBiAxBmAdCe@|@{@fBk@hA]p@e@~@a@v@_@v@g@bAc@x@Yj@_@v@g@`AO\\Q\\GPIPEJGNCHEJERGRGVCRETCNCPCXATC\\EbAGjAOxDEdAa@tGATCXC`@Eb@AHE\\CZGd@EZG\\G\\ERKb@Qt@S|@Qr@Sv@Sv@Qp@K^YbAc@zAa@xAUt@St@Of@M\\M`@ITIXKZIPIRKXIRKPIRMRKPIPU^KPIN_@j@QTg@l@[\\STa@`@[Xo@p@_A|@y@x@YXYXm@l@k@j@c@d@a@d@[^}@jA}@hAaAlA{AlBiAvAy@fAs@|@]b@wAhBq@z@mAzAw@bAq@z@_AjAm@x@s@z@e@l@[`@Y\\k@p@i@j@e@f@c@b@_@\\g@b@]V[Vc@X_@VYP]R[PWNYNa@PYJg@Rq@Ve@Nc@NiA^_@La@L_@JE@{@Pq@NK@MBQB_@BqAHkBLWBQ@G@g@Dq@FgBNq@Fk@DuAL{AJ}@Fq@Fi@DsAHk@Do@DI@k@Do@DQ@a@Bw@Ds@D_@Bg@Bs@Dm@D_AHmCNuAJuAHiAFoAFaAFaAFcAHcAFiAHu@DeAFq@Dk@DYDc@DSFOBODWHUHODi@RYLYL[N[PSLa@TOJWPc@ZMJOL[X]^WXa@d@W\\]d@a@j@INOT_@p@OZQ^e@fAa@~@g@nAw@lBWn@[t@Ul@o@~AYx@g@pAg@nAq@`Bq@bB]z@g@nAq@`B]x@s@hB{@tBy@rBc@dA[t@Yn@IPQ\\KPINOVMTMRKNQX[`@]^a@b@e@d@k@j@e@b@iAdAkA~@c@Z]T_@Va@Va@Ra@RWLSJYNs@ZiAh@a@Pg@VgAd@s@ZeAd@{@^aAb@uAl@yBbA{@`@gAf@oAh@{Ap@k@Vq@X{BbAkBx@mAh@kAj@s@\\s@Xm@Vm@Te@Pa@Pi@PGBk@PqA^UFQDo@NeATeBZw@N_@H{Bd@UD[JYHWLSJQJMHMJOJOLIHKHSTSVQRKNOVSb@MVQ`@KZKZGRGVK^G\\I`@Kr@O`AQjAOjASlAa@nC]zBc@zCQnAQjAg@`Da@rCe@xC[nBANIj@O`AWzAQdAUrASnAYhBm@jE]~BWdBIl@Gd@QlBKhAEf@KfAGp@K|@Iv@M`AK~@Il@Y~C"
},
 "start_location": {
 "lat": 48.9448924,
 "lng": 34.4923004
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.5 km",
 "value": 527
 },
 "duration": {
 "text": "1 min",
 "value": 71
 },
 "end_location": {
 "lat": 49.1498559,
 "lng": 34.2049254
 },
 "html_instructions": "Turn <b>right</b> onto <b>вул. Дніпропетровська</b>/<b>ш. Полтавське</b>/<b>P52</b>",
 "maneuver": "turn-right",
 "polyline": {
 "points": "kt}jHgmwoEiADOCuAS_C_@yAUa@GeGeAs@MkBYuAS"
 },
 "start_location": {
 "lat": 49.1451764,
 "lng": 34.2038779
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "51.9 km",
 "value": 51907
 },
 "duration": {
 "text": "47 mins",
 "value": 2836
 },
 "end_location": {
 "lat": 49.539102,
 "lng": 34.0614816
 },
 "html_instructions": "Turn <b>left</b> onto <b>вул. Шевченка</b>/<b>ш. Полтавське</b>/<b>P52</b><div style=\"font-size:0.9em\">Continue to follow ш. Полтавське/P52</div>",
 "maneuver": "turn-left",
 "polyline": {
 "points": "sq~jHyswoEC`@ItAIdBK|AOlCMlBGjAE|@I|@_@hGKlBKhBgAtReAjQw@xN]fGIdBU|DGjAIrAIvAKvAGfAGdAIxAOjCGxAMlBQpCKfBK~AEl@KtAM|AIjAEn@MlBM|AKtAOdBSbCU|CQpBWtCCXUlCGn@Gt@WxCOzAI|@ADKfAK|@MvAK|@Gn@M~@Ib@EVGVETELGVKZGRIRGPIRMXWl@[n@_@x@GNaCxEWf@i@fAs@vA{AzCWf@Q^[p@CFo@vAc@bA[p@AB]v@KRKTO\\S\\Q\\ILEFSZMPIJIJIJGF_@^WVSPiA|@}@n@k@^c@Zc@Zm@`@i@^wAbAiBnAe@Z}B~AaBhAqAz@yAfAaAn@cAt@mAx@qA|@mAz@gAt@cBjAwAbA_BhAiAv@sA|@eAt@cAr@m@`@o@b@w@h@YR[R_@V}AhAuA~@mAz@}AdA}@n@gAt@sA|@qA~@wA`AkBrAyAbA}AfA_BfAoA|@aBhAkAx@eAv@gAx@s@f@eAv@yAdAqA`AsAbA}AjA_Ar@mA~@w@l@g@^g@^uAfAkBzAqAbAsAhA_At@u@j@m@d@eAz@{@t@kA`AgBzAqBbB{@v@s@j@aAx@i@d@u@l@w@r@y@r@cAz@iA~@oAhAgA~@mAbAcA|@mAdAkAbAo@h@eA|@[X[T_@\\g@`@mAdA}@t@_Ax@aAz@e@`@y@r@mB`Bw@n@i@f@cBxAuAjAyAnA_BtAaBvAcBxAuAlAiA`Aq@l@qAdAeAz@q@j@_@\\cAz@qAfAiA`AcAz@yApAq@j@}@v@i@`@m@h@eA|@y@p@qAhAm@h@w@n@w@p@g@b@y@p@i@d@]XmAdAeA~@y@r@{@t@qAhAiA`Ay@t@}@v@g@b@i@d@i@b@e@^wAlA{@t@w@p@_@\\YT_Av@e@`@aAz@_@\\e@`@gA~@YTa@\\k@f@o@h@c@\\c@`@WT_@Ze@d@e@d@[^OPQRGHGJOTOTMTU^_@l@}@|Ay@vAi@~@g@z@_@r@c@t@m@dAaAfBg@~@sBxDmCdFWd@iF|JMRYh@Q^e@x@i@fAa@t@Yh@}CxFg@`Ao@hA{@`Bw@xAm@hA}@bBk@bAi@dAw@tAw@xAc@v@mBnDaAjBmCbFOVi@`Ac@v@KPKPGJIJKJORMJKJMHIDQJUHIBKDKDSJKDKF_@VYPi@^[T{@j@sAz@YTOJUNcAr@UPy@l@m@d@i@^cAt@iAv@UPQLk@b@m@`@g@\\m@`@w@j@u@j@eAr@i@^WP[Tw@h@w@l@gAv@wA`AoA|@_An@sA|@}@n@y@j@_Ar@gAv@{@l@cAr@wAbAwBzA_BhAe@Z_@Vm@b@oA|@a@VkAz@m@b@}@n@u@h@q@d@k@^a@Xa@X{@n@eAt@cAr@aAp@kAx@{AdAo@d@g@\\_@Xa@XcAr@eAt@qA|@eAt@kAz@mAz@}@n@o@d@q@d@k@^o@f@aAp@mA|@{@l@{@l@i@`@o@d@e@Zi@^m@b@w@j@q@d@s@f@iAv@s@f@m@b@c@Zc@Xo@d@o@d@i@^c@Z]Vi@^o@d@_@V]Vk@`@c@Xk@`@q@b@e@\\q@f@o@b@s@d@o@d@_@Vk@`@}@l@c@Zg@\\a@VkBrAiAv@s@h@iAv@{@n@c@X_@Va@Xc@Xy@h@y@f@]Vu@`@c@Va@TYP_Ah@[Pk@Zo@\\_Aj@u@`@y@d@eB`AmAp@oBfA}BpAkAp@q@`@{@h@iAn@k@Z_@RkAp@g@Xy@f@mAr@m@\\m@\\m@^q@`@s@`@s@`@i@Zw@b@m@\\a@Vo@^m@^k@^u@f@c@Zg@^SRQNUVOLKLMPKLWZk@v@q@|@y@fAu@dAg@p@_AlAm@x@Y^c@l@e@p@e@n@m@x@qAfBaArAy@hAiAzAq@|@_@f@eArAi@r@c@l@kA~Am@|@a@j@aAtAqAfBaApAcAtAg@p@i@t@_@f@qAhB}@pA_@f@c@n@{@lAe@n@u@`A]d@wBvCo@z@m@z@}@lAu@fA_AnAq@`Ao@|@m@|@Y`@_@f@m@v@g@r@a@h@uAlBm@z@k@v@y@hAg@p@Y^m@|@k@z@eAxAsAjBw@fAy@hAa@j@g@r@k@z@i@t@_@h@{ArBq@z@m@v@a@b@UV_@^YXu@l@_@Z]T]TULMFKFq@Vq@Vo@Tg@Po@Rm@PiAZuA^c@NYFmBd@eB`@qAZyA^oBd@gAXcAVsBf@{Bh@aATyA^qAXuD`AmCl@uA\\uBf@iCl@}Bj@qAZkAV_B^uAZcATwA\\oAXuCn@_Cj@yCp@mBb@cB`@gBd@{A\\_B^uA\\mA\\i@PaAVy@Ry@Ta@JgAXg@L}@ToA\\wA^o@NuA\\wA\\oA\\c@Jc@JqCr@_Ct@{FrBiE~Ag@ReJjD}DzAiE~AiC`AeSpHyAj@oCbAsAf@{Ah@gAb@{Bv@oBr@oC`A}I~CaA\\mAb@oBr@iFlBoGzBaDjAcA^kBp@oAf@oAb@c@Po@Tc@Nk@Pi@Re@Nu@Rm@PUF[Ha@H]FYF[Fa@Da@FyBVk@Fs@Hc@F}@H}@Hs@HgAJ{ANqALwBTcALo@Fq@Hs@Hg@Hc@DcAJg@Fo@Fc@Fe@Fg@Du@He@Fk@FmANy@H}@Jw@JwAPu@HaALcALuBVyAN_CXuAPyAPu@Ho@H_BR{APmANqANkALqANk@F{@Jm@FcBR{@Jy@Lu@Ho@Hq@Hw@Hs@Ho@F_BRiALeALkALuAPwANu@Jw@HcBPqBT}BV_BPs@H_AJo@FsANq@Fq@HsALmBRqCZyAPyAN{BVuBT_BPcBPmALa@@MCMCI?K?_@Bw@Hg@Ds@HoAL}APoCXoBTaCXkBVgCXwBTwAPkALyARw@Hq@HeBR]D_@FYFMDODEBGBGBMJWXMPQRs@`A]b@]f@}AvB{@hAa@l@UZc@j@SVKPCDADADAD?@ABABADEHa@j@sAfB}AvBo@|@m@x@c@n@[d@W\\qAjBk@v@eAzAkAbBw@hAiA~Aw@bA[b@i@p@]d@k@v@m@x@m@x@g@r@m@x@{@lAi@r@_@h@e@n@a@h@k@v@_@f@_@h@{@hAuAjBs@`Au@dAe@n@w@dAwAnBeAzAoAbBw@dAmAbBcAtAeAvAgAvAcAtAq@|@}@nA{ApBiAxASXQRONMLKHGDIHMFIDq@Xs@Ve@R}Aj@y@XyBz@m@TcBl@a@NgA`@}Aj@eC~@kBr@yAj@uAf@w@XoAf@g@PKBI@G?K?K?O@gBl@iA`@sAf@_Cz@wCfAeBn@}Al@}@\\aBp@m@VgA`@k@TqBv@e@Pu@ZaBn@{Al@a@Pm@Te@Ps@XcAb@i@TqAd@qBt@{@X{@Xk@Pg@PwAb@w@VcA\\w@VgA^oC|@qBp@eBl@kA^gBl@aAZUFk@Po@Rg@Nq@R}@T_@Je@H[Fs@Ls@Lq@Jy@LcANqBXy@LyARaANgC^_ALmBVcALoAPcAPk@HwB\\kBXmBZu@JaAPeBXcANw@LaBVy@RMDQFUJg@XYNgAr@k@`@i@\\k@d@]Xe@`@_Ax@c@^u@j@[ToAv@}@h@EDWNq@d@oBlA_BbAe@ZgAp@qBpAu@f@w@j@y@l@iBrAgBrA_CfB{@n@eAt@MFaC_AqAe@}@]}@]eAa@e@Om@U{Bw@mCaAcBm@w@Ws@Yy@]}Aq@oBcAmBcAaAi@_B}@iAo@u@c@w@g@{@g@_Ak@q@_@kAw@i@]q@i@[WOKqI}HgJwI_DuCkBgBqBkBuBoBaC{B}AyAcAmAgAsAgAyAcAuAgBeCoAaBu@eAq@}@c@m@e@o@iBgCeB}B_AoAkAaBmAaBa@m@[g@MUKQQa@{@iCgAeD}@qCy@gC{@gC_AuCaAqCc@sA[{@Wq@Ug@Ys@Ui@y@iBk@sAWi@gAgCu@cBWm@OYSa@OYQWQYMQQWSWIMIIUUWYWUs@o@u@s@m@k@y@w@iAeAu@s@eAaAmBiBc@a@_ByA}@}@y@w@eAcA{@w@w@s@}@{@kAgAeAaAkAgAgAaAu@o@gAaA{@q@u@m@wAgAoAcAgCiBmBwAoByAyAgAeAy@aAs@aAs@aAs@gCmBwPeMoHqFc@]iA{@}@o@kA}@u@g@]SOIm@USIUISESESEMAg@Ci@?]A_@@w@@k@@mC@{A?a@@yACaAIWC[Eg@Gc@Go@Ki@IeAQ}B_@q@KoASy@O}@OYG]GUGWISISISIGG_Ak@YSYS][OOOOQQKOMOSWc@m@e@q@IMyDqFqCaEq@_AgBkCgBgCwB{C}@sAg@s@gA_Bg@u@a@m@y@oA}@yA_@k@o@cAy@sAsAsBgBsCq@gAm@aAWc@Wc@k@}@}@uAuA{B{A_CiByCqAuBoAqBgAgBcBoCmAoBwA{B{@uAm@cAkByCgAgBsA{Bg@{@i@}@Uc@We@]s@Yi@cGsMe@gAq@}Ak@oAQa@i@mA_AsBmAkCcCmFo@uAk@mAk@qAm@oAs@}AiAgC_AqBgAaCWk@c@_Ae@eAOYQ[Uc@c@u@Ua@a@q@Yg@c@u@k@_A]k@a@o@cAaBaA_Bq@eAMUc@o@w@oA{@sA}@uAuAyBgAeBa@o@Wa@aAuAaAyA]e@S[]g@e@q@SYY_@W_@WYY_@Y]]c@_@a@UWc@c@gAeAgA_AeAy@o@e@gBsAqFuD_BgA}DmC[SgAw@a@W[UYUWS"
 },
 "start_location": {
 "lat": 49.1498559,
 "lng": 34.2049254
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "1.4 km",
 "value": 1409
 },
 "duration": {
 "text": "2 mins",
 "value": 94
 },
 "end_location": {
 "lat": 49.53238020000001,
 "lng": 34.0780265
 },
 "html_instructions": "Turn <b>right</b> onto <b>вул. Новосанжарська</b>/<b>ш. Полтавське</b>/<b>P52</b> (signs for <b>НОВІ САНЖАРИ</b>/<b>ХАРКІВ</b>/<b>КИЇВ</b>)",
 "maneuver": "turn-right",
 "polyline": {
 "points": "krjmHgs{nEh@yB`AcDj@oBj@kBf@_BnE_Ob@uA`@uAt@cCvAyEjDcLZaA\\gAtAoEd@}A`@oAV{@Tu@v@gC`A}Cj@gBX_A`@oAJ_@BOBKFQ"
 },
 "start_location": {
 "lat": 49.539102,
 "lng": 34.0614816
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "6.5 km",
 "value": 6494
 },
 "duration": {
 "text": "6 mins",
 "value": 388
 },
 "end_location": {
 "lat": 49.5813164,
 "lng": 34.1095087
 },
 "html_instructions": "Turn <b>left</b> onto <b>ш. Полтавське</b>/<b>P52</b> (signs for <b>ПОЛТАВА</b>/<b>КИЇВ</b>)",
 "maneuver": "turn-left",
 "polyline": {
 "points": "khimHuz~nEg@_AOQKOOOIKi@m@o@u@UWi@o@a@c@k@q@o@u@]]SWU[MOMOOQKOOQQU[c@aAyAq@cAg@w@e@q@k@y@MSo@_Ag@u@S[W_@OSWa@o@aA{@oAw@iA}@sAo@_Ag@q@QSMQGIGGKMKK]_@QQg@g@q@s@u@s@m@m@cAiAs@s@aA_Ai@i@qBoBwByBwBuBcBeBiAiAgBgBw@u@aBaBaBaBiBgBe@c@IGKIKGKGICGEMEy@WyAa@eCq@eCq@qBk@sCy@iA[{Ae@u@SeAYcAY_Be@iA]CAECGEGEEECECECEEEGMc@_Ao@wAm@yAk@qAIQIO?ACEEECACCGCI?G?E@E@EBEDGDIJgC`Dc@h@uAdB{@dAa@d@aBtBmA~A_AlA{@fAUXaCvCy@~@g@j@y@`Ac@b@KJOJONMHKFKFKDe@TYJYJSDa@JKBQBM@M@Q@O@Q?S?YCSAUC[Em@Go@K}Cg@qAU_BYaDi@iBY}@Oq@Ma@GQEMIUOg@[g@_@i@e@[WsAsA}A}AqAsAu@{@g@o@SYU]Wc@Ye@m@cAa@w@[o@c@_AeBqDUe@sAqC_@y@OYEK_@w@i@gA]u@s@_Bi@iAo@qA[m@Ue@e@s@]i@g@s@]e@_C}CiAwAOOMOMM]]USWU{@q@c@[m@c@c@Wg@[]Uk@[[QiAq@y@e@i@Yw@_@iAi@eGkCmEmBCECCUIMGIIIKEIACAC?GCSAU?E?CAC?AAAEC"
},
 "start_location": {
 "lat": 49.53238020000001,
 "lng": 34.0780265
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "4.7 km",
 "value": 4665
 },
 "duration": {
 "text": "3 mins",
 "value": 176
 },
 "end_location": {
 "lat": 49.5824948,
 "lng": 34.174148
 },
 "html_instructions": "Merge onto <b>Е40</b>/<b>М03</b>",
 "maneuver": "merge",
 "polyline": {
 "points": "gzrmHm_eoEC{BEsFi@_m@aAeiAIiKC_CC{EImLCsGCiHGuLGgKCqHEkHAeCAoDGoLE_GA_FCeCAaCK}Ig@_a@IqHK{HC_E?_B@oA?u@@k@B}@@gAD}@JkEJeEDwABoADkD@uA@wA?wAA{AAwAEkC"
 },
 "start_location": {
 "lat": 49.5813164,
 "lng": 34.1095087
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.1 km",
 "value": 143
 },
 "duration": {
 "text": "1 min",
 "value": 31
 },
 "end_location": {
 "lat": 49.58261599999999,
 "lng": 34.1739169
 },
 "html_instructions": "Slight <b>left</b> toward <b>Е40</b>/<b>М03</b>",
 "maneuver": "turn-slight-left",
 "polyline": {
 "points": "qasmHmsqoEEECEAE?EEwA?GAEAEACACCCECE@E@EDCFAFAD@HHv@BTDXDXFT"
 },
 "start_location": {
 "lat": 49.5824948,
 "lng": 34.174148
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "302 km",
 "value": 301893
 },
 "duration": {
 "text": "3 hours 19 mins",
 "value": 11949
 },
 "end_location": {
 "lat": 50.3997041,
 "lng": 30.5640302
 },
 "html_instructions": "Slight <b>right</b> onto <b>Е40</b>/<b>М03</b><div style=\"font-size:0.9em\">Continue to follow Е40</div>",
 "maneuver": "turn-slight-right",
 "polyline": {
 "points": "kbsmH_rqoEFdB@bA@zA@r@?r@Ap@?jACpAEfDGxCKpDKzDIbDCzAA|B@pB@lC@hBHbGLhKFlFH~FDvEHpHFpED~EDtEB~FB`GBzFB~ED|F@bDB~EBnED`KDdKBvFDfGBtEBtEF~IBbDDzEHdKH`KHtIHlIBjCVdY^bb@DpEBfEHxIDlDBbCFbDFxDL|FDhDBjDFzF@vE?~E@p@AlDA|DAnF?nGAhCAdRA~D?vG?`DAvJ@rD?xH?HBbDDlFF`HDzE@nC@~D@bCAtA?dAGnFC|AEvBG|AGtAQjDKrAIlAMlAOxAOdAMv@_@zBa@rBYhAg@rBw@vCeAtDq@xBm@nB]bA_@dAuApDc@dAc@bAa@~@g@bAe@x@e@z@o@bAw@lAq@|@[^c@d@eAdAuBlBc@`@kPtNqAhAgDrCaBxAgGhFiGnFuEbE{DfD_ElDoGjF}DbDcEfDsC|B{BjBcBrAcAx@}ApAs@l@_BpAiA~@sAfA{BhBaAx@}AnA}BhB{BjB{AlAcEfD}BlB}ApAw@n@mAnAiAlAeBtB_BxB{A`C{B|D_FrKcRtb@gGhNCBqAzCsKfVMX_DfHe@dAuBzEoJlTcS`e@oGnOiGtNuD`JA@m@lAu@xAuC`FwB|CQXeCrC{EdGSVsGfI}KhNoDrEwCdEqFfJmC~EeGzKsFvJYj@yCpFaDzFy@~A_DjGuEnJcFfJmG`LcGvKiDdGoEhI_CbFmBtE}D`LaD|KaBnHsA~G}AbJu@hFo@hGgAjMuBpXiBxUm@zI}Cv`@iDhd@gBpUgCj^]xG?P?N@TUvCiAzN_D|c@gApNk@lI}@jMgA`OGn@iBxV_BdUyBhZSxCyBnZcDfe@g@rGIjAWlDSvCI~@a@rFEr@C`@SlCSfDALIjAEp@K`EIlCGpCMhFExAEfCE`CIzCUfLI`F?JEdEYvWKbLIdHCnBE|EQxOYlWYhWUbWGrFIvCWlKUxHOfGOxEi@tT]dM[bKM`CM~BOnCIpA_@~F]|FEp@EfAE~@CfAAdACvBA~EAtD?bB?l@CvE?@GfJSbQKxGCbACv@MxBYfD[fDIf@SzAUzAUnAWnAu@bD[rA]pAgAbDmA|Cw@jBwAdDkDpIqCvGsEvKiBlEGNk@vAm@zAY~@YbAK`@IXS|@S~@SbAO`AM`AK|@Iv@Gv@Iv@Gx@Er@E|@At@Cv@?r@AdA?pA@~@?B@fADbAL`C@RNxB^vE`@xEXtDHbAB\\Fb@Jz@^rBb@`BZhA^`Ap@tAv@hAvBtCvD`FtHtJb@n@BHFHLPp@|@d@j@nCrD`DvDtBtChAbBfArB^z@Vp@Xt@zAnEh@`BrA|DrA~D~@pCzAlEb@rADLBFDDD@x@xCj@rBTfAH`@Hl@NhAF~@D`A?|@?~@CdAGfBEv@Gn@Ed@Mz@Sx@St@gArCy@xBU~@Kp@Ip@Gp@GrAQdDM~CG~AYhHa@~J_@dJe@tKe@nLa@pIYhHCPARCn@UpHOrDIfBGjBSjHEhBCvBEhEAlD@vCBzCDnDRhINpDRlErAbUv@|M~@tPf@rI^rG`@pG^rGPzDFrCHpD@tDEzDIxCO`EQhCYlC]xC[|Bc@~CyArK{@hGc@lDi@jFS`CSfCQnCWnEQlEQ|EMlGClCApB?fF@bBBpBBnBDpBD`CJ|CFdBLrCPxC\\pFd@bHjAtPpCfa@|Cxd@fBlW|@dMLfBZtEx@xLjAdQ`Ebl@bDhf@`@dGf@zHt@fLF`ALnB^tFb@nGZxFNlDDvAB|ADfE@tC?@CpCE`BExBGlBQtDMrCWrFq@rQ_@|K[`Nc@pLe@`M]zII`CYfHI`COnEUpFUrFYvHOnDIlASlDu@dKIhAaA|Lw@fKeBrUa@nFy@tKeAnNiBlTGz@Et@@ZGj@wBpYk@vH{@bLiAdOwApR{B~Y_AzMg@`Ha@hFcAvMY~DEh@c@dGCd@Ch@CrDG|@QbDElAEnAEdBExBCdBEvCAbAErAEbAGtACh@MnBOzBO~Bi@`GWtCOhBKpAYnDw@fJmAhOaAjLcBjSuQ|zBGRERGh@Gz@OhBe@nG}ApRShCOnCM~BSzEOnEMjE[~QMpH_@|SMpE_@fKWxDYnE]~DQxBe@jE}AbMaCrQsArKe@nDyA`LqCrRO|@q@vDc@dCs@hDyArHeA~EqA`GiAtEs@jCi@lBm@nBgAhDoAnDy@|BoAfDkAxCiAhCcAzBy@bB{AvCkE~H}D`HuEjIuJbQaAfBkBfDqA|BaAdByClFkDfGmG~K{LpTyD|GaElHgK~QiFfJoHvM}ArCsCfFoAvBEH{D`HcClEmAvBoBlDyFbKoHxMeCnEsCfFwBtDmKjR{@zA_BrC}ApCmAxBoBnDmBlDuElIaClEuQf\\{B`EmFtJoDzGiCzE{LbU}BlE}AxC}AtCk@fAm@fA}AxCkAvBkAzBiH|MeCtEuApCu@|As@|AeAbCmAxCs@lB_BnEcCzGIPmAfDaAlCkA~CuBhG{BvGcCnHkAhDo@lBq@dB_A~Bu@fBaAxBw@bBaArBmA|BkAtBmApBsAxBkAdBoAdByAlBu@|@y@`AaAfAo@r@cBdBoBjB_CrBeDrCURmAdAYT_EhDyDjDaDrCeIdHoHtGmBbBo@l@uDdD}AtA}AtA}DhDwClC{KrJqCdC_BvAwBlB_CrBeGlFkN|LeNxLkM`LgFpEiFtEsAhAsCdCuBjBmCbC{ArAaB`BaAdAg@f@aAfA_AhA_AjAqAhBsAhB}@rAoAnBy@xAiArBu@vAu@|AaDhHyBnFkA|C}BzG_BrFeAvDk@vBi@|Bc@lB[zAoA~FoErSkC|LqDxPoJzc@wDdQeQzx@cAzEMh@aAhEmA~EqAvEcCvHsBxFsBhFcCtFk@nAcEhJy@lBcBbE{@~Bu@nBq@lB}Kf\\yCtI}BxG{C`Jg@hBg@vBiAvFwDjSsBdLoBtKmBhK_A~EI`@ARAd@yCpPmAtGeCbNeAzFi@dDk@fDmAtHmAvHUtAOjAYzBg@|Ds@bGGh@m@bFWrBU`B[nB_@xBg@hC_@~Aa@bBe@dBm@rBc@tAQf@a@pA_@dAg@|AwBzGeA`DQl@kA~DuBbIkDhNi@`C[`BWzAQfA_@nB_@pBg@rCe@bDO|@[`BUjAMp@Sz@U~@c@lBa@|Ak@pB_@rAo@jB]bAUn@m@dBk@rAm@xAkAjC{CbHWh@s@`As@fAk@`Ao@nA_@x@e@lAADO^c@hA}BpG_BjEuB`GyCpIsBxF_BhEKZMZeBxE_CjGaAfCu@hBkAjCYl@e@bAkA~BaBzC[l@k@bAuC`F{A|BeCrDgBdCqBbCgDvDcFtFcFtFcChC_HjHqAvAeCpCgCtCy@dAiAzAc@n@IHsApBy@nAq@hA{@vAuBvDuEjI}AnCk@fAk@nAw@bBk@pAw@lBg@lAc@jAw@xBg@zAa@lA_@pAUx@i@nBg@nBCJ_D~LcDhM{BfJu@zC]hAWz@c@tAg@vAy@zBkCbHCDOd@Md@K^Sr@Ov@Kl@M~@In@Gl@G|@IvAIhAMtAGj@I`@ETGTK^M\\OZSVOPMLQLQJUJSFe@HcAJ_BNG@iAFu@Fm@De@Fo@Jc@He@Ni@Tg@Z_@VYR{@r@c@\\_@ZED]ZeCrB_CtByCfC_BrAiA|@eAv@{AbA{A`AgBfAeB|@qF`CuEpBwFbC{IvD{Al@kBx@mD`ByClA_EdB}CnAqBr@mA`@gAXwCv@qAZ}AXeC^{@JSEg@?aDZ}ARmCTkBLcCNsHXyMb@uIZmCRgFp@uJpAsInAuBZQDoDt@mAZiA^_AZs@VgAh@YLyB`A{CjAaCt@u@Py@LaANqALoDTwCPoG^eCLkCReBLcD`@_F|@}Cv@yDhAqExAwAf@eAb@aCv@_Cv@aCv@iC|@sA`@qMjEoHhCsFrBgNlFsGzBeG|BsBv@wCzAsBhA{ClBeClB}BbBeCxB_A|@mBjB_BhBmBzBwBpCmBlCuBbDsFtIuCrEyBjDgFbIW`@aBhC_FvH_HpKoEfHsIzMmE~GeDlF}DhHuExI}DvHyDdH{F`LwB~DkBpDsAdCgAdBgAbBOTKXcAdAy@r@o@d@e@Z{@f@u@^IDE@s@ZA@ODs@Re@Ni@Lc@H[Fk@F_@Bc@?iCCaBE}@Ew@As@Ck@CiAIkBMo@Ew@IqAMgCYeCe@oCo@IAGAK@O?MC[IcBe@o@QwCu@cCg@yAUoBUgAKu@Go@EyACyAC_AAaAAaA?k@@g@@gADk@D}@Hm@Hg@HaANi@J_ANi@Lk@PsBn@w@Vi@Tk@VoCrAuCvAqAp@_@RSN[TuB`ByC~Be@`@a@\\a@^c@d@_AfAqA`BgA|Aa@n@Yd@W^]l@mAtBsA`C}AlCi@~@k@`AaBvCkCpEEBGHuAzBoArB}AlCo@dAa@j@]f@MP]^]b@g@l@o@p@[X]X_@\\k@b@_Ar@i@Z_@R[Lm@Xo@Tq@Rs@Pw@Nc@F_@Dk@De@Bi@?m@?c@AqBOu@GKAIFGHIJsAOq@IUCQ?SAcAGgBU{AOwAMuAMuAI_AGoAEgBM}BU}AIiAEwBEiAAmAAg@@c@@s@DmBHeAF_AF_BHiADiAFoAFoAJ_BPoBTs@J{@LqATw@NuBb@oBd@}Bn@iBj@eA^e@Nq@Xs@ZeAf@yAp@kAl@g@Vu@`@w@b@_B|@o@^g@Zo@`@u@f@}@n@qA`AaAv@aBrAw@p@eA`AsAnA}A|Ai@j@cAdAyAdB{AfBY^u@z@_AdA}AfBwB`CsDxDqDnD}@z@qBjBuDbDwDbDgFbEsA~@wAjAgAx@u@l@gA|@iAdA[Z{@x@aAbAyAbBq@v@u@z@g@l@_AlAo@|@iA~Ag@r@{@rAo@dAm@dAm@bAk@bAc@z@u@xAyArC_BbDQXsApCw@|AYj@aCrEmCpF{@bBi@fA}@jB[r@g@lA_AxBO\\k@zA}@~BQf@Qh@{@fCyApE[|@Ur@cBbFaBjFi@bBq@|B]nA_@xA{@lDG^UbAIZQz@S~@g@bCe@~B_A~E}@tEu@~D{@tE_A~Ey@hEc@bCeB`Ju@`E_AbFu@pDwAtHMr@Mp@Mz@Mt@Ir@In@E`@Eb@Gr@GbAG|@Cv@C~@CbBAnA?j@?J?N@N@B?D@B?H@zA@fBBvD@~B?hACtAEzAEt@KrAOrAK`AQjASlAWjA[hAUx@Sj@Wt@Sh@_@z@k@jAe@x@c@n@e@r@a@f@k@l@o@n@k@d@qAjAy@r@cAz@cAx@_Ax@_CpBoAhAi@l@_@b@a@d@ORc@r@e@r@]j@Wd@Yl@Ud@Uf@e@jAWr@Qb@MHOLGLIN[bAs@xCq@vCw@rDe@nCQ|AMz@KnAOzBGtAC|@CxAAJ?\\Ar@@H?h@@NL|EHpEJjDNfGLjE@h@JbELpEJbFDjBDdDDjD@fCBtH?jCAbDCxGAdAK~MC|CKdMMhNAhBC~CIpMIrJCjD@fDBvCDzAFxBH~BL~BJ~ALdBR|BTzB^xCb@`DtCdTXtBzBbPdArHfAbI`@zCnAbJxDtX|@zG|@pGnAdJ|@pG^xCZ~BtB~Nd@bD`@xCN~@PvAl@jE\\lC`@fDpAfMRdCFl@PfCNlBNxBJzANdCTxDLpCJpCZ`INnETrF\\|J@\\PlE^tKb@zKJpC@h@P`EZtJLnD^`JVtGHnBBt@\\bJDbAJzCDhAL~CFlBL|DDhCF~EBlF?`G?`GEzFChBMtFIdDKtCIxBOzCW`FQxCU~DYvF]xE]zD_@vD]vCS|AYvBUzAgA`He@jCS~@}@hE{@|DYnAa@`Bc@fBc@vBcA`Ey@nDkAvEAH}@xDy@lDqBpIaBbH}ArGoAtFcA|E}@tEiAxFeAjFk@pCgAzFmAxFy@fEk@xC}AxHkBbJy@xDaBpHc@jBaAtDeAxDCHcAxDaAtD_B`GoAxEgAfEqAvEwA~EiBzFkArDw@fC{@rCkBfGs@zB[`A[bAo@jBe@rAi@vAO\\iAtC_A~Bc@bAe@dA{ErKcAzBi@lAUd@{C~G_FzKaAvBgAdCmGlNoGlNcIfQUf@iFbLgKbU{KhVaDdH{FdMwEfKaHdOcIjQmAhC{CrGgEfJyNr[oD|HIN_BlDgGzMmDzHo@vAs@nAoAnC}C`Ho@vAEFeCnF_D`H_BjD{AdDaAtB{C~F{C|FmCdFcE`IqBvDsAhCuAjCuB|DoA`C_B|CgArBu@xAsCnGmGdO}@tBi@pAcA`Cw@jB[x@gBfEgCbGqAzC_AzB{CbHaAxB}AhDsCjGc@dAoAlCwBvEiAdCgA`CwBtEk@lAmDzHmIxQgL~VoFnLuBpEmBfEiB|D{AjDeBbEgBhEeBdEeBbEwAlDyAlDcB`E_A|BeBfEeDbIwDbJ{ApDwB`FINsCrGyB~EO^yAdDi@jAaEdJuBxE}AlD}EvKoCfGkBdEg@hAq@`B{@vB_AdCo@hBa@lAm@fB]jAu@nCq@~BUz@]tAc@nBm@lCYnAs@rD_@rBy@hF]|BYjB]lCa@hDMhAS~BKhAWjD]nFEx@S~DK`CGzBEtAExBGdEKfGKzGIrEGxDKvG?ZK~FIvFMdHGpEQlMGdDGbCK~CK`CKxBMzBYjEQvB_@jEc@dE[lCWlBYrBk@xDWxA]lBu@`E{AfHq@pCi@pB{@|Cw@jCo@nBM\\]bAm@dB]~@o@~As@`Bs@bBaAxBwGdOcDnH}AlDq@`Bc@~@gB~DkAlCiBhEsCrGsAxCgAxBk@hAs@tAw@tAe@x@mAnBw@nAuApBq@~@aBxBq@|@gApAiAlAsHlIwLxMyAbBcAdAyAxAyAvA}ArAgAz@o@h@sBzAcBfA_BdA}BvAkDtBaEhCmAx@cAv@gA~@aA`Ag@h@q@v@i@p@oAbB]f@u@lAS\\Wb@c@x@Q\\u@|A]x@e@dA]~@a@fAeA|CEPENmAzDSn@ObA[z@a@bAq@`BeA~By@bBu@rA{@xAuBjDwBjDiCdEuBhD_D`F_AxAaBlC{A`CkAhBaBjCqApBs@hAgA|Ak@p@mBrB_BzAaAz@o@f@y@h@eBdA_Bv@wJnEsDdBsCpAgF~B_H`D}BbAmB|@}DfBaEjBYNeAb@y@^wCrAyBbAkAl@{BpAgAt@q@f@q@d@cAx@gA~@m@h@eAdA_A`Ao@r@i@l@}@hAk@t@kAbBm@z@e@t@iCdEk@~@g@x@w@tAy@|Ac@~@q@vAs@~AwA~CgB|Du@fBYp@cBrD}ApDw@dByC~GyHdQyB~E}H|PqEzJ{B`Fe@dAgBzDoAnCoCbGYl@s@~A{CxGiBzDsE`Ko@rAwBpFkBxEaAfCwBdFqA~C_B`Ei@pAc@fA]|@wBtF}@fCkAfDeAfDY|@{@rCy@rCiExN}AbFaFjOOj@}@jCwAtEeCdIY|@gB~F{A~E_V`w@uArEu@bCsCfJeB~FeIzW_F|O{@nD{BpH[`A{BnHiEjNi@hBkBfGs@|Bq@|Bw@dCcA`Ds@bC{CxJwF`R{@nCqAbEQl@_BjF_@tAg@nB]~AYpA[~A_@tBW|A]|BUnBShB_@rDOpBG|@G|@IjAGxAOfE_@hK]jKK`DIbCShGI`CIzBOjFE`Bu@pWOvGO~Eo@fV?VOpFI`DQzGG`CWjKMrEk@fT_@bOm@xUWdK_@tRg@nTc@tTw@p[ErBGdCMdFOxGIlEMdFEvBIrDa@~PCfBKvEGvDYlMG`E_C|eA]xN}@zb@eBbx@k@fYm@tWUpJ_@fNK`E[jKk@xT[vK]~L_@rMM`FGvCCfCEtE?bB?|@@xDD~EFlDJbEFfBPhDPpDZ`Fj@jHb@`Ed@tD`D~SdAnGd@zCtBpMtDjU|Hte@z@zFXjBhCbPPjAXfBnAxHvCzQ|J~m@lIfh@dHbc@pB~LlEtXJj@|BrN|EfZfDpSlB~Lt@tErD~TBPbEbW`AnG`AdGtA`Ij@|CtA~Gn@xCNj@dRdy@\\|AxH~\\fAzERz@`ErQr@`Dr@|Cn@vC`@xBZjBX`B\\dC`@fDTfCRhCHfARjDHjBHlCDfBBhC@xA?zAAlBAlCEnEMbLIbKAdAQtQMnMEjEEvE?LG`GCvDEhFMtLCnDGxGOtPI|IKdKEbECvBClDCxBAt@KlKItKOlQ]~]Y|Z?\\Gl@Ah@ShUMjMUzVGtGQ~SInIYh\\GnFIhIYv^CfDGdFCpBItLKjIIpJEbFCvCKvLEfEQnQGdHObPC|CKfLGtIM~LKzMUlVc@fi@YxZKvK_@nb@_@pc@E|EKbLGnJ]x^I|IGlGG~FMtOAbCExEAl@GfHCrBGbG?l@GfIOrROfPQ|SGdHOzNEnGa@ld@IxJIvJIbLGdHCrEUxWEtEKrLExFYx\\AnAEtEKdN?BIvJCfDShQS`XMhPEhEQrVQtRGrJGlGKtMItJAv@E~DC~CA`AEhHGlIC|ACbEUbXKfMMvNKxNMnNMdPCnDElEG`HKtNMpMUdYC|EG|FGbIKxOE`DCdDI|KErEGfHI`LGfHExFC`CGxBAnAM~FQvJMxFaBtx@WrMc@nSk@hYIjDG|CKhHE|FCfD?~B?pA?l@@bDBvABpABrABtADpAFlADrAHvALtBJlADn@JnALnANnAP|ARdBR|Ar@pEPjAt@lEp@pDPv@z@bEv@tDfBdIfA|EtFpVlBnIlBtItC~LxAdG`BhHtAfGj@hCLl@Ll@pKff@@D~V`iAfHh[vMjl@xFzV`ApExCrM~AjHJb@nBrI~BhKHb@dAvEnArFpBxIn@tCh@~BzBvJz@tD|@vDnBrItAbG|@bEvAlG`ArEbArE|A`Hr@`Dh@fC~@dE~A`HdC|KdC|KpFbVjBnI~BhK~DjQ`GvWpFdVfFjU|@`E`AzE`AdFf@xCd@dDf@fDNhAThB\\rCDd@b@fE\\tDTnCTdDNzBPdDPbDPpELlEFhDF`DB~B@~B@bD?`CCpEEdFCjAEtBObGOfDKzBKxBM~BS~COzBMrA?@QtBSvBSvB]bD_@|CYzBkAbJ{@|GiA|IcA`IQ|Aq@tFkAfJy@rGIh@aAvH{@~GsAjKiAfJcA`IcAxHy@vGcA~Hi@fEkAdJ{AvLmBjOo@`Fa@bD]lC{AtLqA`K_ArHc@zCe@dDe@rCUpAi@xCk@zC_@bBWjAYrAc@nBe@lBg@lBaAxDoAzE{A|FoAzEaAtDiBdHiBdHmAzEg@pBq@hCiBdHiBbHkBfHgBbHoAzEmA|EcAvDc@bBw@xC_ApD_BfGgBbHADmAtEq@jCs@pCIXyBpIu@tCgBdHkBvH{@dDSt@iD~MOj@a@`BSr@c@bBYfAuAhFkD|Ma@`BkAtE}AfGuBfIyDbOsB`IOf@sCpKmD`NoDdNoAzEyD`O_CbJiAlEgDtMaAtDk@vBcBvGeCrJgVr_AyDbOwFrTgAfEuDrN_CdJ_FjRcCrJoCjKyDdOmFtSwFnTiDvMyAxFmChKuBjIcBrGwBpI{A|FgB`HkD|MgB~GgB`HeCrJ}CrL}CzLyD`OkCfKqA`F{CtLgCtJuBlICF}AbGmCnKs@nCq@hCqFbT_@tAcGpU{DfOGTc@dBkBjHwBlIYvAiD|MwKnb@{F|ToDfNuo@jfCaAxDMd@yDjO}AdGiDzMeHnXcEzOYlAeDlMcBrG_@fBYnASfAYxAQlASlAKv@Iz@MjAKzAIrAE|@C|@CtAC|@A~@AjAApA?bC?hDB`DBhDFrIBdHDrMAnEAbAAxACpAErAGpAIrAGr@KlAUtBOrAo@nFiAbJ{BzQ{BxQqAjK{C`WmGtg@o@dF_@vCi@dEi@tEwAnLsApKgAhJ_@dDUzBWtCS~BSzBc@vFu@lJ_B~RCPeAhNsAzPqAbQeAbNQfCSdCcBbSi@zGiAtMe@~F_@lFs@fKW|D[zEe@hH[~E?H{@fM}@hNsAxSiAbQ{@nMa@`GoAnRYjEu@`MoAfRUfDM|BK|BMbDInBE~AOvFGbCUpJCrAGvBGhCa@tRQbHWlLGvCMzEW`Li@jV_@dPe@xRMxFa@pQUfK]|NQnHE~B?HIrEE|BCdDA|B?`C@zBDbLB|F@bHDlMRxg@BzJ@hI@pF@xDFrLBdL@xDBfGHtRBpI@|F@tBDrIBpEBnIBlID|M@lDFdNJtZFbPBzJ?f@HdPD|MJj\\BxI@xB@lD@dDHxRB`LDxJBhHBhHA~@?f@DdJ@tFBdFBvH@~B@xE@jABzK?f@AbECjFCfDe@~b@KnKeApcAKfLCnAK`LSpQe@jd@m@nk@EbFg@|d@AbAS~QCjDGlGW|TIfHObNM|LMxKWlUa@`^_@v]_@d\\c@t_@UjSEfEWfUUbTWbUY~VWhUQxNWdUKbIGbGMlKExCKvJMxJGpGAfAQ`POtKIbHExBG~AGrAKxAI`AOpAMhAMfAUdBMt@EXOv@Or@Qz@[jAg@bB]lAc@tAkCvIeCbIsAnEsCdJy@jCM^GTc@xAg@jBe@jBcA~De@lBi@`Ce@vBm@xCa@vB{@`Fi@xCu@fEs@`EiAtG_AbF[bB_A`F[bBiAlG}@fFs@|D{AvIkAzGg@lCiBpKKf@gCnNaAlFCJa@vBUjAEXMx@Eb@Gv@Cv@Ax@?z@Ch@Af@Eb@Ij@AXAj@[~Bw@zFYrBi@vDc@fDc@bDUrBCPQpAe@fDg@bD]xBUnAWlA_@jBQt@U|@i@pB{BzH_IzXuAbFgL|`@aDbLsBjHyClKgBjGcCxIsAxEgB~FgEbNwAvEKXq@~Bk@hBeAfDuApE_BlF}DnMsB~G_@jA]nAU|@WjAq@xDc@rCAJS~Au@~FCTOfAeAfIIj@Kl@G`@S`AMd@M`@ITKXMXc@x@m@dAeAbBmBvCg@z@[h@i@dAu@~Aq@bBcAlCaAfCITg@nAqAhDu@jBk@vA_@bAMb@o@jCQr@I`@YdAWv@O^O\\Yh@S^MTQTe@v@{@nAg@t@i@t@g@n@aArAoAxAg@l@gApAe@j@_@`@uB`C_AdAY^Y`@Yd@MTSb@]z@kAxCWn@[p@Of@Wp@y@tBu@fBUh@g@bAo@fAm@|@w@`Aq@v@gCxCUVeF~FcDrDYZg@l@a@h@[b@Yb@U`@_@r@Wj@Uj@Qf@Sl@K\\o@`C{@zC]hAcAlDa@zAcBbGcAtDg@`Bm@~BIXIX}@fDm@|BEJK^W|@g@hBy@fCo@jBe@tA}@hCuB`GsAxDmBrFy@zBOd@Qp@c@|Aa@vAi@rB[lAa@|AU~@s@fCm@vBaAtDUv@]nAcAxDM^CJOd@iAlE_@xAe@fBe@fB[nASt@a@nBG`@SfAO~@OfAMx@iAnK]tCIz@a@fD{CbXaAhIq@rGa@tD_@`DELGPIt@W|A_@jB{@|Dk@|BuBxHyAfFqF|RwArFk@jCa@|B[|BIt@KnAEf@IfAEbAElACp@Al@?h@@zABnBHlIF|F?hA?`BAjCCtAEjAEdAK|AIjASbC_@hDa@xDoCrVy@nHgDrZ_@fD_@dDkA`Kq@pGwAfMa@pD]tD]lEWhDQtCk@nLmA~XSfEs@|Oo@fNQdEW`FOxDKbCOxCUvFc@zJQbEUdE]nIs@|Oa@vIg@nKi@hLKvBw@vPm@dNS~E_@rHaBv]_@~Ik@~Lg@xKu@vPc@pJWtESfD[|D_@hEi@|EiArIgBrM{A`LeAzHsBzNu@xFoAlJ]jCiBtMsAzJ{AjLu@pF}@nGyB~OqB`O_AfHcDrUiB~Mq@tEQlAY|Bc@fDg@tDeArHuAlK}AhL{@dGeBpMs@fFUvAe@zD{AbOc@pGcAnRi@xL_AbQ_@lHa@rHi@|Km@nKc@|Iw@xO}@bRu@jNCb@MjCQpDATEZE^Kt@QtCUfE[hG[fGU|EWbF]hGUpEWhFUxEc@zHQjDSxDOdDGrAE~AIjCCvACzAGpDCdCErDEnDOvKG|ECrAGjEE|FQnGGpBYzHOvCe@zI[rFa@~HSlE?RBXBZ?f@Cn@KtCEdB?JC~AGrDApD?hC@xBFhDDfCDnANvDBd@HzABXBv@PjCd@pGpAbOTrC~Cz_@JnA^bEnApOr@vIl@dH`Dz_@TdCVxChAbN^zEtAxOrAfPd@zFXnDr@hIn@pH`ArLbD``@l@hHxAhQPxBVzCJ|AX`D\\bEV`DBRJ|AD`@R`EDx@PfELhGB|E@xCAfA?f@At@W~OUzKGnBEdACbACp@En@ItBMvDAt@A^GnISvLApA?r@IvDGzDIvEKhGIxDKhGK`EEhCI~CCrAAnACdBEhCCvAEbBEfCGzDGlCC~@CTCVGl@StBSdBUnA_@hBcA|DwAhFkBxGg@bBo@zBs@nCmAfEo@|B_AfDcAzDW`A"
 },
 "start_location": {
 "lat": 49.58261599999999,
 "lng": 34.1739169
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.5 km",
 "value": 490
 },
 "duration": {
 "text": "1 min",
 "value": 34
 },
 "end_location": {
 "lat": 50.40329699999999,
 "lng": 30.56430199999999
 },
 "html_instructions": "Take the exit toward <b>ОВРУЧ</b>/<b>РІЧПОРТ</b>/<b>ПОДІЛ</b>",
 "maneuver": "ramp-right",
 "polyline": {
 "points": "currHeppyDk@nAYr@]|@a@r@U^OPQNOJOFMFK@E?M?C?QAMCC?QGSKMMOOQW[c@wAeBmAmASSa@WmAw@"
 },
 "start_location": {
 "lat": 50.3997041,
 "lng": 30.5640302
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "2.2 km",
 "value": 2156
 },
 "duration": {
 "text": "2 mins",
 "value": 103
 },
 "end_location": {
 "lat": 50.4219041,
 "lng": 30.5689264
 },
 "html_instructions": "Merge onto <b>Наддніпрянське ш.</b>",
 "maneuver": "merge",
 "polyline": {
 "points": "sksrH{qpyDg@g@g@e@yDuC}@i@QM}@k@sAu@MIwBoAwBoA}BsAsH{DoB_AoCkAwC{@{@SsAYeASMCu@Qu@OoBW}AMoBKkAG_BAaCAe@?kAAiAF[?I@y@D_AFg@DmBVsARs@L{Bb@qCr@{A`@e@J{Bd@QD"
 },
 "start_location": {
 "lat": 50.40329699999999,
 "lng": 30.56430199999999
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "5.5 km",
 "value": 5489
 },
 "duration": {
 "text": "5 mins",
 "value": 273
 },
 "end_location": {
 "lat": 50.4601576,
 "lng": 30.5262744
 },
 "html_instructions": "Continue straight onto <b>Набережне ш.</b>",
 "maneuver": "straight",
 "polyline": {
 "points": "{_wrHynqyDqANe@D{AHa@D_AFaBFmE^k@Fg@Hm@LiAXgA\\yCz@eKjCaAVUDu@ToEjAmBXaAn@yKpDgBn@iDlAaDlAULWLYNUPi@b@qAhAu@l@oAnAgBxA{ApAcClBmBbB{ApAgA~@cGzGeApA_FxG}BfDcBbCsAtBiAdBm@|@yAbCU^w@zAg@bAUj@_@x@gApCoAbDeAjCcAdC_D`IyBvFuAfD{BrF_CxG_AtCaB`E_AjDo@|BcGtTmCvJeClIWv@Qf@k@xAqBnEEFkAhCmDnHe@`AQ\\MTW^W\\SRa@`@YTc@Xg@Rc@L_AN_BT"
 },
 "start_location": {
 "lat": 50.4219041,
 "lng": 30.5689264
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "1.1 km",
 "value": 1093
 },
 "duration": {
 "text": "1 min",
 "value": 76
 },
 "end_location": {
 "lat": 50.4697063,
 "lng": 30.5234494
 },
 "html_instructions": "Continue onto <b>вул. Набережно-Хрещатицька</b>",
 "polyline": {
 "points": "_o~rHediyDq@JS@cQrBq@JiAPM@ODOD]D[Da@Do@FQBk@H}Ej@cDf@mDp@{Bd@e@Jw@VQLYTIHw@~A"
 },
 "start_location": {
 "lat": 50.4601576,
 "lng": 30.5262744
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.2 km",
 "value": 237
 },
 "duration": {
 "text": "1 min",
 "value": 66
 },
 "end_location": {
 "lat": 50.4681807,
 "lng": 30.5211182
 },
 "html_instructions": "Turn <b>left</b> onto <b>вул. Спаська</b>",
 "maneuver": "turn-left",
 "polyline": {
 "points": "uj`sHqrhyDJR`A~AfAlBb@v@l@bAhArB"
 },
 "start_location": {
 "lat": 50.4697063,
 "lng": 30.5234494
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.3 km",
 "value": 347
 },
 "duration": {
 "text": "1 min",
 "value": 85
 },
 "end_location": {
 "lat": 50.4663166,
 "lng": 30.524791
 },
 "html_instructions": "Turn <b>left</b> onto <b>вул. Почайнинська</b>",
 "maneuver": "turn-left",
 "polyline": {
 "points": "ca`sH_dhyDd@{@p@qAhAwBNUjEiIIwB"
},
 "start_location": {
 "lat": 50.4681807,
 "lng": 30.5211182
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.7 km",
 "value": 659
 },
 "duration": {
 "text": "1 min",
 "value": 63
 },
 "end_location": {
 "lat": 50.4604462,
 "lng": 30.5260143
 },
 "html_instructions": "Turn <b>right</b> onto <b>вул. Набережно-Хрещатицька</b>",
 "maneuver": "turn-right",
 "polyline": {
 "points": "ou_sH}zhyD`Fq@`@GLCZCv@IxEs@t@IdJaAxDg@"
 },
 "start_location": {
 "lat": 50.4663166,
 "lng": 30.524791
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.2 km",
 "value": 151
 },
 "duration": {
 "text": "1 min",
 "value": 35
 },
 "end_location": {
 "lat": 50.4594649,
 "lng": 30.5246218
 },
 "html_instructions": "Slight <b>right</b> onto <b>Боричів узвіз</b>",
 "maneuver": "turn-slight-right",
 "polyline": {
 "points": "yp~rHqbiyDPDJ@D@DBFFDHJV@F|@nBb@z@\\h@"
 },
 "start_location": {
 "lat": 50.4604462,
 "lng": 30.5260143
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "29 m",
 "value": 29
 },
 "duration": {
 "text": "1 min",
 "value": 15
 },
 "end_location": {
 "lat": 50.4592305,
 "lng": 30.5244551
 },
 "html_instructions": "Slight <b>left</b> toward <b>Володимирський узвіз</b>",
 "maneuver": "turn-slight-left",
 "polyline": {
 "points": "sj~rH{yhyDRLXP"
 },
 "start_location": {
 "lat": 50.4594649,
 "lng": 30.5246218
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.8 km",
 "value": 812
 },
 "duration": {
 "text": "1 min",
 "value": 87
 },
 "end_location": {
 "lat": 50.4528133,
 "lng": 30.5278844
 },
 "html_instructions": "Turn <b>left</b> onto <b>Володимирський узвіз</b> (signs for <b>вул. ХРЕЩАТИК</b>)",
 "maneuver": "turn-left",
 "polyline": {
 "points": "ei~rH{xhyDP]JONWfB_DJQT_@@CJSNUd@q@x@eAd@o@`@g@|@aA`@e@HGFEFEDEFCJIJGHGJEHCFCJEJABAB?B?D?D?NBF@HBHBB?@@BBF@HFDDHFHHFBFDDDFBFBDBDBLDNBJBH@JBTBD?R?f@?x@Gl@Gz@Od@GjAQXGPC^E"
 },
 "start_location": {
 "lat": 50.4592305,
 "lng": 30.5244551
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.1 km",
 "value": 134
 },
 "duration": {
 "text": "1 min",
 "value": 29
 },
 "end_location": {
 "lat": 50.4519212,
 "lng": 30.5266352
 },
 "html_instructions": "<b>Володимирський узвіз</b> turns slightly <b>right</b> and becomes <b>Європейська пл.</b>",
 "polyline": {
 "points": "aa}rHgniyDTLPVVn@V`@LVjAfB"
 },
 "start_location": {
 "lat": 50.4528133,
 "lng": 30.5278844
 },
 "travel_mode": "DRIVING"
 },
 {
 "distance": {
 "text": "0.3 km",
 "value": 303
 },
 "duration": {
 "text": "1 min",
 "value": 47
 },
 "end_location": {
 "lat": 50.44985029999999,
 "lng": 30.5238646
 },
 "html_instructions": "Continue onto <b>вул. Хрещатик</b><div style=\"font-size:0.9em\">Destination will be on the right</div>",
 "polyline": {
 "points": "o{|rHofiyD@BLRfD~EzA|Bd@t@\\b@JLt@dABF"
 },
 "start_location": {
 "lat": 50.4519212,
 "lng": 30.5266352
 },
 "travel_mode": "DRIVING"
 }
 ],
 "traffic_speed_entry": [],
 "via_waypoint": []
 }
 ],
 "overview_polyline": {
 "points": "mwxfHs}{tE_UzRiQeFaLvReV|g@oOzh@aWvo@_SzdCi\\~uBvGbjAsRzr@xAmIhH}E_u@_^_o@clAeh@kmC?{Jwd@h|Ae\\zkEus@dwDcgAtuAgb@`mA_f@gBm]~m@aq@hsBaiAnuFsyAz|Dec@zgAq`@zmB}jBbeDkgAruCyuAfkDob@jnBqf@fw@a}@zn@ewBjn@w]hb@eIlw@rBfsA{Gjd@gYvHqp@g\\cKhXkhAjy@kdAjbBuvC~zCyaIzxGwvBzwBkoA{V{_AheAa{@n`BcRlHaV}GogA`|A_e@jr@uRx@aTqTmWZq{@xXwu@w\\eo@cSsbA{mAil@iaAuTgNm@~\\g\\fkBqgBxeEopA|eCepAvwAegAty@wa@vZo`@jaAss@`dB}~@vnBikBnyCih@feB}}@zs@gvAnpBs^`|AygA~pA}cBbQ}w@rsAgbBfu@mQp|@kHpi@mDfMmYsEuJddBwDvp@gKdiActAzzAkjGfbFm_BdhCosAdaAgpEpxCw~A~wBci@|j@s}Al_@syEp}Ae{BfWkfCh\\{wAxpBcxBv`A_~Bzo@sb@xYod@uMc|AutAim@irAwo@{n@mrA}}@_o@cIg{ByuDgk@qdAcq@es@lc@_hBu`@wi@ws@st@sm@}Z_b@|c@_g@eBug@uv@_r@kh@wHgzKvBj}G~CtyGiOfzBa{BdyBso@ti@qgB~zDuhDpaGuu@psGuZdkEsS`kF_MvjGeKpgAm`@`cApC|lAnaAhhBoJpzBtGxcFcKpnD~f@pqJgd@~aIolAzkQo_@~rBaz@vaBq{D|cH}mBzeEueB|qB{{CnvCkwBd`Ie|BteKcu@rpBe`B~aCs{@pcCoUd_@qeBp_AslCx^ekDr~@m_AhcAe~A`mCgq@lUccAaJ}}@|r@sm@bp@a}@qD{iAdWyyA`tAgz@puAqm@vbCqJflA{d@v}@eT~|@~@~mErr@buFdPtzDoRhlDcaA`kEe{An{DmrGdlNmwB~_Fw^fzBkU`zDsgA`bCe|AxzAkaAthB_mBdfAc{Aj_D_dEhrMmq@f`XrCxwA|aAriGzoBpqKaKbbRye@n}l@hgF~qUpM~|C}o@bqFgdCrpKmaHlfXq_BxqHyk@hxGubAzbSt@ziVaSv{Qk^|vC}sA|nHetBddHkzAjsC{xA`wGaz@n`O}_AzmIai@tjHgO`kE~UrkEj`@nsFeGbeDe`@rxAaaA_l@mgAzCugB~p@y`B~pDqTdb@kd@nGgY|EjAfLjNePz]kEjM~ExMcR|FLv_@~SdAzA"
 },
 "summary": "ш. Полтавське/P52 and Е40",
 "warnings": [],
 "waypoint_order": []
 }
 ],
 "status": "OK"
 }
 */

public class DirectionsResponse {

    @SerializedName("routes")
    public List<Route> routes;

    private List<LatLng> positionsList;

    public List<LatLng> getPositions() {
        if (positionsList == null)
            positionsList = new ArrayList<>();
        return positionsList;
    }

    public List<LatLng> initPositionsList() {
        getPositions();
        this.positionsList = new ArrayList<>();
        return positionsList;
    }

}