.class public final synthetic Lmj4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/main/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lmj4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lmj4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lmj4;->X:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const-string v3, "binding"

    .line 7
    .line 8
    const/high16 v4, 0x10000000

    .line 9
    .line 10
    const-string v5, "package"

    .line 11
    .line 12
    const-string v6, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 13
    .line 14
    sget-object v7, Ldn8;->a:Ldn8;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    iget-object v9, v0, Lmj4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 23
    .line 24
    new-instance v0, Lak7;

    .line 25
    .line 26
    invoke-virtual {v9}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1}, Lak7;-><init>(Landroid/content/Context;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_0
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 38
    .line 39
    new-instance v0, Lvj4;

    .line 40
    .line 41
    invoke-direct {v0, v9}, Lvj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_1
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 46
    .line 47
    new-instance v0, Landroid/content/Intent;

    .line 48
    .line 49
    invoke-direct {v0, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v5, v1, v8}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v9, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 69
    .line 70
    .line 71
    return-object v7

    .line 72
    :pswitch_2
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 73
    .line 74
    new-instance v0, Landroid/content/Intent;

    .line 75
    .line 76
    invoke-direct {v0, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {v5, v1, v8}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v9, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 96
    .line 97
    .line 98
    return-object v7

    .line 99
    :pswitch_3
    new-instance v0, Ltf7;

    .line 100
    .line 101
    iget-object v1, v9, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 102
    .line 103
    if-eqz v1, :cond_0

    .line 104
    .line 105
    iget-object v1, v1, Lb6;->A0:Landroid/view/View;

    .line 106
    .line 107
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 108
    .line 109
    sget-object v2, Ltf7;->p:Lmx1;

    .line 110
    .line 111
    invoke-direct {v0, v1, v2}, Ltf7;-><init>(Ljava/lang/Object;Lys0;)V

    .line 112
    .line 113
    .line 114
    new-instance v1, Luf7;

    .line 115
    .line 116
    invoke-direct {v1}, Luf7;-><init>()V

    .line 117
    .line 118
    .line 119
    const-wide/16 v2, 0x0

    .line 120
    .line 121
    iput-wide v2, v1, Luf7;->i:D

    .line 122
    .line 123
    const/high16 v2, 0x3f400000    # 0.75f

    .line 124
    .line 125
    invoke-virtual {v1, v2}, Luf7;->a(F)V

    .line 126
    .line 127
    .line 128
    const/high16 v2, 0x43160000    # 150.0f

    .line 129
    .line 130
    invoke-virtual {v1, v2}, Luf7;->b(F)V

    .line 131
    .line 132
    .line 133
    iput-object v1, v0, Ltf7;->m:Luf7;

    .line 134
    .line 135
    return-object v0

    .line 136
    :cond_0
    invoke-static {v3}, Ldh3;->T(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v8

    .line 140
    :pswitch_4
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 141
    .line 142
    sget-object v0, Lpz7;->a:Lvz7;

    .line 143
    .line 144
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 149
    .line 150
    const-string v1, "pref_tv_ui"

    .line 151
    .line 152
    invoke-virtual {v0, v1, v2}, Lcom/tencent/mmkv/MMKV;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v9}, Lsu/happ/proxyutility/ui/BaseActivity;->y()V

    .line 156
    .line 157
    .line 158
    return-object v7

    .line 159
    :pswitch_5
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 160
    .line 161
    sget-object v0, Lss8;->a:Lss8;

    .line 162
    .line 163
    const-string v0, "https://www.happ.su/main/ru/vacancies"

    .line 164
    .line 165
    invoke-static {v9, v0}, Lss8;->B(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    return-object v7

    .line 169
    :pswitch_6
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 170
    .line 171
    new-instance v0, Lyj4;

    .line 172
    .line 173
    invoke-direct {v0, v9}, Lyj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;)V

    .line 174
    .line 175
    .line 176
    return-object v0

    .line 177
    :pswitch_7
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 178
    .line 179
    new-instance v0, Landroid/content/Intent;

    .line 180
    .line 181
    invoke-direct {v0, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-static {v5, v1, v8}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v9, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 201
    .line 202
    .line 203
    return-object v7

    .line 204
    :pswitch_8
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 205
    .line 206
    sget v0, Le46;->fragment_container_view:I

    .line 207
    .line 208
    invoke-virtual {v9}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    new-instance v3, Lku0;

    .line 213
    .line 214
    invoke-direct {v3}, Lku0;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3}, Lsn1;->V()V

    .line 218
    .line 219
    .line 220
    new-instance v4, Lr00;

    .line 221
    .line 222
    invoke-direct {v4, v1}, Lr00;-><init>(Lml2;)V

    .line 223
    .line 224
    .line 225
    iput-boolean v2, v4, Lr00;->o:Z

    .line 226
    .line 227
    invoke-virtual {v4, v0, v3, v8, v2}, Lr00;->g(ILqk2;Ljava/lang/String;I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4}, Lr00;->e()V

    .line 231
    .line 232
    .line 233
    return-object v7

    .line 234
    :pswitch_9
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 235
    .line 236
    :try_start_0
    sget-object v0, Lss8;->a:Lss8;

    .line 237
    .line 238
    invoke-static {}, Lss8;->n()Ljava/util/Locale;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    sget-object v1, Lsu/happ/proxyutility/ui/FaqSettingsActivity;->R0:Ljava/util/Map;

    .line 247
    .line 248
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 249
    .line 250
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-eqz v3, :cond_2

    .line 266
    .line 267
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    check-cast v3, Ljava/util/Map$Entry;

    .line 272
    .line 273
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    invoke-static {v4, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-eqz v4, :cond_1

    .line 282
    .line 283
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    goto :goto_0

    .line 295
    :catchall_0
    move-exception v0

    .line 296
    goto :goto_1

    .line 297
    :cond_2
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    if-eqz v1, :cond_4

    .line 310
    .line 311
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    check-cast v1, Ljava/util/Map$Entry;

    .line 316
    .line 317
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    check-cast v1, Ljava/lang/String;

    .line 322
    .line 323
    if-eqz v1, :cond_3

    .line 324
    .line 325
    move-object v8, v1

    .line 326
    :cond_4
    if-nez v8, :cond_5

    .line 327
    .line 328
    const-string v8, "https://www.happ.su/main/faq"

    .line 329
    .line 330
    :cond_5
    new-instance v0, Landroid/content/Intent;

    .line 331
    .line 332
    const-class v1, Lsu/happ/proxyutility/ui/WebViewActivity;

    .line 333
    .line 334
    invoke-direct {v0, v9, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 335
    .line 336
    .line 337
    const-string v1, "urlInIntent"

    .line 338
    .line 339
    invoke-virtual {v0, v1, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-virtual {v9, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 344
    .line 345
    .line 346
    goto :goto_2

    .line 347
    :goto_1
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 348
    .line 349
    if-nez v1, :cond_6

    .line 350
    .line 351
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 352
    .line 353
    if-nez v1, :cond_6

    .line 354
    .line 355
    :goto_2
    return-object v7

    .line 356
    :cond_6
    throw v0

    .line 357
    :pswitch_a
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 358
    .line 359
    const-string v0, "connectivity"

    .line 360
    .line 361
    invoke-virtual {v9, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 369
    .line 370
    return-object v0

    .line 371
    :pswitch_b
    iget-object v0, v9, Lsu/happ/proxyutility/feature/main/MainActivity;->Q0:Lb6;

    .line 372
    .line 373
    if-eqz v0, :cond_7

    .line 374
    .line 375
    new-instance v1, Lck4;

    .line 376
    .line 377
    invoke-direct {v1, v0}, Lck4;-><init>(Lb6;)V

    .line 378
    .line 379
    .line 380
    return-object v1

    .line 381
    :cond_7
    invoke-static {v3}, Ldh3;->T(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw v8

    .line 385
    :pswitch_c
    sget v1, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 386
    .line 387
    new-instance v2, Lyn1;

    .line 388
    .line 389
    const/4 v8, 0x0

    .line 390
    const/4 v9, 0x6

    .line 391
    const/4 v3, 0x2

    .line 392
    iget-object v4, v0, Lmj4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 393
    .line 394
    const-class v5, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 395
    .line 396
    const-string v6, "onConfigSelected"

    .line 397
    .line 398
    const-string v7, "onConfigSelected-jqnfO9s(Ljava/lang/String;Ljava/lang/String;)V"

    .line 399
    .line 400
    invoke-direct/range {v2 .. v9}, Lyn1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 401
    .line 402
    .line 403
    new-instance v8, Ld0;

    .line 404
    .line 405
    const/16 v16, 0x0

    .line 406
    .line 407
    const/16 v17, 0x18

    .line 408
    .line 409
    const/4 v11, 0x1

    .line 410
    const-string v14, "onChangeExpanded"

    .line 411
    .line 412
    const-string v15, "onChangeExpanded-qwfqlqI(Ljava/lang/String;)V"

    .line 413
    .line 414
    move-object v12, v4

    .line 415
    move-object v13, v5

    .line 416
    move-object v10, v8

    .line 417
    invoke-direct/range {v10 .. v17}, Ld0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 418
    .line 419
    .line 420
    move-object v0, v2

    .line 421
    new-instance v2, Ldw7;

    .line 422
    .line 423
    new-instance v7, Luj4;

    .line 424
    .line 425
    const/4 v1, 0x0

    .line 426
    invoke-direct {v7, v4, v1}, Luj4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V

    .line 427
    .line 428
    .line 429
    new-instance v9, Lsb;

    .line 430
    .line 431
    const/4 v1, 0x3

    .line 432
    invoke-direct {v9, v4, v1}, Lsb;-><init>(Ljava/lang/Object;B)V

    .line 433
    .line 434
    .line 435
    const/16 v10, 0x1b

    .line 436
    .line 437
    const/4 v3, 0x0

    .line 438
    const/4 v5, 0x0

    .line 439
    const/4 v6, 0x0

    .line 440
    move-object v4, v0

    .line 441
    invoke-direct/range {v2 .. v10}, Ldw7;-><init>(Lmh7;Lyn1;Lyn1;Lvb;Luj4;Lgn2;Lsb;I)V

    .line 442
    .line 443
    .line 444
    return-object v2

    .line 445
    :pswitch_data_0
    .packed-switch 0x0
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
