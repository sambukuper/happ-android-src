.class public final Lpi7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lun5;

.field public final b:Lcom/tencent/mmkv/MMKV;


# direct methods
.method public constructor <init>(Lun5;)V
    .locals 1

    .line 1
    sget-object v0, Lkw4;->a:Lkw4;

    .line 2
    .line 3
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lpi7;->a:Lun5;

    .line 14
    .line 15
    iput-object v0, p0, Lpi7;->b:Lcom/tencent/mmkv/MMKV;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Service;Ljava/lang/String;Loi7;)Ljava/lang/String;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v1, Loi7;->c:Ljava/util/Map;

    .line 6
    .line 7
    iget-object v3, v0, Lpi7;->b:Lcom/tencent/mmkv/MMKV;

    .line 8
    .line 9
    const-string v4, "pref_speed_enabled"

    .line 10
    .line 11
    invoke-virtual {v3, v4}, Lcom/tencent/mmkv/MMKV;->b(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const-string v4, "\u2193"

    .line 16
    .line 17
    const-string v5, "\u2191  "

    .line 18
    .line 19
    sget-object v6, Lsi7;->X:Lsi7;

    .line 20
    .line 21
    sget-object v7, Lsi7;->Y:Lsi7;

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    sget-object v9, Lbd8;->X:Lbd8;

    .line 27
    .line 28
    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v10

    .line 32
    check-cast v10, Ljava/util/Map;

    .line 33
    .line 34
    if-eqz v10, :cond_0

    .line 35
    .line 36
    invoke-interface {v10, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    check-cast v10, Ljava/lang/Long;

    .line 41
    .line 42
    if-eqz v10, :cond_0

    .line 43
    .line 44
    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    check-cast v9, Ljava/util/Map;

    .line 49
    .line 50
    if-eqz v9, :cond_0

    .line 51
    .line 52
    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    check-cast v9, Ljava/lang/Long;

    .line 57
    .line 58
    if-eqz v9, :cond_0

    .line 59
    .line 60
    new-instance v11, Lqg5;

    .line 61
    .line 62
    invoke-direct {v11, v10, v9}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move-object v11, v8

    .line 67
    :goto_0
    if-eqz v11, :cond_1

    .line 68
    .line 69
    iget-object v9, v11, Lqg5;->X:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v9, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    .line 74
    .line 75
    .line 76
    move-result-wide v9

    .line 77
    iget-object v11, v11, Lqg5;->Y:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v11, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v11

    .line 85
    invoke-static {v9, v10}, Lx79;->f(J)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    invoke-static {v11, v12}, Lx79;->f(J)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    invoke-static {v9, v5, v10, v4}, Loi0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    goto :goto_1

    .line 98
    :cond_1
    move-object v9, v8

    .line 99
    :goto_1
    if-eqz v3, :cond_3

    .line 100
    .line 101
    iget-wide v10, v1, Loi7;->a:J

    .line 102
    .line 103
    sget-object v1, Lbd8;->Y:Lbd8;

    .line 104
    .line 105
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Ljava/util/Map;

    .line 110
    .line 111
    if-eqz v3, :cond_2

    .line 112
    .line 113
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    check-cast v3, Ljava/lang/Long;

    .line 118
    .line 119
    if-eqz v3, :cond_2

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 122
    .line 123
    .line 124
    move-result-wide v12

    .line 125
    long-to-double v12, v12

    .line 126
    long-to-double v10, v10

    .line 127
    const-wide v14, 0x408f400000000000L    # 1000.0

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    div-double/2addr v10, v14

    .line 133
    div-double/2addr v12, v10

    .line 134
    double-to-long v12, v12

    .line 135
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, Ljava/util/Map;

    .line 140
    .line 141
    if-eqz v1, :cond_2

    .line 142
    .line 143
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, Ljava/lang/Long;

    .line 148
    .line 149
    if-eqz v1, :cond_2

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 152
    .line 153
    .line 154
    move-result-wide v1

    .line 155
    long-to-double v1, v1

    .line 156
    div-double/2addr v1, v10

    .line 157
    double-to-long v1, v1

    .line 158
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    new-instance v2, Lqg5;

    .line 167
    .line 168
    invoke-direct {v2, v3, v1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_2
    move-object v2, v8

    .line 173
    :goto_2
    if-eqz v2, :cond_3

    .line 174
    .line 175
    iget-object v1, v2, Lqg5;->X:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v1, Ljava/lang/Number;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 180
    .line 181
    .line 182
    move-result-wide v6

    .line 183
    iget-object v1, v2, Lqg5;->Y:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v1, Ljava/lang/Number;

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 188
    .line 189
    .line 190
    move-result-wide v1

    .line 191
    invoke-static {v6, v7}, Lx79;->f(J)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-static {v1, v2}, Lx79;->f(J)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-static {v3, v5, v1, v4}, Loi0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    goto :goto_3

    .line 204
    :cond_3
    move-object v1, v8

    .line 205
    :goto_3
    iget-object v0, v0, Lpi7;->a:Lun5;

    .line 206
    .line 207
    move-object/from16 v2, p2

    .line 208
    .line 209
    invoke-virtual {v0, v2}, Lun5;->c(Ljava/lang/String;)Lsu/happ/proxyutility/dto/ServerAffiliationInfo;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-eqz v0, :cond_5

    .line 214
    .line 215
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerAffiliationInfo;->b()Ljava/lang/Long;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    if-eqz v2, :cond_5

    .line 220
    .line 221
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 222
    .line 223
    .line 224
    move-result-wide v3

    .line 225
    const-wide/16 v5, -0x1

    .line 226
    .line 227
    cmp-long v3, v3, v5

    .line 228
    .line 229
    if-lez v3, :cond_4

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_4
    move-object v2, v8

    .line 233
    :goto_4
    if-eqz v2, :cond_5

    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 236
    .line 237
    .line 238
    move-result-wide v2

    .line 239
    new-instance v0, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v2, " ms"

    .line 248
    .line 249
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    goto :goto_5

    .line 257
    :cond_5
    if-eqz v0, :cond_6

    .line 258
    .line 259
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerAffiliationInfo;->c()Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-eqz v0, :cond_6

    .line 264
    .line 265
    sget v0, Ly46;->vpn_service_ping_testing:I

    .line 266
    .line 267
    new-instance v2, Landroid/content/res/Configuration;

    .line 268
    .line 269
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-direct {v2, v3}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 278
    .line 279
    .line 280
    sget-object v3, Lss8;->a:Lss8;

    .line 281
    .line 282
    invoke-static {}, Lss8;->n()Ljava/util/Locale;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    invoke-virtual {v2, v3}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    .line 287
    .line 288
    .line 289
    move-object/from16 v3, p1

    .line 290
    .line 291
    invoke-virtual {v3, v2}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    :cond_6
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 305
    .line 306
    .line 307
    const/16 v2, 0xa

    .line 308
    .line 309
    if-eqz v9, :cond_7

    .line 310
    .line 311
    const-string v3, "proxy: "

    .line 312
    .line 313
    invoke-virtual {v3, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    :cond_7
    if-eqz v1, :cond_8

    .line 324
    .line 325
    const-string v3, "direct: "

    .line 326
    .line 327
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    :cond_8
    if-eqz v8, :cond_9

    .line 338
    .line 339
    const-string v1, "ping: "

    .line 340
    .line 341
    invoke-virtual {v1, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    return-object v0
.end method
