.class public final synthetic La23;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb88;Lpl;Lbi;)V
    .locals 0

    .line 1
    const/16 p1, 0x1d

    .line 2
    .line 3
    iput-byte p1, p0, La23;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, La23;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, La23;->Z:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 13
    iput-byte p3, p0, La23;->X:B

    iput-object p1, p0, La23;->Y:Ljava/lang/Object;

    iput-object p2, p0, La23;->Z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La23;->X:B

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    const/4 v3, -0x1

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x3

    .line 9
    const/4 v6, 0x1

    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v8, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lpl;

    .line 18
    .line 19
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lbi;

    .line 22
    .line 23
    iget-object v0, v0, Lpl;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lpa4;

    .line 26
    .line 27
    instance-of v1, v0, Loa4;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    :try_start_0
    check-cast v0, Loa4;

    .line 32
    .line 33
    iget-object v0, v0, Loa4;->a:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 36
    .line 37
    .line 38
    :try_start_1
    iget-object p0, p0, Lbi;->a:Landroid/content/Context;

    .line 39
    .line 40
    new-instance v1, Landroid/content/Intent;

    .line 41
    .line 42
    const-string v2, "android.intent.action.VIEW"

    .line 43
    .line 44
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catch_0
    move-exception p0

    .line 56
    :try_start_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 57
    .line 58
    const-string v2, "Can\'t open "

    .line 59
    .line 60
    const-string v3, "."

    .line 61
    .line 62
    invoke-static {v2, v0, v3}, Lpc6;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-direct {v1, v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    throw v1
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    .line 70
    :catch_1
    :cond_0
    :goto_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_0
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lb71;

    .line 76
    .line 77
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, Lgn2;

    .line 80
    .line 81
    sget-object v1, Le71;->f0:Le71;

    .line 82
    .line 83
    new-instance v2, Lu68;

    .line 84
    .line 85
    invoke-direct {v2, p0, v7, v8}, Lu68;-><init>(Lgn2;Lq51;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0, v7, v1, v2, v6}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 89
    .line 90
    .line 91
    sget-object p0, Ldn8;->a:Ldn8;

    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_1
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Lr68;

    .line 97
    .line 98
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p0, Ly48;

    .line 101
    .line 102
    iget-boolean v0, v0, Lr68;->h:Z

    .line 103
    .line 104
    if-nez v0, :cond_1

    .line 105
    .line 106
    iget-object p0, p0, Ly48;->B0:Lci2;

    .line 107
    .line 108
    iget-boolean v0, p0, Ljx4;->p0:Z

    .line 109
    .line 110
    if-eqz v0, :cond_1

    .line 111
    .line 112
    iget-object p0, p0, Lci2;->x0:Lai2;

    .line 113
    .line 114
    invoke-static {p0}, Lai2;->h1(Lai2;)Z

    .line 115
    .line 116
    .line 117
    :cond_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_2
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Ln48;

    .line 123
    .line 124
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p0, Lca6;

    .line 127
    .line 128
    iget-object v1, v0, Ln48;->v0:Lkd8;

    .line 129
    .line 130
    invoke-virtual {v1}, Lkd8;->d()Lh48;

    .line 131
    .line 132
    .line 133
    iget-boolean v1, v0, Ljx4;->p0:Z

    .line 134
    .line 135
    if-eqz v1, :cond_2

    .line 136
    .line 137
    sget-object v1, Ly01;->u:Lox1;

    .line 138
    .line 139
    invoke-static {v0, v1}, Lhi5;->W(Ls01;Lq06;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, Lt09;

    .line 144
    .line 145
    check-cast v0, Ly74;

    .line 146
    .line 147
    iget-object v0, v0, Ly74;->c:Lrh5;

    .line 148
    .line 149
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    check-cast v0, Ljava/lang/Boolean;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_2

    .line 160
    .line 161
    move v4, v6

    .line 162
    :cond_2
    iget v0, p0, Lca6;->X:I

    .line 163
    .line 164
    mul-int/2addr v4, v0

    .line 165
    mul-int/2addr v0, v3

    .line 166
    iput v0, p0, Lca6;->X:I

    .line 167
    .line 168
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    return-object p0

    .line 173
    :pswitch_3
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v0, Landroid/content/Context;

    .line 176
    .line 177
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p0, Landroid/view/textclassifier/TextClassification;

    .line 180
    .line 181
    invoke-static {v0, p0}, Lue3;->L(Landroid/content/Context;Landroid/view/textclassifier/TextClassification;)V

    .line 182
    .line 183
    .line 184
    sget-object p0, Ldn8;->a:Ldn8;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_4
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, Lmx7;

    .line 190
    .line 191
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p0, Ljava/util/List;

    .line 194
    .line 195
    sget-object v1, Lkl7;->a:Lzx;

    .line 196
    .line 197
    iget-object v0, v0, Lmx7;->a:Ljj0;

    .line 198
    .line 199
    invoke-static {v0, p0}, Lkl7;->a(Ljj0;Ljava/util/List;)Z

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    return-object p0

    .line 208
    :pswitch_5
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v0, Lpv3;

    .line 211
    .line 212
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast p0, Law5;

    .line 215
    .line 216
    check-cast v0, Lgn2;

    .line 217
    .line 218
    check-cast p0, Lyv5;

    .line 219
    .line 220
    iget-object p0, p0, Lyv5;->a:Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    new-instance v1, Lqo7;

    .line 226
    .line 227
    invoke-direct {v1, p0}, Lqo7;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-interface {v0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    sget-object p0, Ldn8;->a:Ldn8;

    .line 234
    .line 235
    return-object p0

    .line 236
    :pswitch_6
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v0, Lt16;

    .line 239
    .line 240
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast p0, Landroidx/work/impl/WorkDatabase;

    .line 243
    .line 244
    invoke-virtual {v0, p0}, Lt16;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    return-object p0

    .line 249
    :pswitch_7
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, Lokhttp3/Dns$Callback;

    .line 252
    .line 253
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast p0, Lokhttp3/internal/dns/StateMachineDnsCall;

    .line 256
    .line 257
    invoke-static {v0, p0}, Lokhttp3/internal/dns/StateMachineDnsCall;->a(Lokhttp3/Dns$Callback;Lokhttp3/internal/dns/StateMachineDnsCall;)Ldn8;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    return-object p0

    .line 262
    :pswitch_8
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v0, Landroid/content/Context;

    .line 265
    .line 266
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast p0, Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {v0, p0, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    return-object p0

    .line 278
    :pswitch_9
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v0, Lzw2;

    .line 281
    .line 282
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast p0, Landroid/net/ConnectivityManager;

    .line 285
    .line 286
    sget-object v1, Ly77;->b:Ljava/lang/Object;

    .line 287
    .line 288
    monitor-enter v1

    .line 289
    :try_start_3
    sget-object v2, Ly77;->c:Ljava/util/LinkedHashMap;

    .line 290
    .line 291
    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-eqz v0, :cond_3

    .line 299
    .line 300
    invoke-static {}, Llh4;->P0()Llh4;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    sget v2, Lk39;->a:I

    .line 305
    .line 306
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    sget-object v0, Ly77;->a:Ly77;

    .line 310
    .line 311
    invoke-virtual {p0, v0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 312
    .line 313
    .line 314
    sput-object v7, Ly77;->f:Ljava/lang/Boolean;

    .line 315
    .line 316
    sput-object v7, Ly77;->d:Landroid/net/NetworkCapabilities;

    .line 317
    .line 318
    sput-boolean v8, Ly77;->e:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 319
    .line 320
    goto :goto_1

    .line 321
    :catchall_0
    move-exception p0

    .line 322
    goto :goto_2

    .line 323
    :cond_3
    :goto_1
    monitor-exit v1

    .line 324
    sget-object p0, Ldn8;->a:Ldn8;

    .line 325
    .line 326
    return-object p0

    .line 327
    :goto_2
    monitor-exit v1

    .line 328
    throw p0

    .line 329
    :pswitch_a
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v0, Lsu/happ/proxyutility/feature/settings/SettingsActivity;

    .line 332
    .line 333
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast p0, Ljava/lang/String;

    .line 336
    .line 337
    sget v1, Lsu/happ/proxyutility/feature/settings/SettingsActivity$msgReceiver$1;->b:I

    .line 338
    .line 339
    sget-object v1, Lss8;->a:Lss8;

    .line 340
    .line 341
    invoke-static {v0, p0}, Lss8;->E(Landroid/content/Context;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    sget p0, Ly46;->toast_copied_to_clipboard:I

    .line 345
    .line 346
    invoke-static {v0, p0}, Lpu;->Q(Lsu/happ/proxyutility/ui/SnackbarHostActivity;I)V

    .line 347
    .line 348
    .line 349
    sget-object p0, Ldn8;->a:Ldn8;

    .line 350
    .line 351
    return-object p0

    .line 352
    :pswitch_b
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v0, Ljava/lang/String;

    .line 355
    .line 356
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast p0, Luy6;

    .line 359
    .line 360
    sget-object v1, Lqq5;->M:Lqq5;

    .line 361
    .line 362
    new-array v2, v8, [Le37;

    .line 363
    .line 364
    new-instance v3, Lty6;

    .line 365
    .line 366
    invoke-direct {v3, p0, v8}, Lty6;-><init>(Luy6;B)V

    .line 367
    .line 368
    .line 369
    invoke-static {v0, v1, v2, v3}, Lkm4;->m(Ljava/lang/String;Lnr4;[Le37;Lgn2;)Lg37;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    return-object p0

    .line 374
    :pswitch_c
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v0, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 377
    .line 378
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast p0, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 381
    .line 382
    sget v1, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->X0:I

    .line 383
    .line 384
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->C()Lmn6;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-virtual {v2, v0, v1}, Lmn6;->y(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->C()Lmn6;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0, v1}, Lmn6;->o(Ljava/lang/String;)Lb83;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-eqz v0, :cond_4

    .line 418
    .line 419
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;->C()Lmn6;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-virtual {v0, v1, v8}, Lmn6;->F(Ljava/lang/String;Z)V

    .line 424
    .line 425
    .line 426
    :cond_4
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 427
    .line 428
    .line 429
    sget-object p0, Ldn8;->a:Ldn8;

    .line 430
    .line 431
    return-object p0

    .line 432
    :pswitch_d
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v0, Lpv3;

    .line 435
    .line 436
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast p0, Lbw5;

    .line 439
    .line 440
    check-cast v0, Lgn2;

    .line 441
    .line 442
    check-cast p0, Lzv5;

    .line 443
    .line 444
    iget-object v1, p0, Lzv5;->a:Ljava/lang/String;

    .line 445
    .line 446
    iget-object p0, p0, Lzv5;->b:Ljava/lang/String;

    .line 447
    .line 448
    new-instance v2, Ljo6;

    .line 449
    .line 450
    invoke-direct {v2, p0, v1}, Ljo6;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    invoke-interface {v0, v2}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    sget-object p0, Ldn8;->a:Ldn8;

    .line 457
    .line 458
    return-object p0

    .line 459
    :pswitch_e
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v0, Lt05;

    .line 462
    .line 463
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast p0, Lr01;

    .line 466
    .line 467
    iget-object v3, v0, Lt05;->b:[Ljava/lang/Object;

    .line 468
    .line 469
    iget-object v0, v0, Lt05;->a:[J

    .line 470
    .line 471
    array-length v5, v0

    .line 472
    sub-int/2addr v5, v4

    .line 473
    if-ltz v5, :cond_8

    .line 474
    .line 475
    move v4, v8

    .line 476
    :goto_3
    aget-wide v6, v0, v4

    .line 477
    .line 478
    not-long v9, v6

    .line 479
    shl-long/2addr v9, v1

    .line 480
    and-long/2addr v9, v6

    .line 481
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    and-long/2addr v9, v11

    .line 487
    cmp-long v9, v9, v11

    .line 488
    .line 489
    if-eqz v9, :cond_7

    .line 490
    .line 491
    sub-int v9, v4, v5

    .line 492
    .line 493
    not-int v9, v9

    .line 494
    ushr-int/lit8 v9, v9, 0x1f

    .line 495
    .line 496
    rsub-int/lit8 v9, v9, 0x8

    .line 497
    .line 498
    move v10, v8

    .line 499
    :goto_4
    if-ge v10, v9, :cond_6

    .line 500
    .line 501
    const-wide/16 v11, 0xff

    .line 502
    .line 503
    and-long/2addr v11, v6

    .line 504
    const-wide/16 v13, 0x80

    .line 505
    .line 506
    cmp-long v11, v11, v13

    .line 507
    .line 508
    if-gez v11, :cond_5

    .line 509
    .line 510
    shl-int/lit8 v11, v4, 0x3

    .line 511
    .line 512
    add-int/2addr v11, v10

    .line 513
    aget-object v11, v3, v11

    .line 514
    .line 515
    invoke-virtual {p0, v11}, Lr01;->z(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    :cond_5
    shr-long/2addr v6, v2

    .line 519
    add-int/lit8 v10, v10, 0x1

    .line 520
    .line 521
    goto :goto_4

    .line 522
    :cond_6
    if-ne v9, v2, :cond_8

    .line 523
    .line 524
    :cond_7
    if-eq v4, v5, :cond_8

    .line 525
    .line 526
    add-int/lit8 v4, v4, 0x1

    .line 527
    .line 528
    goto :goto_3

    .line 529
    :cond_8
    sget-object p0, Ldn8;->a:Ldn8;

    .line 530
    .line 531
    return-object p0

    .line 532
    :pswitch_f
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v0, Ldn2;

    .line 535
    .line 536
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast p0, Ldn2;

    .line 539
    .line 540
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    sget-object p0, Ldn8;->a:Ldn8;

    .line 547
    .line 548
    return-object p0

    .line 549
    :pswitch_10
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v0, Landroid/content/Context;

    .line 552
    .line 553
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast p0, Lis5;

    .line 556
    .line 557
    iget-object p0, p0, Lis5;->a:Ljava/lang/String;

    .line 558
    .line 559
    const-string v1, ".preferences_pb"

    .line 560
    .line 561
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object p0

    .line 565
    new-instance v1, Ljava/io/File;

    .line 566
    .line 567
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    const-string v2, "datastore/"

    .line 576
    .line 577
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object p0

    .line 581
    invoke-direct {v1, v0, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    return-object v1

    .line 585
    :pswitch_11
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast v0, Lhk5;

    .line 588
    .line 589
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 590
    .line 591
    check-cast p0, Lik5;

    .line 592
    .line 593
    iget-object v1, v0, Lhk5;->u:Lfu6;

    .line 594
    .line 595
    new-instance v2, Lgk5;

    .line 596
    .line 597
    invoke-direct {v2, p0, v0, v1}, Lgk5;-><init>(Lik5;Lhk5;Lfu6;)V

    .line 598
    .line 599
    .line 600
    return-object v2

    .line 601
    :pswitch_12
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast v0, Lca6;

    .line 604
    .line 605
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast p0, Lw75;

    .line 608
    .line 609
    new-instance v1, Ljava/lang/StringBuilder;

    .line 610
    .line 611
    const-string v2, "Only found "

    .line 612
    .line 613
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    iget v0, v0, Lca6;->X:I

    .line 617
    .line 618
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    const-string v0, " digits in a row, but need to parse "

    .line 622
    .line 623
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {p0}, Lw75;->b()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object p0

    .line 630
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object p0

    .line 637
    return-object p0

    .line 638
    :pswitch_13
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v0, Lf63;

    .line 641
    .line 642
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast p0, Lk86;

    .line 645
    .line 646
    iget-object v0, v0, Lf63;->Y:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v0, Lrv;

    .line 649
    .line 650
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 651
    .line 652
    .line 653
    move-result v0

    .line 654
    if-eqz v0, :cond_9

    .line 655
    .line 656
    goto :goto_5

    .line 657
    :cond_9
    invoke-virtual {p0}, Lk86;->invoke()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    :goto_5
    sget-object p0, Ldn8;->a:Ldn8;

    .line 661
    .line 662
    return-object p0

    .line 663
    :pswitch_14
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v0, Lo87;

    .line 666
    .line 667
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast p0, Lb71;

    .line 670
    .line 671
    iget-object v2, v0, Lo87;->d:Lt5;

    .line 672
    .line 673
    iget-object v2, v2, Lt5;->f0:Ljava/lang/Object;

    .line 674
    .line 675
    check-cast v2, Lgn2;

    .line 676
    .line 677
    sget-object v3, Lp87;->Z:Lp87;

    .line 678
    .line 679
    invoke-interface {v2, v3}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    check-cast v2, Ljava/lang/Boolean;

    .line 684
    .line 685
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 686
    .line 687
    .line 688
    move-result v2

    .line 689
    if-eqz v2, :cond_a

    .line 690
    .line 691
    new-instance v2, Luw4;

    .line 692
    .line 693
    invoke-direct {v2, v0, v7, v1}, Luw4;-><init>(Lo87;Lq51;B)V

    .line 694
    .line 695
    .line 696
    invoke-static {p0, v7, v7, v2, v5}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 697
    .line 698
    .line 699
    :cond_a
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 700
    .line 701
    return-object p0

    .line 702
    :pswitch_15
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 703
    .line 704
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 705
    .line 706
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast p0, Lkn4;

    .line 709
    .line 710
    sget v1, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 711
    .line 712
    invoke-virtual {v0}, Lsu/happ/proxyutility/feature/main/MainActivity;->G()Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    iget-object v1, v1, Lsu/happ/proxyutility/feature/main/MainViewModel;->j:Lvz7;

    .line 717
    .line 718
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    check-cast v1, Lxj7;

    .line 723
    .line 724
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    sget-object v2, Lsu/happ/proxyutility/HappApplication;->N0:Lm51;

    .line 728
    .line 729
    new-instance v3, Lwj7;

    .line 730
    .line 731
    invoke-direct {v3, v1, v7, v6}, Lwj7;-><init>(Lxj7;Lq51;B)V

    .line 732
    .line 733
    .line 734
    invoke-static {v2, v7, v3, v5}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 735
    .line 736
    .line 737
    new-instance v1, Landroid/content/Intent;

    .line 738
    .line 739
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 740
    .line 741
    .line 742
    move-result-object v2

    .line 743
    const-class v3, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 744
    .line 745
    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 746
    .line 747
    .line 748
    const v2, 0x10008000

    .line 749
    .line 750
    .line 751
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    const-string v2, "reset_sub_import"

    .line 756
    .line 757
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    const-string v2, "reset_sub_url"

    .line 762
    .line 763
    check-cast p0, Lin4;

    .line 764
    .line 765
    iget-object p0, p0, Lin4;->a:Ljava/lang/String;

    .line 766
    .line 767
    invoke-virtual {v1, v2, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 768
    .line 769
    .line 770
    move-result-object p0

    .line 771
    invoke-virtual {v0, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 772
    .line 773
    .line 774
    sget-object p0, Ldn8;->a:Ldn8;

    .line 775
    .line 776
    return-object p0

    .line 777
    :pswitch_16
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 778
    .line 779
    check-cast v0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 780
    .line 781
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 782
    .line 783
    check-cast p0, Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;

    .line 784
    .line 785
    sget v1, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 786
    .line 787
    invoke-static {v0}, Li21;->H(Ld94;)Lu84;

    .line 788
    .line 789
    .line 790
    move-result-object v1

    .line 791
    new-instance v2, Ljy2;

    .line 792
    .line 793
    const/16 v3, 0x9

    .line 794
    .line 795
    invoke-direct {v2, v0, p0, v7, v3}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 796
    .line 797
    .line 798
    invoke-static {v1, v7, v2, v5}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 799
    .line 800
    .line 801
    sget-object p0, Ldn8;->a:Ldn8;

    .line 802
    .line 803
    return-object p0

    .line 804
    :pswitch_17
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 805
    .line 806
    check-cast v0, Lgn2;

    .line 807
    .line 808
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 809
    .line 810
    check-cast p0, Lnf4;

    .line 811
    .line 812
    new-instance v1, Lcg4;

    .line 813
    .line 814
    invoke-direct {v1, p0}, Lcg4;-><init>(Lnf4;)V

    .line 815
    .line 816
    .line 817
    invoke-interface {v0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    sget-object p0, Ldn8;->a:Ldn8;

    .line 821
    .line 822
    return-object p0

    .line 823
    :pswitch_18
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 824
    .line 825
    check-cast v0, Lgn2;

    .line 826
    .line 827
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 828
    .line 829
    check-cast p0, Le69;

    .line 830
    .line 831
    new-instance v1, Lbg4;

    .line 832
    .line 833
    invoke-direct {v1, p0}, Lbg4;-><init>(Le69;)V

    .line 834
    .line 835
    .line 836
    invoke-interface {v0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    sget-object p0, Ldn8;->a:Ldn8;

    .line 840
    .line 841
    return-object p0

    .line 842
    :pswitch_19
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 843
    .line 844
    check-cast v0, Lkv6;

    .line 845
    .line 846
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 847
    .line 848
    check-cast p0, Ljv6;

    .line 849
    .line 850
    new-instance v1, Lo74;

    .line 851
    .line 852
    sget-object v2, Le02;->X:Le02;

    .line 853
    .line 854
    invoke-direct {v1, v0, v2, p0}, Lo74;-><init>(Lkv6;Ljava/util/Map;Ljv6;)V

    .line 855
    .line 856
    .line 857
    return-object v1

    .line 858
    :pswitch_1a
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 859
    .line 860
    check-cast v0, Landroidx/compose/ui/node/LayoutNode;

    .line 861
    .line 862
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast p0, Lea6;

    .line 865
    .line 866
    iget-object v0, v0, Landroidx/compose/ui/node/LayoutNode;->H0:Lt6;

    .line 867
    .line 868
    iget-object v1, v0, Lt6;->i0:Ljava/lang/Object;

    .line 869
    .line 870
    check-cast v1, Ljx4;

    .line 871
    .line 872
    iget v1, v1, Ljx4;->f0:I

    .line 873
    .line 874
    and-int/2addr v1, v2

    .line 875
    if-eqz v1, :cond_15

    .line 876
    .line 877
    iget-object v0, v0, Lt6;->h0:Ljava/lang/Object;

    .line 878
    .line 879
    check-cast v0, Lf18;

    .line 880
    .line 881
    :goto_6
    if-eqz v0, :cond_15

    .line 882
    .line 883
    iget v1, v0, Ljx4;->Z:I

    .line 884
    .line 885
    and-int/2addr v1, v2

    .line 886
    if-eqz v1, :cond_14

    .line 887
    .line 888
    move-object v1, v0

    .line 889
    move-object v3, v7

    .line 890
    :goto_7
    if-eqz v1, :cond_14

    .line 891
    .line 892
    instance-of v4, v1, Lw07;

    .line 893
    .line 894
    if-eqz v4, :cond_d

    .line 895
    .line 896
    check-cast v1, Lw07;

    .line 897
    .line 898
    invoke-interface {v1}, Lw07;->J()Z

    .line 899
    .line 900
    .line 901
    move-result v4

    .line 902
    if-eqz v4, :cond_b

    .line 903
    .line 904
    new-instance v4, Lt07;

    .line 905
    .line 906
    invoke-direct {v4}, Lt07;-><init>()V

    .line 907
    .line 908
    .line 909
    iput-object v4, p0, Lea6;->X:Ljava/lang/Object;

    .line 910
    .line 911
    iput-boolean v6, v4, Lt07;->f0:Z

    .line 912
    .line 913
    :cond_b
    invoke-interface {v1}, Lw07;->I0()Z

    .line 914
    .line 915
    .line 916
    move-result v4

    .line 917
    if-eqz v4, :cond_c

    .line 918
    .line 919
    iget-object v4, p0, Lea6;->X:Ljava/lang/Object;

    .line 920
    .line 921
    check-cast v4, Lt07;

    .line 922
    .line 923
    iput-boolean v6, v4, Lt07;->Z:Z

    .line 924
    .line 925
    :cond_c
    iget-object v4, p0, Lea6;->X:Ljava/lang/Object;

    .line 926
    .line 927
    check-cast v4, Lf17;

    .line 928
    .line 929
    invoke-interface {v1, v4}, Lw07;->h(Lf17;)V

    .line 930
    .line 931
    .line 932
    goto :goto_a

    .line 933
    :cond_d
    iget v4, v1, Ljx4;->Z:I

    .line 934
    .line 935
    and-int/2addr v4, v2

    .line 936
    if-eqz v4, :cond_13

    .line 937
    .line 938
    instance-of v4, v1, Loh1;

    .line 939
    .line 940
    if-eqz v4, :cond_13

    .line 941
    .line 942
    move-object v4, v1

    .line 943
    check-cast v4, Loh1;

    .line 944
    .line 945
    iget-object v4, v4, Loh1;->r0:Ljx4;

    .line 946
    .line 947
    move v5, v8

    .line 948
    :goto_8
    if-eqz v4, :cond_12

    .line 949
    .line 950
    iget v9, v4, Ljx4;->Z:I

    .line 951
    .line 952
    and-int/2addr v9, v2

    .line 953
    if-eqz v9, :cond_11

    .line 954
    .line 955
    add-int/lit8 v5, v5, 0x1

    .line 956
    .line 957
    if-ne v5, v6, :cond_e

    .line 958
    .line 959
    move-object v1, v4

    .line 960
    goto :goto_9

    .line 961
    :cond_e
    if-nez v3, :cond_f

    .line 962
    .line 963
    new-instance v3, Lc15;

    .line 964
    .line 965
    const/16 v9, 0x10

    .line 966
    .line 967
    new-array v9, v9, [Ljx4;

    .line 968
    .line 969
    invoke-direct {v3, v8, v9}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 970
    .line 971
    .line 972
    :cond_f
    if-eqz v1, :cond_10

    .line 973
    .line 974
    invoke-virtual {v3, v1}, Lc15;->b(Ljava/lang/Object;)V

    .line 975
    .line 976
    .line 977
    move-object v1, v7

    .line 978
    :cond_10
    invoke-virtual {v3, v4}, Lc15;->b(Ljava/lang/Object;)V

    .line 979
    .line 980
    .line 981
    :cond_11
    :goto_9
    iget-object v4, v4, Ljx4;->h0:Ljx4;

    .line 982
    .line 983
    goto :goto_8

    .line 984
    :cond_12
    if-ne v5, v6, :cond_13

    .line 985
    .line 986
    goto :goto_7

    .line 987
    :cond_13
    :goto_a
    invoke-static {v3}, Lyn0;->T(Lc15;)Ljx4;

    .line 988
    .line 989
    .line 990
    move-result-object v1

    .line 991
    goto :goto_7

    .line 992
    :cond_14
    iget-object v0, v0, Ljx4;->g0:Ljx4;

    .line 993
    .line 994
    goto :goto_6

    .line 995
    :cond_15
    sget-object p0, Ldn8;->a:Ldn8;

    .line 996
    .line 997
    return-object p0

    .line 998
    :pswitch_1b
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 999
    .line 1000
    check-cast v0, Le37;

    .line 1001
    .line 1002
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 1003
    .line 1004
    check-cast p0, Lvm3;

    .line 1005
    .line 1006
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 1007
    .line 1008
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1009
    .line 1010
    .line 1011
    iget-object v2, p0, Lvm3;->a:Lmn3;

    .line 1012
    .line 1013
    invoke-static {p0, v0}, Lsp3;->d(Lvm3;Le37;)V

    .line 1014
    .line 1015
    .line 1016
    invoke-interface {v0}, Le37;->e()I

    .line 1017
    .line 1018
    .line 1019
    move-result p0

    .line 1020
    move v2, v8

    .line 1021
    :goto_b
    if-ge v2, p0, :cond_1b

    .line 1022
    .line 1023
    invoke-interface {v0, v2}, Le37;->g(I)Ljava/util/List;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v4

    .line 1027
    new-instance v5, Ljava/util/ArrayList;

    .line 1028
    .line 1029
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1030
    .line 1031
    .line 1032
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v4

    .line 1036
    :cond_16
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1037
    .line 1038
    .line 1039
    move-result v6

    .line 1040
    if-eqz v6, :cond_17

    .line 1041
    .line 1042
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v6

    .line 1046
    instance-of v9, v6, Lrp3;

    .line 1047
    .line 1048
    if-eqz v9, :cond_16

    .line 1049
    .line 1050
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1051
    .line 1052
    .line 1053
    goto :goto_c

    .line 1054
    :cond_17
    invoke-static {v5}, Lwv0;->Q0(Ljava/util/List;)Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v4

    .line 1058
    check-cast v4, Lrp3;

    .line 1059
    .line 1060
    if-eqz v4, :cond_1a

    .line 1061
    .line 1062
    invoke-interface {v4}, Lrp3;->names()[Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v4

    .line 1066
    if-eqz v4, :cond_1a

    .line 1067
    .line 1068
    array-length v5, v4

    .line 1069
    move v6, v8

    .line 1070
    :goto_d
    if-ge v6, v5, :cond_1a

    .line 1071
    .line 1072
    aget-object v9, v4, v6

    .line 1073
    .line 1074
    invoke-interface {v0}, Le37;->r()Lnr4;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v10

    .line 1078
    sget-object v11, Lj37;->M:Lj37;

    .line 1079
    .line 1080
    invoke-static {v10, v11}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1081
    .line 1082
    .line 1083
    move-result v10

    .line 1084
    if-eqz v10, :cond_18

    .line 1085
    .line 1086
    const-string v10, "enum value"

    .line 1087
    .line 1088
    goto :goto_e

    .line 1089
    :cond_18
    const-string v10, "property"

    .line 1090
    .line 1091
    :goto_e
    invoke-interface {v1, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v11

    .line 1095
    if-nez v11, :cond_19

    .line 1096
    .line 1097
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v10

    .line 1101
    invoke-interface {v1, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    add-int/lit8 v6, v6, 0x1

    .line 1105
    .line 1106
    goto :goto_d

    .line 1107
    :cond_19
    new-instance p0, Ljava/lang/StringBuilder;

    .line 1108
    .line 1109
    const-string v4, "The suggested name \'"

    .line 1110
    .line 1111
    invoke-direct {p0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {p0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1115
    .line 1116
    .line 1117
    const-string v4, "\' for "

    .line 1118
    .line 1119
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {p0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1123
    .line 1124
    .line 1125
    const/16 v4, 0x20

    .line 1126
    .line 1127
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1128
    .line 1129
    .line 1130
    invoke-interface {v0, v2}, Le37;->f(I)Ljava/lang/String;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v2

    .line 1134
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1135
    .line 1136
    .line 1137
    const-string v2, " is already one of the names for "

    .line 1138
    .line 1139
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {p0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1146
    .line 1147
    .line 1148
    invoke-static {v1, v9}, Lzp4;->H(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v1

    .line 1152
    check-cast v1, Ljava/lang/Number;

    .line 1153
    .line 1154
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1155
    .line 1156
    .line 1157
    move-result v1

    .line 1158
    invoke-interface {v0, v1}, Le37;->f(I)Ljava/lang/String;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v1

    .line 1162
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1163
    .line 1164
    .line 1165
    const-string v1, " in "

    .line 1166
    .line 1167
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object p0

    .line 1177
    new-instance v0, Lvn3;

    .line 1178
    .line 1179
    invoke-static {v3, p0, v7, v7, v7}, Lys0;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1180
    .line 1181
    .line 1182
    move-result-object p0

    .line 1183
    invoke-direct {v0, p0}, Lho3;-><init>(Ljava/lang/String;)V

    .line 1184
    .line 1185
    .line 1186
    throw v0

    .line 1187
    :cond_1a
    add-int/lit8 v2, v2, 0x1

    .line 1188
    .line 1189
    goto/16 :goto_b

    .line 1190
    .line 1191
    :cond_1b
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 1192
    .line 1193
    .line 1194
    move-result p0

    .line 1195
    if-eqz p0, :cond_1c

    .line 1196
    .line 1197
    sget-object v1, Le02;->X:Le02;

    .line 1198
    .line 1199
    :cond_1c
    return-object v1

    .line 1200
    :pswitch_1c
    iget-object v0, p0, La23;->Y:Ljava/lang/Object;

    .line 1201
    .line 1202
    check-cast v0, Lokhttp3/internal/http2/Http2Connection;

    .line 1203
    .line 1204
    iget-object p0, p0, La23;->Z:Ljava/lang/Object;

    .line 1205
    .line 1206
    check-cast p0, Lea6;

    .line 1207
    .line 1208
    invoke-static {v0, p0}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c(Lokhttp3/internal/http2/Http2Connection;Lea6;)Ldn8;

    .line 1209
    .line 1210
    .line 1211
    move-result-object p0

    .line 1212
    return-object p0

    .line 1213
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
