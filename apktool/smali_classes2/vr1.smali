.class public final Lvr1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:[B

.field public final c:Ljava/util/List;

.field public final d:Lm51;

.field public final e:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

.field public final f:Lp91;

.field public final g:Lls1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvr1;->a:Landroid/content/Context;

    .line 5
    .line 6
    sget-object v0, Lss8;->a:Lss8;

    .line 7
    .line 8
    const-string v0, "c33b18ca2035aa44330a757316ab0f92aa18572a284543af2388950e62fadb4f"

    .line 9
    .line 10
    invoke-static {v0}, Lss8;->r(Ljava/lang/String;)[B

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lvr1;->b:[B

    .line 15
    .line 16
    const-string v0, "ads.pullse.org"

    .line 17
    .line 18
    const-string v1, "cloud.itine.org"

    .line 19
    .line 20
    const-string v2, "t.polend.org"

    .line 21
    .line 22
    const-string v3, "t.pullse.org"

    .line 23
    .line 24
    const-string v4, "t.itine.org"

    .line 25
    .line 26
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lvr1;->c:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {}, Lpw7;->b()Low7;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sget-object v2, Ltp1;->a:Lnf1;

    .line 41
    .line 42
    sget-object v2, Lye1;->Z:Lye1;

    .line 43
    .line 44
    invoke-static {v1, v2}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Lgv3;->c(Ls61;)Lm51;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iput-object v1, p0, Lvr1;->d:Lm51;

    .line 53
    .line 54
    sget-object v1, Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;->INFO:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 55
    .line 56
    iput-object v1, p0, Lvr1;->e:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 57
    .line 58
    new-instance v1, Lp91;

    .line 59
    .line 60
    new-instance v2, Lyr2;

    .line 61
    .line 62
    const/16 v3, 0x1b

    .line 63
    .line 64
    invoke-direct {v2, p0, v3}, Lyr2;-><init>(Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v1, p1, v0, v2}, Lp91;-><init>(Landroid/content/Context;Ljava/util/List;Lyr2;)V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Lvr1;->f:Lp91;

    .line 71
    .line 72
    new-instance p1, Lls1;

    .line 73
    .line 74
    invoke-direct {p1}, Lls1;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lvr1;->g:Lls1;

    .line 78
    .line 79
    sget-object p1, Lsu/happ/proxyutility/HappApplication;->N0:Lm51;

    .line 80
    .line 81
    new-instance v0, Lr5;

    .line 82
    .line 83
    const/16 v1, 0xb

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    invoke-direct {v0, p0, v2, v1}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x3

    .line 90
    invoke-static {p1, v2, v0, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public static synthetic d(Lvr1;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V
    .locals 0

    .line 1
    and-int/lit8 p2, p3, 0x4

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p2, 0x1

    .line 8
    :goto_0
    invoke-virtual {p0, p1, p2}, Lvr1;->c(Ljava/lang/String;Z)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lsu/happ/proxyutility/dto/SubscriptionItem;Ls51;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "ERROR Info Code:"

    .line 6
    .line 7
    const-string v3, "total: "

    .line 8
    .line 9
    instance-of v4, v1, Lqr1;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v1

    .line 14
    check-cast v4, Lqr1;

    .line 15
    .line 16
    iget v5, v4, Lqr1;->j0:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lqr1;->j0:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lqr1;

    .line 29
    .line 30
    invoke-direct {v4, v0, v1}, Lqr1;-><init>(Lvr1;Ls51;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, v4, Lqr1;->h0:Ljava/lang/Object;

    .line 34
    .line 35
    iget v5, v4, Lqr1;->j0:I

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    if-ne v5, v7, :cond_1

    .line 43
    .line 44
    iget-object v5, v4, Lqr1;->g0:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v4, v4, Lqr1;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 47
    .line 48
    :try_start_0
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    move-object/from16 v23, v4

    .line 52
    .line 53
    move-object v4, v1

    .line 54
    move-object/from16 v1, v23

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto/16 :goto_7

    .line 60
    .line 61
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v8

    .line 67
    :cond_2
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :try_start_1
    sget-object v1, Lss8;->a:Lss8;

    .line 71
    .line 72
    invoke-static/range {p1 .. p1}, Lss8;->q(Lsu/happ/proxyutility/dto/SubscriptionItem;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    check-cast v1, Lsu/happ/proxyutility/dto/HashedDomain;

    .line 80
    .line 81
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/HashedDomain;->c()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v19

    .line 85
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->M()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v21

    .line 89
    if-nez v21, :cond_3

    .line 90
    .line 91
    new-instance v0, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;

    .line 92
    .line 93
    sget-object v1, Lsu/happ/proxyutility/dto/enums/TypeCheck;->DNSTT:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 94
    .line 95
    invoke-direct {v0, v8, v1, v6}, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V

    .line 96
    .line 97
    .line 98
    return-object v0

    .line 99
    :cond_3
    invoke-static {}, Lss8;->f()Lsu/happ/proxyutility/dto/AppVersion;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-object v5, v0, Lvr1;->a:Landroid/content/Context;

    .line 104
    .line 105
    invoke-static {v5}, Lss8;->k(Landroid/content/Context;)Lyf8;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    iget-object v9, v5, Lyf8;->X:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v9, Lsu/happ/proxyutility/dto/HWID;

    .line 112
    .line 113
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/HWID;->c()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v17

    .line 117
    iget-object v9, v5, Lyf8;->Y:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v9, Lsu/happ/proxyutility/dto/VersionOS;

    .line 120
    .line 121
    invoke-virtual {v9}, Lsu/happ/proxyutility/dto/VersionOS;->a()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v16

    .line 125
    iget-object v5, v5, Lyf8;->Z:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v5, Lsu/happ/proxyutility/dto/DeviceModel;

    .line 128
    .line 129
    invoke-virtual {v5}, Lsu/happ/proxyutility/dto/DeviceModel;->a()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v18

    .line 133
    sget-object v10, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$DeviceOS;->Android:Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$DeviceOS;

    .line 134
    .line 135
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/AppVersion;->a()I

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/AppVersion;->b()I

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/AppVersion;->c()I

    .line 144
    .line 145
    .line 146
    move-result v13

    .line 147
    sget-object v14, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Route;->Install:Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Route;

    .line 148
    .line 149
    new-instance v9, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;

    .line 150
    .line 151
    const/16 v20, 0x0

    .line 152
    .line 153
    const/16 v22, 0x0

    .line 154
    .line 155
    const/4 v15, 0x0

    .line 156
    invoke-direct/range {v9 .. v22}, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;-><init>(Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$DeviceOS;IIILsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Route;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    move-object/from16 v5, v19

    .line 160
    .line 161
    move-object/from16 v1, p1

    .line 162
    .line 163
    iput-object v1, v4, Lqr1;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 164
    .line 165
    iput-object v5, v4, Lqr1;->g0:Ljava/lang/String;

    .line 166
    .line 167
    iput v7, v4, Lqr1;->j0:I

    .line 168
    .line 169
    invoke-virtual {v0, v9, v4}, Lvr1;->e(Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;Ls51;)Ljava/io/Serializable;

    .line 170
    .line 171
    .line 172
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    sget-object v7, Lc71;->X:Lc71;

    .line 174
    .line 175
    if-ne v4, v7, :cond_4

    .line 176
    .line 177
    return-object v7

    .line 178
    :cond_4
    :goto_1
    :try_start_2
    check-cast v4, Lqg5;

    .line 179
    .line 180
    iget-object v7, v4, Lqg5;->X:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v7, Ljava/lang/Integer;

    .line 183
    .line 184
    iget-object v4, v4, Lqg5;->Y:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v4, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 187
    .line 188
    const/4 v9, 0x2

    .line 189
    const-string v10, " subscription "

    .line 190
    .line 191
    if-nez v7, :cond_a

    .line 192
    .line 193
    if-eqz v4, :cond_a

    .line 194
    .line 195
    :try_start_3
    new-instance v7, Ljava/lang/String;

    .line 196
    .line 197
    sget-object v11, Liq0;->a:Ljava/nio/charset/Charset;

    .line 198
    .line 199
    invoke-direct {v7, v4, v11}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 200
    .line 201
    .line 202
    sget-object v4, Lmr;->a:Lcp3;

    .line 203
    .line 204
    iget-object v11, v4, Lvm3;->b:Lg55;

    .line 205
    .line 206
    sget-object v11, Llr1;->Companion:Lkr1;

    .line 207
    .line 208
    invoke-virtual {v11}, Lkr1;->serializer()Low3;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    check-cast v11, Low3;

    .line 213
    .line 214
    invoke-virtual {v4, v11, v7}, Lvm3;->a(Low3;Ljava/lang/String;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    check-cast v11, Llr1;

    .line 219
    .line 220
    iget-object v11, v11, Llr1;->a:Lsu/happ/proxyutility/dto/AdditionalInfoCode;

    .line 221
    .line 222
    sget-object v12, Lor1;->Companion:Lnr1;

    .line 223
    .line 224
    invoke-virtual {v12}, Lnr1;->serializer()Low3;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    check-cast v12, Low3;

    .line 229
    .line 230
    invoke-virtual {v4, v12, v7}, Lvm3;->a(Low3;Ljava/lang/String;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    check-cast v4, Lor1;

    .line 235
    .line 236
    iget-object v4, v4, Lor1;->a:Ljava/lang/Integer;

    .line 237
    .line 238
    new-instance v12, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 241
    .line 242
    .line 243
    new-instance v13, Ljava/util/Date;

    .line 244
    .line 245
    invoke-direct {v13}, Ljava/util/Date;-><init>()V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    new-instance v14, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string v1, " check install tt-state: success responseCode:"

    .line 267
    .line 268
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    const-string v1, " "

    .line 275
    .line 276
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    if-eqz v4, :cond_6

    .line 287
    .line 288
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    const/16 v10, 0xc8

    .line 293
    .line 294
    if-gt v10, v1, :cond_5

    .line 295
    .line 296
    const/16 v10, 0x12c

    .line 297
    .line 298
    if-ge v1, v10, :cond_5

    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_5
    move-object v4, v8

    .line 302
    :goto_2
    if-eqz v4, :cond_6

    .line 303
    .line 304
    sget-object v1, Lyw2;->c:Lcom/google/gson/a;

    .line 305
    .line 306
    const-class v4, Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;

    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    new-instance v10, Lyi8;

    .line 312
    .line 313
    invoke-direct {v10, v4}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v1, v7, v10}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    check-cast v1, Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;

    .line 321
    .line 322
    goto :goto_3

    .line 323
    :cond_6
    move-object v1, v8

    .line 324
    :goto_3
    if-eqz v1, :cond_8

    .line 325
    .line 326
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;->a()Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-eqz v11, :cond_7

    .line 331
    .line 332
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/AdditionalInfoCode;->a()I

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    invoke-static {v4, v5}, Lsu/happ/proxyutility/dto/AdditionalInfoCodeKt;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    goto :goto_4

    .line 341
    :cond_7
    move-object v4, v8

    .line 342
    :goto_4
    new-instance v7, Ljava/lang/StringBuilder;

    .line 343
    .line 344
    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    const-string v2, " Info Code:"

    .line 351
    .line 352
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    goto :goto_6

    .line 366
    :cond_8
    if-eqz v11, :cond_9

    .line 367
    .line 368
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/AdditionalInfoCode;->a()I

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    invoke-static {v3, v5}, Lsu/happ/proxyutility/dto/AdditionalInfoCodeKt;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    goto :goto_5

    .line 377
    :cond_9
    move-object v3, v8

    .line 378
    :goto_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 379
    .line 380
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    :goto_6
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    invoke-static {v0, v2, v8, v9}, Lvr1;->d(Lvr1;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 398
    .line 399
    .line 400
    new-instance v0, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;

    .line 401
    .line 402
    sget-object v2, Lsu/happ/proxyutility/dto/enums/TypeCheck;->DNSTT:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 403
    .line 404
    invoke-direct {v0, v5, v1, v2}, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionRestrictedStatus;Lsu/happ/proxyutility/dto/enums/TypeCheck;)V

    .line 405
    .line 406
    .line 407
    goto :goto_8

    .line 408
    :cond_a
    if-nez v7, :cond_b

    .line 409
    .line 410
    new-instance v2, Ljava/util/Date;

    .line 411
    .line 412
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    new-instance v3, Ljava/lang/StringBuilder;

    .line 420
    .line 421
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    const-string v1, " check install tt-state: failure data:null"

    .line 434
    .line 435
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    invoke-static {v0, v1, v8, v9}, Lvr1;->d(Lvr1;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 443
    .line 444
    .line 445
    new-instance v0, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;

    .line 446
    .line 447
    sget-object v1, Lsu/happ/proxyutility/dto/enums/TypeCheck;->DNSTT:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 448
    .line 449
    invoke-direct {v0, v8, v1, v6}, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V

    .line 450
    .line 451
    .line 452
    goto :goto_8

    .line 453
    :cond_b
    new-instance v2, Ljava/util/Date;

    .line 454
    .line 455
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    new-instance v3, Ljava/lang/StringBuilder;

    .line 463
    .line 464
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    const-string v1, " check install tt-state: failure error:"

    .line 477
    .line 478
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    invoke-static {v0, v1, v8, v9}, Lvr1;->d(Lvr1;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 489
    .line 490
    .line 491
    new-instance v0, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;

    .line 492
    .line 493
    sget-object v1, Lsu/happ/proxyutility/dto/enums/TypeCheck;->DNSTT:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 494
    .line 495
    invoke-direct {v0, v8, v1, v6}, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 496
    .line 497
    .line 498
    goto :goto_8

    .line 499
    :goto_7
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 500
    .line 501
    if-nez v1, :cond_d

    .line 502
    .line 503
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 504
    .line 505
    if-nez v1, :cond_d

    .line 506
    .line 507
    new-instance v1, Lrj6;

    .line 508
    .line 509
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 510
    .line 511
    .line 512
    move-object v0, v1

    .line 513
    :goto_8
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    if-nez v1, :cond_c

    .line 518
    .line 519
    goto :goto_9

    .line 520
    :cond_c
    new-instance v0, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;

    .line 521
    .line 522
    sget-object v1, Lsu/happ/proxyutility/dto/enums/TypeCheck;->DNSTT:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 523
    .line 524
    invoke-direct {v0, v8, v1, v6}, Lsu/happ/proxyutility/dto/CheckSubscriptionRestrictedResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V

    .line 525
    .line 526
    .line 527
    :goto_9
    return-object v0

    .line 528
    :cond_d
    throw v0
.end method

.method public final b(Lsu/happ/proxyutility/dto/SubscriptionItem;Ljava/lang/String;Ls51;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, Lvr1;->a:Landroid/content/Context;

    .line 6
    .line 7
    const-string v3, "ERROR Info Code:"

    .line 8
    .line 9
    const-string v4, "total: "

    .line 10
    .line 11
    instance-of v5, v1, Lrr1;

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    move-object v5, v1

    .line 16
    check-cast v5, Lrr1;

    .line 17
    .line 18
    iget v6, v5, Lrr1;->j0:I

    .line 19
    .line 20
    const/high16 v7, -0x80000000

    .line 21
    .line 22
    and-int v8, v6, v7

    .line 23
    .line 24
    if-eqz v8, :cond_0

    .line 25
    .line 26
    sub-int/2addr v6, v7

    .line 27
    iput v6, v5, Lrr1;->j0:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v5, Lrr1;

    .line 31
    .line 32
    invoke-direct {v5, v0, v1}, Lrr1;-><init>(Lvr1;Ls51;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object v1, v5, Lrr1;->h0:Ljava/lang/Object;

    .line 36
    .line 37
    iget v6, v5, Lrr1;->j0:I

    .line 38
    .line 39
    const/4 v7, 0x3

    .line 40
    const/4 v8, 0x1

    .line 41
    const/4 v9, 0x0

    .line 42
    if-eqz v6, :cond_2

    .line 43
    .line 44
    if-ne v6, v8, :cond_1

    .line 45
    .line 46
    iget-object v2, v5, Lrr1;->g0:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v5, v5, Lrr1;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 49
    .line 50
    :try_start_0
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    move-object/from16 v24, v5

    .line 54
    .line 55
    move-object v5, v1

    .line 56
    move-object/from16 v1, v24

    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :catchall_0
    move-exception v0

    .line 61
    goto/16 :goto_a

    .line 62
    .line 63
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v9

    .line 69
    :cond_2
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :try_start_1
    sget-object v1, Lss8;->a:Lss8;

    .line 73
    .line 74
    invoke-static/range {p1 .. p1}, Lss8;->q(Lsu/happ/proxyutility/dto/SubscriptionItem;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    check-cast v1, Lsu/happ/proxyutility/dto/HashedDomain;

    .line 82
    .line 83
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/HashedDomain;->c()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v20

    .line 87
    if-nez p2, :cond_3

    .line 88
    .line 89
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-nez v1, :cond_4

    .line 94
    .line 95
    new-instance v0, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 96
    .line 97
    sget-object v1, Lsu/happ/proxyutility/dto/enums/TypeCheck;->DNSTT:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 98
    .line 99
    invoke-direct {v0, v9, v1, v7}, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_3
    move-object/from16 v1, p2

    .line 104
    .line 105
    :cond_4
    invoke-static {}, Lss8;->f()Lsu/happ/proxyutility/dto/AppVersion;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-static {v2}, Lss8;->k(Landroid/content/Context;)Lyf8;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    iget-object v11, v10, Lyf8;->X:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v11, Lsu/happ/proxyutility/dto/HWID;

    .line 116
    .line 117
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/HWID;->c()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v18

    .line 121
    iget-object v11, v10, Lyf8;->Y:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v11, Lsu/happ/proxyutility/dto/VersionOS;

    .line 124
    .line 125
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/VersionOS;->a()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v17

    .line 129
    iget-object v10, v10, Lyf8;->Z:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v10, Lsu/happ/proxyutility/dto/DeviceModel;

    .line 132
    .line 133
    invoke-virtual {v10}, Lsu/happ/proxyutility/dto/DeviceModel;->a()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v19

    .line 137
    invoke-static {v2}, Lue3;->y(Landroid/content/Context;)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_5

    .line 142
    .line 143
    sget-object v2, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$DeviceOS;->AndroidTV:Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$DeviceOS;

    .line 144
    .line 145
    :goto_1
    move-object v11, v2

    .line 146
    goto :goto_2

    .line 147
    :cond_5
    sget-object v2, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$DeviceOS;->Android:Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$DeviceOS;

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :goto_2
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/AppVersion;->a()I

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/AppVersion;->b()I

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/AppVersion;->c()I

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    sget-object v15, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Route;->Provider:Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Route;

    .line 163
    .line 164
    invoke-virtual/range {p1 .. p1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->P()Lsu/happ/proxyutility/dto/MetaParams;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    if-eqz v2, :cond_6

    .line 169
    .line 170
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/MetaParams;->Z0()Lsu/happ/proxyutility/dto/SubscriptionUserInfo;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    if-eqz v2, :cond_6

    .line 175
    .line 176
    invoke-virtual {v2}, Lsu/happ/proxyutility/dto/SubscriptionUserInfo;->d()J

    .line 177
    .line 178
    .line 179
    move-result-wide v9

    .line 180
    new-instance v2, Ljava/lang/Long;

    .line 181
    .line 182
    invoke-direct {v2, v9, v10}, Ljava/lang/Long;-><init>(J)V

    .line 183
    .line 184
    .line 185
    move-object/from16 v16, v2

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_6
    const/16 v16, 0x0

    .line 189
    .line 190
    :goto_3
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object v21

    .line 194
    new-instance v10, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;

    .line 195
    .line 196
    const/16 v22, 0x0

    .line 197
    .line 198
    const/16 v23, 0x0

    .line 199
    .line 200
    invoke-direct/range {v10 .. v23}, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;-><init>(Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$DeviceOS;IIILsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Route;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    move-object/from16 v2, v20

    .line 204
    .line 205
    move-object/from16 v1, p1

    .line 206
    .line 207
    iput-object v1, v5, Lrr1;->f0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 208
    .line 209
    iput-object v2, v5, Lrr1;->g0:Ljava/lang/String;

    .line 210
    .line 211
    iput v8, v5, Lrr1;->j0:I

    .line 212
    .line 213
    invoke-virtual {v0, v10, v5}, Lvr1;->e(Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;Ls51;)Ljava/io/Serializable;

    .line 214
    .line 215
    .line 216
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 217
    sget-object v6, Lc71;->X:Lc71;

    .line 218
    .line 219
    if-ne v5, v6, :cond_7

    .line 220
    .line 221
    return-object v6

    .line 222
    :cond_7
    :goto_4
    :try_start_2
    check-cast v5, Lqg5;

    .line 223
    .line 224
    iget-object v6, v5, Lqg5;->X:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v6, Ljava/lang/Integer;

    .line 227
    .line 228
    iget-object v5, v5, Lqg5;->Y:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v5, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 231
    .line 232
    const/4 v8, 0x2

    .line 233
    const-string v9, " subscription "

    .line 234
    .line 235
    if-nez v6, :cond_d

    .line 236
    .line 237
    if-eqz v5, :cond_d

    .line 238
    .line 239
    :try_start_3
    new-instance v6, Ljava/lang/String;

    .line 240
    .line 241
    sget-object v10, Liq0;->a:Ljava/nio/charset/Charset;

    .line 242
    .line 243
    invoke-direct {v6, v5, v10}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 244
    .line 245
    .line 246
    sget-object v5, Lmr;->a:Lcp3;

    .line 247
    .line 248
    iget-object v10, v5, Lvm3;->b:Lg55;

    .line 249
    .line 250
    sget-object v10, Llr1;->Companion:Lkr1;

    .line 251
    .line 252
    invoke-virtual {v10}, Lkr1;->serializer()Low3;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    check-cast v10, Low3;

    .line 257
    .line 258
    invoke-virtual {v5, v10, v6}, Lvm3;->a(Low3;Ljava/lang/String;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v10

    .line 262
    check-cast v10, Llr1;

    .line 263
    .line 264
    iget-object v10, v10, Llr1;->a:Lsu/happ/proxyutility/dto/AdditionalInfoCode;

    .line 265
    .line 266
    sget-object v11, Lor1;->Companion:Lnr1;

    .line 267
    .line 268
    invoke-virtual {v11}, Lnr1;->serializer()Low3;

    .line 269
    .line 270
    .line 271
    move-result-object v11

    .line 272
    check-cast v11, Low3;

    .line 273
    .line 274
    invoke-virtual {v5, v11, v6}, Lvm3;->a(Low3;Ljava/lang/String;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    check-cast v5, Lor1;

    .line 279
    .line 280
    iget-object v5, v5, Lor1;->a:Ljava/lang/Integer;

    .line 281
    .line 282
    new-instance v11, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 285
    .line 286
    .line 287
    new-instance v12, Ljava/util/Date;

    .line 288
    .line 289
    invoke-direct {v12}, Ljava/util/Date;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    new-instance v13, Ljava/lang/StringBuilder;

    .line 297
    .line 298
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    const-string v1, " check provider tt-state: success responseCode:"

    .line 311
    .line 312
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    const-string v1, " "

    .line 319
    .line 320
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    if-eqz v5, :cond_9

    .line 331
    .line 332
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    const/16 v9, 0xc8

    .line 337
    .line 338
    if-gt v9, v1, :cond_8

    .line 339
    .line 340
    const/16 v9, 0x12c

    .line 341
    .line 342
    if-ge v1, v9, :cond_8

    .line 343
    .line 344
    goto :goto_5

    .line 345
    :cond_8
    const/4 v5, 0x0

    .line 346
    :goto_5
    if-eqz v5, :cond_9

    .line 347
    .line 348
    sget-object v1, Lyw2;->c:Lcom/google/gson/a;

    .line 349
    .line 350
    const-class v5, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 351
    .line 352
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    new-instance v9, Lyi8;

    .line 356
    .line 357
    invoke-direct {v9, v5}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1, v6, v9}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    check-cast v1, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;

    .line 365
    .line 366
    goto :goto_6

    .line 367
    :cond_9
    const/4 v1, 0x0

    .line 368
    :goto_6
    if-eqz v1, :cond_b

    .line 369
    .line 370
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;->a()I

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    if-eqz v10, :cond_a

    .line 375
    .line 376
    invoke-virtual {v10}, Lsu/happ/proxyutility/dto/AdditionalInfoCode;->a()I

    .line 377
    .line 378
    .line 379
    move-result v5

    .line 380
    invoke-static {v5, v2}, Lsu/happ/proxyutility/dto/AdditionalInfoCodeKt;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    goto :goto_7

    .line 385
    :cond_a
    const/4 v5, 0x0

    .line 386
    :goto_7
    new-instance v6, Ljava/lang/StringBuilder;

    .line 387
    .line 388
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    const-string v3, " Info Code:"

    .line 395
    .line 396
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    goto :goto_9

    .line 410
    :cond_b
    if-eqz v10, :cond_c

    .line 411
    .line 412
    invoke-virtual {v10}, Lsu/happ/proxyutility/dto/AdditionalInfoCode;->a()I

    .line 413
    .line 414
    .line 415
    move-result v4

    .line 416
    invoke-static {v4, v2}, Lsu/happ/proxyutility/dto/AdditionalInfoCodeKt;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    goto :goto_8

    .line 421
    :cond_c
    const/4 v4, 0x0

    .line 422
    :goto_8
    new-instance v5, Ljava/lang/StringBuilder;

    .line 423
    .line 424
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    :goto_9
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    const/4 v4, 0x0

    .line 442
    invoke-static {v0, v3, v4, v8}, Lvr1;->d(Lvr1;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 443
    .line 444
    .line 445
    new-instance v0, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 446
    .line 447
    sget-object v3, Lsu/happ/proxyutility/dto/enums/TypeCheck;->DNSTT:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 448
    .line 449
    invoke-direct {v0, v2, v1, v3}, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionExtraStatus;Lsu/happ/proxyutility/dto/enums/TypeCheck;)V

    .line 450
    .line 451
    .line 452
    goto :goto_b

    .line 453
    :cond_d
    if-nez v6, :cond_e

    .line 454
    .line 455
    new-instance v2, Ljava/util/Date;

    .line 456
    .line 457
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v1

    .line 464
    new-instance v3, Ljava/lang/StringBuilder;

    .line 465
    .line 466
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    const-string v1, " check provider tt-state: failure data:null"

    .line 479
    .line 480
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    const/4 v4, 0x0

    .line 488
    invoke-static {v0, v1, v4, v8}, Lvr1;->d(Lvr1;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 489
    .line 490
    .line 491
    new-instance v0, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 492
    .line 493
    sget-object v1, Lsu/happ/proxyutility/dto/enums/TypeCheck;->DNSTT:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 494
    .line 495
    invoke-direct {v0, v4, v1, v7}, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V

    .line 496
    .line 497
    .line 498
    goto :goto_b

    .line 499
    :cond_e
    new-instance v2, Ljava/util/Date;

    .line 500
    .line 501
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/SubscriptionItem;->W()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    new-instance v3, Ljava/lang/StringBuilder;

    .line 509
    .line 510
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    const-string v1, " check provider tt-state: failure error:"

    .line 523
    .line 524
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    const/4 v4, 0x0

    .line 535
    invoke-static {v0, v1, v4, v8}, Lvr1;->d(Lvr1;Ljava/lang/String;Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;I)V

    .line 536
    .line 537
    .line 538
    new-instance v0, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 539
    .line 540
    sget-object v1, Lsu/happ/proxyutility/dto/enums/TypeCheck;->DNSTT:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 541
    .line 542
    invoke-direct {v0, v4, v1, v7}, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 543
    .line 544
    .line 545
    goto :goto_b

    .line 546
    :goto_a
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 547
    .line 548
    if-nez v1, :cond_10

    .line 549
    .line 550
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 551
    .line 552
    if-nez v1, :cond_10

    .line 553
    .line 554
    new-instance v1, Lrj6;

    .line 555
    .line 556
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 557
    .line 558
    .line 559
    move-object v0, v1

    .line 560
    :goto_b
    invoke-static {v0}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    if-nez v1, :cond_f

    .line 565
    .line 566
    goto :goto_c

    .line 567
    :cond_f
    new-instance v0, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;

    .line 568
    .line 569
    sget-object v1, Lsu/happ/proxyutility/dto/enums/TypeCheck;->DNSTT:Lsu/happ/proxyutility/dto/enums/TypeCheck;

    .line 570
    .line 571
    const/4 v4, 0x0

    .line 572
    invoke-direct {v0, v4, v1, v7}, Lsu/happ/proxyutility/dto/CheckSubscriptionExtraResult;-><init>(Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/TypeCheck;I)V

    .line 573
    .line 574
    .line 575
    :goto_c
    return-object v0

    .line 576
    :cond_10
    throw v0
.end method

.method public final c(Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    :try_start_0
    sget-object p2, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 4
    .line 5
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p2}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    new-instance v0, Lm40;

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    invoke-direct {v0, p1, v1}, Lm40;-><init>(Ljava/lang/String;B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, v0}, Lkf4;->h(Lgn2;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    sget-object p1, Lss8;->a:Lss8;

    .line 23
    .line 24
    invoke-static {}, Lss8;->t()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    iget-object p0, p0, Lvr1;->e:Lsu/happ/proxyutility/util/dnsttv/dto/enums/DnsTTLogType;

    .line 31
    .line 32
    sget-object p1, Lpr1;->a:[I

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    aget p0, p1, p0

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    if-eq p0, p1, :cond_2

    .line 42
    .line 43
    const/4 p1, 0x2

    .line 44
    if-eq p0, p1, :cond_2

    .line 45
    .line 46
    const/4 p1, 0x3

    .line 47
    if-ne p0, p1, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    new-instance p0, Lb55;

    .line 51
    .line 52
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_2
    :goto_0
    sget-object p0, Ldn8;->a:Ldn8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    return-object p0

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 61
    .line 62
    if-nez p1, :cond_3

    .line 63
    .line 64
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 65
    .line 66
    if-nez p1, :cond_3

    .line 67
    .line 68
    new-instance p1, Lrj6;

    .line 69
    .line 70
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_3
    throw p0
.end method

.method public final e(Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;Ls51;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p2, Lsr1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lsr1;

    .line 7
    .line 8
    iget v1, v0, Lsr1;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lsr1;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lsr1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lsr1;-><init>(Lvr1;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lsr1;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lsr1;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v2, :cond_1

    .line 34
    .line 35
    :try_start_0
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_2

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    iget-object p2, p0, Lvr1;->d:Lm51;

    .line 51
    .line 52
    new-instance v1, Ltr1;

    .line 53
    .line 54
    invoke-direct {v1, p0, p1, v3}, Ltr1;-><init>(Lvr1;Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;Lq51;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x3

    .line 58
    invoke-static {p2, v3, v1, p0}, Lw51;->j(Lb71;Ls61;Lrn2;I)Lyg1;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iput v2, v0, Lsr1;->h0:I

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lrm3;->h(Lq51;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    sget-object p0, Lc71;->X:Lc71;

    .line 69
    .line 70
    if-ne p2, p0, :cond_3

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_3
    :goto_1
    :try_start_2
    check-cast p2, Lqg5;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :goto_2
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 77
    .line 78
    if-nez p1, :cond_5

    .line 79
    .line 80
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 81
    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    new-instance p2, Lrj6;

    .line 85
    .line 86
    invoke-direct {p2, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    :goto_3
    new-instance p0, Lqg5;

    .line 90
    .line 91
    new-instance p1, Ljava/lang/Integer;

    .line 92
    .line 93
    const/16 v0, 0x387

    .line 94
    .line 95
    invoke-direct {p1, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-direct {p0, p1, v3}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    instance-of p1, p2, Lrj6;

    .line 102
    .line 103
    if-eqz p1, :cond_4

    .line 104
    .line 105
    move-object p2, p0

    .line 106
    :cond_4
    return-object p2

    .line 107
    :cond_5
    throw p0
.end method

.method public final f(Ljava/lang/String;Ljava/util/List;Ls51;)Ljava/io/Serializable;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lur1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lur1;

    .line 11
    .line 12
    iget v3, v2, Lur1;->h0:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lur1;->h0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lur1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lur1;-><init>(Lvr1;Ls51;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lur1;->f0:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Lur1;->h0:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    const/4 v5, 0x0

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    if-ne v3, v4, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto/16 :goto_6

    .line 46
    .line 47
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v5

    .line 53
    :cond_2
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :try_start_1
    sget-object v1, Lss8;->a:Lss8;

    .line 57
    .line 58
    invoke-static {}, Lss8;->f()Lsu/happ/proxyutility/dto/AppVersion;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget-object v3, v0, Lvr1;->a:Landroid/content/Context;

    .line 63
    .line 64
    invoke-static {v3}, Lss8;->k(Landroid/content/Context;)Lyf8;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iget-object v6, v3, Lyf8;->X:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v6, Lsu/happ/proxyutility/dto/HWID;

    .line 71
    .line 72
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/HWID;->c()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v15

    .line 76
    iget-object v6, v3, Lyf8;->Y:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v6, Lsu/happ/proxyutility/dto/VersionOS;

    .line 79
    .line 80
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/VersionOS;->a()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v14

    .line 84
    iget-object v3, v3, Lyf8;->Z:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v3, Lsu/happ/proxyutility/dto/DeviceModel;

    .line 87
    .line 88
    invoke-virtual {v3}, Lsu/happ/proxyutility/dto/DeviceModel;->a()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v16

    .line 92
    sget-object v8, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$DeviceOS;->Android:Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$DeviceOS;

    .line 93
    .line 94
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/AppVersion;->a()I

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/AppVersion;->b()I

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    invoke-virtual {v1}, Lsu/happ/proxyutility/dto/AppVersion;->c()I

    .line 103
    .line 104
    .line 105
    move-result v11

    .line 106
    sget-object v12, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Route;->RemotePush:Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Route;

    .line 107
    .line 108
    new-instance v1, Ljava/util/ArrayList;

    .line 109
    .line 110
    const/16 v3, 0xa

    .line 111
    .line 112
    move-object/from16 v6, p2

    .line 113
    .line 114
    invoke-static {v6, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_3

    .line 130
    .line 131
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    check-cast v6, Lsu/happ/proxyutility/dto/ProviderId;

    .line 136
    .line 137
    invoke-virtual {v6}, Lsu/happ/proxyutility/dto/ProviderId;->d()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_3
    new-instance v7, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;

    .line 146
    .line 147
    const/16 v17, 0x0

    .line 148
    .line 149
    const/16 v19, 0x0

    .line 150
    .line 151
    const/4 v13, 0x0

    .line 152
    move-object/from16 v20, p1

    .line 153
    .line 154
    move-object/from16 v18, v1

    .line 155
    .line 156
    invoke-direct/range {v7 .. v20}, Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;-><init>(Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$DeviceOS;IIILsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope$Route;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    iput v4, v2, Lur1;->h0:I

    .line 160
    .line 161
    invoke-virtual {v0, v7, v2}, Lvr1;->e(Lsu/happ/proxyutility/util/dnsttv/dto/RequestEnvelope;Ls51;)Ljava/io/Serializable;

    .line 162
    .line 163
    .line 164
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    sget-object v0, Lc71;->X:Lc71;

    .line 166
    .line 167
    if-ne v1, v0, :cond_4

    .line 168
    .line 169
    return-object v0

    .line 170
    :cond_4
    :goto_2
    :try_start_2
    check-cast v1, Lqg5;

    .line 171
    .line 172
    iget-object v0, v1, Lqg5;->X:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Ljava/lang/Integer;

    .line 175
    .line 176
    iget-object v1, v1, Lqg5;->Y:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v1, [B

    .line 179
    .line 180
    if-nez v0, :cond_8

    .line 181
    .line 182
    if-eqz v1, :cond_8

    .line 183
    .line 184
    new-instance v0, Ljava/lang/String;

    .line 185
    .line 186
    sget-object v2, Liq0;->a:Ljava/nio/charset/Charset;

    .line 187
    .line 188
    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 189
    .line 190
    .line 191
    sget-object v1, Lmr;->a:Lcp3;

    .line 192
    .line 193
    iget-object v2, v1, Lvm3;->b:Lg55;

    .line 194
    .line 195
    sget-object v2, Lor1;->Companion:Lnr1;

    .line 196
    .line 197
    invoke-virtual {v2}, Lnr1;->serializer()Low3;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    check-cast v2, Low3;

    .line 202
    .line 203
    invoke-virtual {v1, v2, v0}, Lvm3;->a(Low3;Ljava/lang/String;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    check-cast v1, Lor1;

    .line 208
    .line 209
    iget-object v1, v1, Lor1;->a:Ljava/lang/Integer;

    .line 210
    .line 211
    if-eqz v1, :cond_6

    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    const/16 v3, 0xc8

    .line 218
    .line 219
    if-gt v3, v2, :cond_5

    .line 220
    .line 221
    const/16 v3, 0x12c

    .line 222
    .line 223
    if-ge v2, v3, :cond_5

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_5
    move-object v1, v5

    .line 227
    :goto_3
    if-eqz v1, :cond_6

    .line 228
    .line 229
    sget-object v1, Lyw2;->c:Lcom/google/gson/a;

    .line 230
    .line 231
    const-class v2, Lsu/happ/proxyutility/dto/RemotePushStatus;

    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    new-instance v3, Lyi8;

    .line 237
    .line 238
    invoke-direct {v3, v2}, Lyi8;-><init>(Ljava/lang/reflect/Type;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v0, v3}, Lcom/google/gson/a;->c(Ljava/lang/String;Lyi8;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    check-cast v0, Lsu/happ/proxyutility/dto/RemotePushStatus;

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_6
    move-object v0, v5

    .line 249
    :goto_4
    if-eqz v0, :cond_7

    .line 250
    .line 251
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/RemotePushStatus;->a()Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    goto :goto_5

    .line 256
    :cond_7
    const/4 v0, 0x0

    .line 257
    :goto_5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 258
    .line 259
    .line 260
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 261
    goto :goto_7

    .line 262
    :cond_8
    move-object v0, v5

    .line 263
    goto :goto_7

    .line 264
    :goto_6
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 265
    .line 266
    if-nez v1, :cond_a

    .line 267
    .line 268
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 269
    .line 270
    if-nez v1, :cond_a

    .line 271
    .line 272
    new-instance v1, Lrj6;

    .line 273
    .line 274
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 275
    .line 276
    .line 277
    move-object v0, v1

    .line 278
    :goto_7
    nop

    .line 279
    instance-of v1, v0, Lrj6;

    .line 280
    .line 281
    if-eqz v1, :cond_9

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_9
    move-object v5, v0

    .line 285
    :goto_8
    return-object v5

    .line 286
    :cond_a
    throw v0
.end method
