.class public final synthetic Lm40;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .line 11
    iput-byte p2, p0, Lm40;->X:B

    iput-object p1, p0, Lm40;->Y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lsz2;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/16 p1, 0x9

    .line 2
    .line 3
    iput-byte p1, p0, Lm40;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lm40;->Y:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lm40;->X:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    sget-object v6, Ldn8;->a:Ldn8;

    .line 10
    .line 11
    iget-object v7, v0, Lm40;->Y:Ljava/lang/String;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v0, p1

    .line 17
    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lfm7;->o0(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-ge v1, v2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v7, v0

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    :goto_0
    return-object v7

    .line 47
    :pswitch_0
    move-object/from16 v8, p1

    .line 48
    .line 49
    check-cast v8, Lqs7;

    .line 50
    .line 51
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object v0, v8, Lqs7;->i:Lps7;

    .line 55
    .line 56
    invoke-static {v0, v7, v5, v3}, Lps7;->a(Lps7;Ljava/lang/String;ZI)Lps7;

    .line 57
    .line 58
    .line 59
    move-result-object v17

    .line 60
    const/16 v18, 0x0

    .line 61
    .line 62
    const/16 v19, 0x2ff

    .line 63
    .line 64
    const/4 v9, 0x0

    .line 65
    const/4 v10, 0x0

    .line 66
    const/4 v11, 0x0

    .line 67
    const/4 v12, 0x0

    .line 68
    const/4 v13, 0x0

    .line 69
    const/4 v14, 0x0

    .line 70
    const/4 v15, 0x0

    .line 71
    const/16 v16, 0x0

    .line 72
    .line 73
    invoke-static/range {v8 .. v19}, Lqs7;->a(Lqs7;Lis7;ZZLfs7;ZZLms7;ILps7;Lsu/happ/proxyutility/dto/enums/SubscriptionSortType;I)Lqs7;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0

    .line 78
    :pswitch_1
    move-object/from16 v0, p1

    .line 79
    .line 80
    check-cast v0, Lf17;

    .line 81
    .line 82
    invoke-static {v0, v7}, Ld17;->b(Lf17;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object v6

    .line 86
    :pswitch_2
    move-object/from16 v8, p1

    .line 87
    .line 88
    check-cast v8, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 89
    .line 90
    sget v1, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 91
    .line 92
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v8}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    const/16 v30, 0x0

    .line 100
    .line 101
    const v31, 0x7fff7f

    .line 102
    .line 103
    .line 104
    const/4 v10, 0x0

    .line 105
    const/4 v11, 0x0

    .line 106
    const/4 v12, 0x0

    .line 107
    const/4 v13, 0x0

    .line 108
    const/4 v14, 0x0

    .line 109
    const/4 v15, 0x0

    .line 110
    const/16 v16, 0x0

    .line 111
    .line 112
    iget-object v0, v0, Lm40;->Y:Ljava/lang/String;

    .line 113
    .line 114
    const/16 v18, 0x0

    .line 115
    .line 116
    const/16 v19, 0x0

    .line 117
    .line 118
    const/16 v20, 0x0

    .line 119
    .line 120
    const/16 v21, 0x0

    .line 121
    .line 122
    const/16 v22, 0x0

    .line 123
    .line 124
    const/16 v23, 0x0

    .line 125
    .line 126
    const/16 v24, 0x0

    .line 127
    .line 128
    const/16 v25, 0x0

    .line 129
    .line 130
    const/16 v26, 0x0

    .line 131
    .line 132
    const/16 v27, 0x0

    .line 133
    .line 134
    const/16 v28, 0x0

    .line 135
    .line 136
    const/16 v29, 0x0

    .line 137
    .line 138
    move-object/from16 v17, v0

    .line 139
    .line 140
    invoke-static/range {v9 .. v31}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    const/4 v13, 0x0

    .line 145
    const/16 v14, 0x1d

    .line 146
    .line 147
    const/4 v9, 0x0

    .line 148
    invoke-static/range {v8 .. v14}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0

    .line 153
    :pswitch_3
    move-object/from16 v1, p1

    .line 154
    .line 155
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 156
    .line 157
    sget v2, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    const/16 v24, 0x0

    .line 167
    .line 168
    const v25, 0x7ffeff

    .line 169
    .line 170
    .line 171
    const/4 v4, 0x0

    .line 172
    const/4 v5, 0x0

    .line 173
    const/4 v6, 0x0

    .line 174
    const/4 v7, 0x0

    .line 175
    const/4 v8, 0x0

    .line 176
    const/4 v9, 0x0

    .line 177
    const/4 v10, 0x0

    .line 178
    const/4 v11, 0x0

    .line 179
    iget-object v12, v0, Lm40;->Y:Ljava/lang/String;

    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    const/4 v14, 0x0

    .line 183
    const/4 v15, 0x0

    .line 184
    const/16 v16, 0x0

    .line 185
    .line 186
    const/16 v17, 0x0

    .line 187
    .line 188
    const/16 v18, 0x0

    .line 189
    .line 190
    const/16 v19, 0x0

    .line 191
    .line 192
    const/16 v20, 0x0

    .line 193
    .line 194
    const/16 v21, 0x0

    .line 195
    .line 196
    const/16 v22, 0x0

    .line 197
    .line 198
    const/16 v23, 0x0

    .line 199
    .line 200
    invoke-static/range {v3 .. v25}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    const/4 v6, 0x0

    .line 205
    const/16 v7, 0x1d

    .line 206
    .line 207
    const/4 v2, 0x0

    .line 208
    const/4 v4, 0x0

    .line 209
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    return-object v0

    .line 214
    :pswitch_4
    move-object/from16 v1, p1

    .line 215
    .line 216
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 217
    .line 218
    sget v2, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    const/16 v24, 0x0

    .line 228
    .line 229
    const v25, 0x7fffdf

    .line 230
    .line 231
    .line 232
    const/4 v4, 0x0

    .line 233
    const/4 v5, 0x0

    .line 234
    const/4 v6, 0x0

    .line 235
    const/4 v7, 0x0

    .line 236
    const/4 v8, 0x0

    .line 237
    iget-object v9, v0, Lm40;->Y:Ljava/lang/String;

    .line 238
    .line 239
    const/4 v10, 0x0

    .line 240
    const/4 v11, 0x0

    .line 241
    const/4 v12, 0x0

    .line 242
    const/4 v13, 0x0

    .line 243
    const/4 v14, 0x0

    .line 244
    const/4 v15, 0x0

    .line 245
    const/16 v16, 0x0

    .line 246
    .line 247
    const/16 v17, 0x0

    .line 248
    .line 249
    const/16 v18, 0x0

    .line 250
    .line 251
    const/16 v19, 0x0

    .line 252
    .line 253
    const/16 v20, 0x0

    .line 254
    .line 255
    const/16 v21, 0x0

    .line 256
    .line 257
    const/16 v22, 0x0

    .line 258
    .line 259
    const/16 v23, 0x0

    .line 260
    .line 261
    invoke-static/range {v3 .. v25}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    const/4 v6, 0x0

    .line 266
    const/16 v7, 0x1d

    .line 267
    .line 268
    const/4 v2, 0x0

    .line 269
    const/4 v4, 0x0

    .line 270
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    return-object v0

    .line 275
    :pswitch_5
    move-object/from16 v1, p1

    .line 276
    .line 277
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 278
    .line 279
    sget v2, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 280
    .line 281
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    const/16 v24, 0x0

    .line 289
    .line 290
    const v25, 0x7ffffd

    .line 291
    .line 292
    .line 293
    const/4 v4, 0x0

    .line 294
    iget-object v5, v0, Lm40;->Y:Ljava/lang/String;

    .line 295
    .line 296
    const/4 v6, 0x0

    .line 297
    const/4 v7, 0x0

    .line 298
    const/4 v8, 0x0

    .line 299
    const/4 v9, 0x0

    .line 300
    const/4 v10, 0x0

    .line 301
    const/4 v11, 0x0

    .line 302
    const/4 v12, 0x0

    .line 303
    const/4 v13, 0x0

    .line 304
    const/4 v14, 0x0

    .line 305
    const/4 v15, 0x0

    .line 306
    const/16 v16, 0x0

    .line 307
    .line 308
    const/16 v17, 0x0

    .line 309
    .line 310
    const/16 v18, 0x0

    .line 311
    .line 312
    const/16 v19, 0x0

    .line 313
    .line 314
    const/16 v20, 0x0

    .line 315
    .line 316
    const/16 v21, 0x0

    .line 317
    .line 318
    const/16 v22, 0x0

    .line 319
    .line 320
    const/16 v23, 0x0

    .line 321
    .line 322
    invoke-static/range {v3 .. v25}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    const/4 v6, 0x0

    .line 327
    const/16 v7, 0x1d

    .line 328
    .line 329
    const/4 v2, 0x0

    .line 330
    const/4 v4, 0x0

    .line 331
    const/4 v5, 0x0

    .line 332
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    return-object v0

    .line 337
    :pswitch_6
    move-object/from16 v1, p1

    .line 338
    .line 339
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 340
    .line 341
    sget v2, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    const/16 v24, 0x0

    .line 351
    .line 352
    const v25, 0x7fffbf

    .line 353
    .line 354
    .line 355
    const/4 v4, 0x0

    .line 356
    const/4 v5, 0x0

    .line 357
    const/4 v6, 0x0

    .line 358
    const/4 v7, 0x0

    .line 359
    const/4 v8, 0x0

    .line 360
    const/4 v9, 0x0

    .line 361
    iget-object v10, v0, Lm40;->Y:Ljava/lang/String;

    .line 362
    .line 363
    const/4 v11, 0x0

    .line 364
    const/4 v12, 0x0

    .line 365
    const/4 v13, 0x0

    .line 366
    const/4 v14, 0x0

    .line 367
    const/4 v15, 0x0

    .line 368
    const/16 v16, 0x0

    .line 369
    .line 370
    const/16 v17, 0x0

    .line 371
    .line 372
    const/16 v18, 0x0

    .line 373
    .line 374
    const/16 v19, 0x0

    .line 375
    .line 376
    const/16 v20, 0x0

    .line 377
    .line 378
    const/16 v21, 0x0

    .line 379
    .line 380
    const/16 v22, 0x0

    .line 381
    .line 382
    const/16 v23, 0x0

    .line 383
    .line 384
    invoke-static/range {v3 .. v25}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    const/4 v6, 0x0

    .line 389
    const/16 v7, 0x1d

    .line 390
    .line 391
    const/4 v2, 0x0

    .line 392
    const/4 v4, 0x0

    .line 393
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    return-object v0

    .line 398
    :pswitch_7
    move-object/from16 v1, p1

    .line 399
    .line 400
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 401
    .line 402
    sget v2, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 403
    .line 404
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    iget-object v13, v0, Lm40;->Y:Ljava/lang/String;

    .line 412
    .line 413
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    const/16 v24, 0x0

    .line 417
    .line 418
    const v25, 0x7ffdff

    .line 419
    .line 420
    .line 421
    const/4 v4, 0x0

    .line 422
    const/4 v5, 0x0

    .line 423
    const/4 v6, 0x0

    .line 424
    const/4 v7, 0x0

    .line 425
    const/4 v8, 0x0

    .line 426
    const/4 v9, 0x0

    .line 427
    const/4 v10, 0x0

    .line 428
    const/4 v11, 0x0

    .line 429
    const/4 v12, 0x0

    .line 430
    const/4 v14, 0x0

    .line 431
    const/4 v15, 0x0

    .line 432
    const/16 v16, 0x0

    .line 433
    .line 434
    const/16 v17, 0x0

    .line 435
    .line 436
    const/16 v18, 0x0

    .line 437
    .line 438
    const/16 v19, 0x0

    .line 439
    .line 440
    const/16 v20, 0x0

    .line 441
    .line 442
    const/16 v21, 0x0

    .line 443
    .line 444
    const/16 v22, 0x0

    .line 445
    .line 446
    const/16 v23, 0x0

    .line 447
    .line 448
    invoke-static/range {v3 .. v25}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    const/4 v6, 0x0

    .line 453
    const/16 v7, 0x1d

    .line 454
    .line 455
    const/4 v2, 0x0

    .line 456
    const/4 v4, 0x0

    .line 457
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    return-object v0

    .line 462
    :pswitch_8
    move-object/from16 v1, p1

    .line 463
    .line 464
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 465
    .line 466
    sget v2, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 467
    .line 468
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v1}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->f()Lsu/happ/proxyutility/dto/RouteSettings;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    const/16 v24, 0x0

    .line 476
    .line 477
    const v25, 0x7ffffb

    .line 478
    .line 479
    .line 480
    const/4 v4, 0x0

    .line 481
    const/4 v5, 0x0

    .line 482
    iget-object v6, v0, Lm40;->Y:Ljava/lang/String;

    .line 483
    .line 484
    const/4 v7, 0x0

    .line 485
    const/4 v8, 0x0

    .line 486
    const/4 v9, 0x0

    .line 487
    const/4 v10, 0x0

    .line 488
    const/4 v11, 0x0

    .line 489
    const/4 v12, 0x0

    .line 490
    const/4 v13, 0x0

    .line 491
    const/4 v14, 0x0

    .line 492
    const/4 v15, 0x0

    .line 493
    const/16 v16, 0x0

    .line 494
    .line 495
    const/16 v17, 0x0

    .line 496
    .line 497
    const/16 v18, 0x0

    .line 498
    .line 499
    const/16 v19, 0x0

    .line 500
    .line 501
    const/16 v20, 0x0

    .line 502
    .line 503
    const/16 v21, 0x0

    .line 504
    .line 505
    const/16 v22, 0x0

    .line 506
    .line 507
    const/16 v23, 0x0

    .line 508
    .line 509
    invoke-static/range {v3 .. v25}, Lsu/happ/proxyutility/dto/RouteSettings;->e(Lsu/happ/proxyutility/dto/RouteSettings;ZLjava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/EDnsType;Lsu/happ/proxyutility/dto/enums/EDnsType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lsu/happ/proxyutility/dto/enums/RoutingOrder;I)Lsu/happ/proxyutility/dto/RouteSettings;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    const/4 v6, 0x0

    .line 514
    const/16 v7, 0x1d

    .line 515
    .line 516
    const/4 v2, 0x0

    .line 517
    const/4 v4, 0x0

    .line 518
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    return-object v0

    .line 523
    :pswitch_9
    move-object/from16 v1, p1

    .line 524
    .line 525
    check-cast v1, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 526
    .line 527
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    const/4 v6, 0x0

    .line 531
    const/16 v7, 0x1e

    .line 532
    .line 533
    iget-object v2, v0, Lm40;->Y:Ljava/lang/String;

    .line 534
    .line 535
    const/4 v3, 0x0

    .line 536
    const/4 v4, 0x0

    .line 537
    const/4 v5, 0x0

    .line 538
    invoke-static/range {v1 .. v7}, Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;->a(Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;Ljava/lang/String;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;Lsu/happ/proxyutility/dto/RouteSettings;ZI)Lsu/happ/proxyutility/domain/routing/entity/RouteSettingsCache;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    return-object v0

    .line 543
    :pswitch_a
    move-object/from16 v0, p1

    .line 544
    .line 545
    check-cast v0, Ljava/util/Map$Entry;

    .line 546
    .line 547
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    check-cast v0, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 552
    .line 553
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-static {v0, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v0

    .line 561
    xor-int/2addr v0, v4

    .line 562
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    return-object v0

    .line 567
    :pswitch_b
    move-object/from16 v0, p1

    .line 568
    .line 569
    check-cast v0, Lqr6;

    .line 570
    .line 571
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    const-string v1, "SELECT long_value FROM Preference where `key`=?"

    .line 575
    .line 576
    invoke-interface {v0, v1}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    :try_start_0
    invoke-interface {v1, v4, v7}, Lxr6;->T(ILjava/lang/String;)V

    .line 581
    .line 582
    .line 583
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    if-eqz v0, :cond_3

    .line 588
    .line 589
    invoke-interface {v1, v5}, Lxr6;->isNull(I)Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-eqz v0, :cond_2

    .line 594
    .line 595
    goto :goto_1

    .line 596
    :cond_2
    invoke-interface {v1, v5}, Lxr6;->getLong(I)J

    .line 597
    .line 598
    .line 599
    move-result-wide v2

    .line 600
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 601
    .line 602
    .line 603
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 604
    goto :goto_1

    .line 605
    :catchall_0
    move-exception v0

    .line 606
    goto :goto_2

    .line 607
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 608
    .line 609
    .line 610
    return-object v2

    .line 611
    :goto_2
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 612
    .line 613
    .line 614
    throw v0

    .line 615
    :pswitch_c
    move-object/from16 v0, p1

    .line 616
    .line 617
    check-cast v0, Lsu/happ/proxyutility/dto/AppInfo;

    .line 618
    .line 619
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    if-nez v1, :cond_4

    .line 624
    .line 625
    goto :goto_3

    .line 626
    :cond_4
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/AppInfo;->c()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 631
    .line 632
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    invoke-static {v1, v7, v5}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 640
    .line 641
    .line 642
    move-result v1

    .line 643
    if-nez v1, :cond_6

    .line 644
    .line 645
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/AppInfo;->d()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    invoke-static {v0, v7, v5}, Lfm7;->d0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    if-eqz v0, :cond_5

    .line 661
    .line 662
    goto :goto_3

    .line 663
    :cond_5
    move v4, v5

    .line 664
    :cond_6
    :goto_3
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    return-object v0

    .line 669
    :pswitch_d
    move-object/from16 v0, p1

    .line 670
    .line 671
    check-cast v0, Lf17;

    .line 672
    .line 673
    sget-object v1, Ld17;->a:[Lnw3;

    .line 674
    .line 675
    sget-object v1, Lc17;->d:Le17;

    .line 676
    .line 677
    sget-object v2, Ld17;->a:[Lnw3;

    .line 678
    .line 679
    aget-object v3, v2, v3

    .line 680
    .line 681
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    invoke-interface {v0, v1, v7}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    sget-object v1, Lc17;->u:Le17;

    .line 688
    .line 689
    const/16 v3, 0xb

    .line 690
    .line 691
    aget-object v2, v2, v3

    .line 692
    .line 693
    const/4 v2, 0x0

    .line 694
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 695
    .line 696
    .line 697
    move-result-object v2

    .line 698
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 699
    .line 700
    .line 701
    invoke-interface {v0, v1, v2}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 702
    .line 703
    .line 704
    return-object v6

    .line 705
    :pswitch_e
    move-object/from16 v0, p1

    .line 706
    .line 707
    check-cast v0, Ljava/io/PrintWriter;

    .line 708
    .line 709
    invoke-static {v0}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 710
    .line 711
    .line 712
    move-result-object v1

    .line 713
    new-instance v2, Ljava/lang/StringBuilder;

    .line 714
    .line 715
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 719
    .line 720
    .line 721
    const-string v1, " Invalid ProviderId: "

    .line 722
    .line 723
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    return-object v6

    .line 737
    :pswitch_f
    move-object/from16 v0, p1

    .line 738
    .line 739
    check-cast v0, Ljava/io/PrintWriter;

    .line 740
    .line 741
    invoke-static {v0}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    new-instance v2, Ljava/lang/StringBuilder;

    .line 746
    .line 747
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    const-string v1, " Warning: Invalid providerId was skipped: "

    .line 754
    .line 755
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 759
    .line 760
    .line 761
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v1

    .line 765
    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    return-object v6

    .line 769
    :pswitch_10
    move-object/from16 v0, p1

    .line 770
    .line 771
    check-cast v0, Lqg5;

    .line 772
    .line 773
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    iget-object v0, v0, Lqg5;->Y:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v0, Lsu/happ/proxyutility/dto/ServerConfig;

    .line 779
    .line 780
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ServerConfig;->i()Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    invoke-static {v0, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    move-result v0

    .line 788
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    return-object v0

    .line 793
    :pswitch_11
    move-object/from16 v0, p1

    .line 794
    .line 795
    check-cast v0, Lsu/happ/proxyutility/dto/LogFileInfo;

    .line 796
    .line 797
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/LogFileInfo;->c()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    invoke-static {v0, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    move-result v0

    .line 808
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    return-object v0

    .line 813
    :pswitch_12
    move-object/from16 v0, p1

    .line 814
    .line 815
    check-cast v0, Lf17;

    .line 816
    .line 817
    invoke-static {v0, v7}, Ld17;->b(Lf17;Ljava/lang/String;)V

    .line 818
    .line 819
    .line 820
    const/4 v1, 0x5

    .line 821
    invoke-static {v0, v1}, Ld17;->d(Lf17;I)V

    .line 822
    .line 823
    .line 824
    return-object v6

    .line 825
    :pswitch_13
    move-object/from16 v0, p1

    .line 826
    .line 827
    check-cast v0, Lo05;

    .line 828
    .line 829
    sget-object v1, Lsz2;->d:Ljs5;

    .line 830
    .line 831
    invoke-virtual {v0, v1, v7}, Lo05;->e(Ljs5;Ljava/lang/Object;)V

    .line 832
    .line 833
    .line 834
    invoke-static {v0, v7}, Lsz2;->d(Lo05;Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    return-object v2

    .line 838
    :pswitch_14
    move-object/from16 v0, p1

    .line 839
    .line 840
    check-cast v0, Lqg5;

    .line 841
    .line 842
    iget-object v1, v0, Lqg5;->X:Ljava/lang/Object;

    .line 843
    .line 844
    check-cast v1, Ljava/lang/String;

    .line 845
    .line 846
    iget-object v0, v0, Lqg5;->Y:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast v0, Lld6;

    .line 849
    .line 850
    iget-object v2, v0, Lld6;->X:Ljava/lang/String;

    .line 851
    .line 852
    invoke-static {v2, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 853
    .line 854
    .line 855
    move-result v2

    .line 856
    if-eqz v2, :cond_7

    .line 857
    .line 858
    sget-object v1, Lvm3;->d:Lum3;

    .line 859
    .line 860
    iget-object v3, v0, Lld6;->X:Ljava/lang/String;

    .line 861
    .line 862
    iget-object v4, v0, Lld6;->Y:Lda1;

    .line 863
    .line 864
    iget-wide v5, v0, Lld6;->Z:J

    .line 865
    .line 866
    iget-object v7, v0, Lld6;->f0:Ljava/lang/String;

    .line 867
    .line 868
    iget-object v8, v0, Lld6;->g0:Lkd6;

    .line 869
    .line 870
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 874
    .line 875
    .line 876
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 877
    .line 878
    .line 879
    new-instance v2, Lld6;

    .line 880
    .line 881
    const/4 v9, 0x1

    .line 882
    invoke-direct/range {v2 .. v9}, Lld6;-><init>(Ljava/lang/String;Lda1;JLjava/lang/String;Lkd6;Z)V

    .line 883
    .line 884
    .line 885
    iget-object v0, v1, Lvm3;->b:Lg55;

    .line 886
    .line 887
    sget-object v0, Lld6;->Companion:Ljd6;

    .line 888
    .line 889
    invoke-virtual {v0}, Ljd6;->serializer()Low3;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    check-cast v0, Low3;

    .line 894
    .line 895
    invoke-virtual {v1, v0, v2}, Lvm3;->b(Low3;Ljava/lang/Object;)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v1

    .line 899
    :cond_7
    return-object v1

    .line 900
    :pswitch_15
    move-object/from16 v0, p1

    .line 901
    .line 902
    check-cast v0, Ljava/io/PrintWriter;

    .line 903
    .line 904
    invoke-static {v0}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 905
    .line 906
    .line 907
    move-result-object v1

    .line 908
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 909
    .line 910
    .line 911
    move-result v2

    .line 912
    new-instance v3, Ljava/lang/StringBuilder;

    .line 913
    .line 914
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 915
    .line 916
    .line 917
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 918
    .line 919
    .line 920
    const-string v1, " control type:import-data data:"

    .line 921
    .line 922
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 923
    .line 924
    .line 925
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 926
    .line 927
    .line 928
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v1

    .line 932
    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 933
    .line 934
    .line 935
    return-object v6

    .line 936
    :pswitch_16
    move-object/from16 v0, p1

    .line 937
    .line 938
    check-cast v0, Lqg5;

    .line 939
    .line 940
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    .line 942
    .line 943
    iget-object v0, v0, Lqg5;->Y:Ljava/lang/Object;

    .line 944
    .line 945
    check-cast v0, Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 946
    .line 947
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/SubscriptionItem;->R()Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    if-nez v0, :cond_8

    .line 952
    .line 953
    goto :goto_4

    .line 954
    :cond_8
    move-object v2, v0

    .line 955
    :goto_4
    invoke-static {v2, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 956
    .line 957
    .line 958
    move-result v0

    .line 959
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    return-object v0

    .line 964
    :pswitch_17
    move-object/from16 v0, p1

    .line 965
    .line 966
    check-cast v0, Ljava/io/PrintWriter;

    .line 967
    .line 968
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 969
    .line 970
    .line 971
    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 972
    .line 973
    .line 974
    return-object v6

    .line 975
    :pswitch_18
    move-object/from16 v0, p1

    .line 976
    .line 977
    check-cast v0, Lqr6;

    .line 978
    .line 979
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 980
    .line 981
    .line 982
    const-string v1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)"

    .line 983
    .line 984
    invoke-interface {v0, v1}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 985
    .line 986
    .line 987
    move-result-object v1

    .line 988
    :try_start_1
    invoke-interface {v1, v4, v7}, Lxr6;->T(ILjava/lang/String;)V

    .line 989
    .line 990
    .line 991
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 992
    .line 993
    .line 994
    move-result v0

    .line 995
    if-eqz v0, :cond_a

    .line 996
    .line 997
    invoke-interface {v1, v5}, Lxr6;->getLong(I)J

    .line 998
    .line 999
    .line 1000
    move-result-wide v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1001
    long-to-int v0, v2

    .line 1002
    if-eqz v0, :cond_9

    .line 1003
    .line 1004
    goto :goto_5

    .line 1005
    :cond_9
    move v4, v5

    .line 1006
    :goto_5
    move v5, v4

    .line 1007
    goto :goto_6

    .line 1008
    :catchall_1
    move-exception v0

    .line 1009
    goto :goto_7

    .line 1010
    :cond_a
    :goto_6
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1011
    .line 1012
    .line 1013
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    return-object v0

    .line 1018
    :goto_7
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1019
    .line 1020
    .line 1021
    throw v0

    .line 1022
    :pswitch_19
    move-object/from16 v0, p1

    .line 1023
    .line 1024
    check-cast v0, Lqr6;

    .line 1025
    .line 1026
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1027
    .line 1028
    .line 1029
    const-string v1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"

    .line 1030
    .line 1031
    invoke-interface {v0, v1}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v1

    .line 1035
    :try_start_2
    invoke-interface {v1, v4, v7}, Lxr6;->T(ILjava/lang/String;)V

    .line 1036
    .line 1037
    .line 1038
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 1039
    .line 1040
    .line 1041
    move-result v0

    .line 1042
    if-eqz v0, :cond_c

    .line 1043
    .line 1044
    invoke-interface {v1, v5}, Lxr6;->getLong(I)J

    .line 1045
    .line 1046
    .line 1047
    move-result-wide v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1048
    long-to-int v0, v2

    .line 1049
    if-eqz v0, :cond_b

    .line 1050
    .line 1051
    goto :goto_8

    .line 1052
    :cond_b
    move v4, v5

    .line 1053
    :goto_8
    move v5, v4

    .line 1054
    goto :goto_9

    .line 1055
    :catchall_2
    move-exception v0

    .line 1056
    goto :goto_a

    .line 1057
    :cond_c
    :goto_9
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1058
    .line 1059
    .line 1060
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v0

    .line 1064
    return-object v0

    .line 1065
    :goto_a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1066
    .line 1067
    .line 1068
    throw v0

    .line 1069
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1070
    .line 1071
    check-cast v0, Lqr6;

    .line 1072
    .line 1073
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1074
    .line 1075
    .line 1076
    const-string v1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?"

    .line 1077
    .line 1078
    invoke-interface {v0, v1}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v1

    .line 1082
    :try_start_3
    invoke-interface {v1, v4, v7}, Lxr6;->T(ILjava/lang/String;)V

    .line 1083
    .line 1084
    .line 1085
    new-instance v0, Ljava/util/ArrayList;

    .line 1086
    .line 1087
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1088
    .line 1089
    .line 1090
    :goto_b
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 1091
    .line 1092
    .line 1093
    move-result v2

    .line 1094
    if-eqz v2, :cond_d

    .line 1095
    .line 1096
    invoke-interface {v1, v5}, Lxr6;->p0(I)Ljava/lang/String;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v2

    .line 1100
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1101
    .line 1102
    .line 1103
    goto :goto_b

    .line 1104
    :catchall_3
    move-exception v0

    .line 1105
    goto :goto_c

    .line 1106
    :cond_d
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1107
    .line 1108
    .line 1109
    return-object v0

    .line 1110
    :goto_c
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1111
    .line 1112
    .line 1113
    throw v0

    .line 1114
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1115
    .line 1116
    check-cast v0, Lf17;

    .line 1117
    .line 1118
    sget-object v1, Ld17;->a:[Lnw3;

    .line 1119
    .line 1120
    sget-object v1, Lc17;->d:Le17;

    .line 1121
    .line 1122
    sget-object v2, Ld17;->a:[Lnw3;

    .line 1123
    .line 1124
    aget-object v2, v2, v3

    .line 1125
    .line 1126
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1127
    .line 1128
    .line 1129
    invoke-interface {v0, v1, v7}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 1130
    .line 1131
    .line 1132
    return-object v6

    .line 1133
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1134
    .line 1135
    check-cast v0, Lf17;

    .line 1136
    .line 1137
    sget-object v1, Ld17;->a:[Lnw3;

    .line 1138
    .line 1139
    sget-object v1, Lc17;->k:Le17;

    .line 1140
    .line 1141
    sget-object v2, Ld17;->a:[Lnw3;

    .line 1142
    .line 1143
    const/4 v4, 0x3

    .line 1144
    aget-object v4, v2, v4

    .line 1145
    .line 1146
    new-instance v4, Luc4;

    .line 1147
    .line 1148
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1152
    .line 1153
    .line 1154
    invoke-interface {v0, v1, v4}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 1155
    .line 1156
    .line 1157
    sget-object v1, Lc17;->d:Le17;

    .line 1158
    .line 1159
    aget-object v2, v2, v3

    .line 1160
    .line 1161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1162
    .line 1163
    .line 1164
    invoke-interface {v0, v1, v7}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 1165
    .line 1166
    .line 1167
    return-object v6

    .line 1168
    nop

    .line 1169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
