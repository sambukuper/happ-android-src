.class public Landroidx/appcompat/app/AppCompatActivity;
.super Landroidx/fragment/app/FragmentActivity;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lip;


# instance fields
.field public E0:Lwp;


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwp;

    .line 9
    .line 10
    invoke-virtual {p0}, Lwp;->v()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lwp;->B0:Landroid/view/ViewGroup;

    .line 14
    .line 15
    const v1, 0x1020002

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lwp;->o0:Lrp;

    .line 28
    .line 29
    iget-object p0, p0, Lwp;->n0:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p1, p0}, Lrp;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lwp;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Lwp;->O0:Z

    .line 9
    .line 10
    iget v2, v0, Lwp;->S0:I

    .line 11
    .line 12
    const/16 v3, -0x64

    .line 13
    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget v2, Lmp;->Y:I

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, p1, v2}, Lwp;->B(Landroid/content/Context;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1}, Lmp;->b(Landroid/content/Context;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_7

    .line 29
    .line 30
    invoke-static {p1}, Lmp;->b(Landroid/content/Context;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v4, 0x21

    .line 40
    .line 41
    if-lt v2, v4, :cond_2

    .line 42
    .line 43
    sget-boolean v2, Lmp;->h0:Z

    .line 44
    .line 45
    if-nez v2, :cond_7

    .line 46
    .line 47
    sget-object v2, Lmp;->X:Llp;

    .line 48
    .line 49
    new-instance v4, Lkp;

    .line 50
    .line 51
    invoke-direct {v4, p1, v3}, Lkp;-><init>(Landroid/content/Context;B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v4}, Llp;->execute(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_2
    sget-object v2, Lmp;->k0:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v2

    .line 61
    :try_start_0
    sget-object v4, Lmp;->Z:Lhe4;

    .line 62
    .line 63
    if-nez v4, :cond_5

    .line 64
    .line 65
    sget-object v4, Lmp;->f0:Lhe4;

    .line 66
    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    invoke-static {p1}, Lgv3;->P(Landroid/content/Context;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {v4}, Lhe4;->a(Ljava/lang/String;)Lhe4;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    sput-object v4, Lmp;->f0:Lhe4;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception p0

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    :goto_1
    iget-object v4, v4, Lhe4;->a:Lie4;

    .line 83
    .line 84
    iget-object v4, v4, Lie4;->a:Landroid/os/LocaleList;

    .line 85
    .line 86
    invoke-virtual {v4}, Landroid/os/LocaleList;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-eqz v4, :cond_4

    .line 91
    .line 92
    monitor-exit v2

    .line 93
    goto :goto_4

    .line 94
    :cond_4
    sget-object v4, Lmp;->f0:Lhe4;

    .line 95
    .line 96
    sput-object v4, Lmp;->Z:Lhe4;

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    sget-object v5, Lmp;->f0:Lhe4;

    .line 100
    .line 101
    invoke-virtual {v4, v5}, Lhe4;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-nez v4, :cond_6

    .line 106
    .line 107
    sget-object v4, Lmp;->Z:Lhe4;

    .line 108
    .line 109
    sput-object v4, Lmp;->f0:Lhe4;

    .line 110
    .line 111
    iget-object v4, v4, Lhe4;->a:Lie4;

    .line 112
    .line 113
    iget-object v4, v4, Lie4;->a:Landroid/os/LocaleList;

    .line 114
    .line 115
    invoke-virtual {v4}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-static {p1, v4}, Lgv3;->M(Landroid/content/Context;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_6
    :goto_2
    monitor-exit v2

    .line 123
    goto :goto_4

    .line 124
    :goto_3
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    throw p0

    .line 126
    :cond_7
    :goto_4
    invoke-static {p1}, Lwp;->o(Landroid/content/Context;)Lhe4;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    instance-of v4, p1, Landroid/view/ContextThemeWrapper;

    .line 131
    .line 132
    const/4 v5, 0x0

    .line 133
    if-eqz v4, :cond_8

    .line 134
    .line 135
    invoke-static {p1, v0, v2, v5, v3}, Lwp;->s(Landroid/content/Context;ILhe4;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    :try_start_1
    move-object v6, p1

    .line 140
    check-cast v6, Landroid/view/ContextThemeWrapper;

    .line 141
    .line 142
    invoke-virtual {v6, v4}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 143
    .line 144
    .line 145
    goto/16 :goto_a

    .line 146
    .line 147
    :catch_0
    :cond_8
    instance-of v4, p1, Ln51;

    .line 148
    .line 149
    if-eqz v4, :cond_9

    .line 150
    .line 151
    invoke-static {p1, v0, v2, v5, v3}, Lwp;->s(Landroid/content/Context;ILhe4;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    :try_start_2
    move-object v4, p1

    .line 156
    check-cast v4, Ln51;

    .line 157
    .line 158
    invoke-virtual {v4, v3}, Ln51;->a(Landroid/content/res/Configuration;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    .line 159
    .line 160
    .line 161
    goto/16 :goto_a

    .line 162
    .line 163
    :catch_1
    :cond_9
    sget-boolean v3, Lwp;->j1:Z

    .line 164
    .line 165
    if-nez v3, :cond_a

    .line 166
    .line 167
    goto/16 :goto_a

    .line 168
    .line 169
    :cond_a
    new-instance v3, Landroid/content/res/Configuration;

    .line 170
    .line 171
    invoke-direct {v3}, Landroid/content/res/Configuration;-><init>()V

    .line 172
    .line 173
    .line 174
    const/4 v4, -0x1

    .line 175
    iput v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 176
    .line 177
    const/4 v4, 0x0

    .line 178
    iput v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 179
    .line 180
    invoke-virtual {p1, v3}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 201
    .line 202
    iput v7, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 203
    .line 204
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    if-nez v7, :cond_20

    .line 209
    .line 210
    new-instance v7, Landroid/content/res/Configuration;

    .line 211
    .line 212
    invoke-direct {v7}, Landroid/content/res/Configuration;-><init>()V

    .line 213
    .line 214
    .line 215
    iput v4, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 216
    .line 217
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-nez v4, :cond_b

    .line 222
    .line 223
    goto/16 :goto_5

    .line 224
    .line 225
    :cond_b
    iget v4, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 226
    .line 227
    iget v8, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 228
    .line 229
    cmpl-float v4, v4, v8

    .line 230
    .line 231
    if-eqz v4, :cond_c

    .line 232
    .line 233
    iput v8, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 234
    .line 235
    :cond_c
    iget v4, v3, Landroid/content/res/Configuration;->mcc:I

    .line 236
    .line 237
    iget v8, v6, Landroid/content/res/Configuration;->mcc:I

    .line 238
    .line 239
    if-eq v4, v8, :cond_d

    .line 240
    .line 241
    iput v8, v7, Landroid/content/res/Configuration;->mcc:I

    .line 242
    .line 243
    :cond_d
    iget v4, v3, Landroid/content/res/Configuration;->mnc:I

    .line 244
    .line 245
    iget v8, v6, Landroid/content/res/Configuration;->mnc:I

    .line 246
    .line 247
    if-eq v4, v8, :cond_e

    .line 248
    .line 249
    iput v8, v7, Landroid/content/res/Configuration;->mnc:I

    .line 250
    .line 251
    :cond_e
    invoke-virtual {v3}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    invoke-virtual {v6}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    invoke-virtual {v4, v8}, Landroid/os/LocaleList;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-nez v4, :cond_f

    .line 264
    .line 265
    invoke-virtual {v7, v8}, Landroid/content/res/Configuration;->setLocales(Landroid/os/LocaleList;)V

    .line 266
    .line 267
    .line 268
    iget-object v4, v6, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 269
    .line 270
    iput-object v4, v7, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 271
    .line 272
    :cond_f
    iget v4, v3, Landroid/content/res/Configuration;->touchscreen:I

    .line 273
    .line 274
    iget v8, v6, Landroid/content/res/Configuration;->touchscreen:I

    .line 275
    .line 276
    if-eq v4, v8, :cond_10

    .line 277
    .line 278
    iput v8, v7, Landroid/content/res/Configuration;->touchscreen:I

    .line 279
    .line 280
    :cond_10
    iget v4, v3, Landroid/content/res/Configuration;->keyboard:I

    .line 281
    .line 282
    iget v8, v6, Landroid/content/res/Configuration;->keyboard:I

    .line 283
    .line 284
    if-eq v4, v8, :cond_11

    .line 285
    .line 286
    iput v8, v7, Landroid/content/res/Configuration;->keyboard:I

    .line 287
    .line 288
    :cond_11
    iget v4, v3, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 289
    .line 290
    iget v8, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 291
    .line 292
    if-eq v4, v8, :cond_12

    .line 293
    .line 294
    iput v8, v7, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 295
    .line 296
    :cond_12
    iget v4, v3, Landroid/content/res/Configuration;->navigation:I

    .line 297
    .line 298
    iget v8, v6, Landroid/content/res/Configuration;->navigation:I

    .line 299
    .line 300
    if-eq v4, v8, :cond_13

    .line 301
    .line 302
    iput v8, v7, Landroid/content/res/Configuration;->navigation:I

    .line 303
    .line 304
    :cond_13
    iget v4, v3, Landroid/content/res/Configuration;->navigationHidden:I

    .line 305
    .line 306
    iget v8, v6, Landroid/content/res/Configuration;->navigationHidden:I

    .line 307
    .line 308
    if-eq v4, v8, :cond_14

    .line 309
    .line 310
    iput v8, v7, Landroid/content/res/Configuration;->navigationHidden:I

    .line 311
    .line 312
    :cond_14
    iget v4, v3, Landroid/content/res/Configuration;->orientation:I

    .line 313
    .line 314
    iget v8, v6, Landroid/content/res/Configuration;->orientation:I

    .line 315
    .line 316
    if-eq v4, v8, :cond_15

    .line 317
    .line 318
    iput v8, v7, Landroid/content/res/Configuration;->orientation:I

    .line 319
    .line 320
    :cond_15
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 321
    .line 322
    and-int/lit8 v4, v4, 0xf

    .line 323
    .line 324
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 325
    .line 326
    and-int/lit8 v8, v8, 0xf

    .line 327
    .line 328
    if-eq v4, v8, :cond_16

    .line 329
    .line 330
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 331
    .line 332
    or-int/2addr v4, v8

    .line 333
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 334
    .line 335
    :cond_16
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 336
    .line 337
    and-int/lit16 v4, v4, 0xc0

    .line 338
    .line 339
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 340
    .line 341
    and-int/lit16 v8, v8, 0xc0

    .line 342
    .line 343
    if-eq v4, v8, :cond_17

    .line 344
    .line 345
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 346
    .line 347
    or-int/2addr v4, v8

    .line 348
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 349
    .line 350
    :cond_17
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 351
    .line 352
    and-int/lit8 v4, v4, 0x30

    .line 353
    .line 354
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 355
    .line 356
    and-int/lit8 v8, v8, 0x30

    .line 357
    .line 358
    if-eq v4, v8, :cond_18

    .line 359
    .line 360
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 361
    .line 362
    or-int/2addr v4, v8

    .line 363
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 364
    .line 365
    :cond_18
    iget v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 366
    .line 367
    and-int/lit16 v4, v4, 0x300

    .line 368
    .line 369
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 370
    .line 371
    and-int/lit16 v8, v8, 0x300

    .line 372
    .line 373
    if-eq v4, v8, :cond_19

    .line 374
    .line 375
    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 376
    .line 377
    or-int/2addr v4, v8

    .line 378
    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 379
    .line 380
    :cond_19
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 381
    .line 382
    const/16 v8, 0x1a

    .line 383
    .line 384
    if-lt v4, v8, :cond_1a

    .line 385
    .line 386
    invoke-static {v3, v6, v7}, Lue3;->r(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    .line 387
    .line 388
    .line 389
    :cond_1a
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 390
    .line 391
    and-int/lit8 v4, v4, 0xf

    .line 392
    .line 393
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 394
    .line 395
    and-int/lit8 v8, v8, 0xf

    .line 396
    .line 397
    if-eq v4, v8, :cond_1b

    .line 398
    .line 399
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 400
    .line 401
    or-int/2addr v4, v8

    .line 402
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 403
    .line 404
    :cond_1b
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 405
    .line 406
    and-int/lit8 v4, v4, 0x30

    .line 407
    .line 408
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 409
    .line 410
    and-int/lit8 v8, v8, 0x30

    .line 411
    .line 412
    if-eq v4, v8, :cond_1c

    .line 413
    .line 414
    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 415
    .line 416
    or-int/2addr v4, v8

    .line 417
    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 418
    .line 419
    :cond_1c
    iget v4, v3, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 420
    .line 421
    iget v8, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 422
    .line 423
    if-eq v4, v8, :cond_1d

    .line 424
    .line 425
    iput v8, v7, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 426
    .line 427
    :cond_1d
    iget v4, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 428
    .line 429
    iget v8, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 430
    .line 431
    if-eq v4, v8, :cond_1e

    .line 432
    .line 433
    iput v8, v7, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 434
    .line 435
    :cond_1e
    iget v4, v3, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 436
    .line 437
    iget v8, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 438
    .line 439
    if-eq v4, v8, :cond_1f

    .line 440
    .line 441
    iput v8, v7, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 442
    .line 443
    :cond_1f
    iget v3, v3, Landroid/content/res/Configuration;->densityDpi:I

    .line 444
    .line 445
    iget v4, v6, Landroid/content/res/Configuration;->densityDpi:I

    .line 446
    .line 447
    if-eq v3, v4, :cond_21

    .line 448
    .line 449
    iput v4, v7, Landroid/content/res/Configuration;->densityDpi:I

    .line 450
    .line 451
    goto :goto_5

    .line 452
    :cond_20
    move-object v7, v5

    .line 453
    :cond_21
    :goto_5
    invoke-static {p1, v0, v2, v7, v1}, Lwp;->s(Landroid/content/Context;ILhe4;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    new-instance v2, Ln51;

    .line 458
    .line 459
    sget v3, Lq56;->Theme_AppCompat_Empty:I

    .line 460
    .line 461
    invoke-direct {v2, p1, v3}, Ln51;-><init>(Landroid/content/Context;I)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v0}, Ln51;->a(Landroid/content/res/Configuration;)V

    .line 465
    .line 466
    .line 467
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 468
    .line 469
    .line 470
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_4

    .line 471
    if-eqz p1, :cond_25

    .line 472
    .line 473
    invoke-virtual {v2}, Ln51;->getTheme()Landroid/content/res/Resources$Theme;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 478
    .line 479
    const/16 v3, 0x1d

    .line 480
    .line 481
    if-lt v0, v3, :cond_22

    .line 482
    .line 483
    invoke-static {p1}, Lwa;->z(Landroid/content/res/Resources$Theme;)V

    .line 484
    .line 485
    .line 486
    goto :goto_9

    .line 487
    :cond_22
    sget-object v0, Lyn0;->e:Ljava/lang/Object;

    .line 488
    .line 489
    monitor-enter v0

    .line 490
    :try_start_4
    sget-boolean v3, Lyn0;->g:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 491
    .line 492
    if-nez v3, :cond_23

    .line 493
    .line 494
    :try_start_5
    const-class v3, Landroid/content/res/Resources$Theme;

    .line 495
    .line 496
    const-string v4, "rebase"

    .line 497
    .line 498
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    sput-object v3, Lyn0;->f:Ljava/lang/reflect/Method;

    .line 503
    .line 504
    invoke-virtual {v3, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 505
    .line 506
    .line 507
    goto :goto_6

    .line 508
    :catchall_1
    move-exception p0

    .line 509
    goto :goto_8

    .line 510
    :catch_2
    :goto_6
    :try_start_6
    sput-boolean v1, Lyn0;->g:Z

    .line 511
    .line 512
    :cond_23
    sget-object v1, Lyn0;->f:Ljava/lang/reflect/Method;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 513
    .line 514
    if-eqz v1, :cond_24

    .line 515
    .line 516
    :try_start_7
    invoke-virtual {v1, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 517
    .line 518
    .line 519
    goto :goto_7

    .line 520
    :catch_3
    :try_start_8
    sput-object v5, Lyn0;->f:Ljava/lang/reflect/Method;

    .line 521
    .line 522
    :cond_24
    :goto_7
    monitor-exit v0

    .line 523
    goto :goto_9

    .line 524
    :goto_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 525
    throw p0

    .line 526
    :catch_4
    :cond_25
    :goto_9
    move-object p1, v2

    .line 527
    :goto_a
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 528
    .line 529
    .line 530
    return-void
.end method

.method public final closeOptionsMenu()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->q()Lu70;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lu70;->z()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->q()Lu70;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x52

    .line 10
    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lu70;->c0(Landroid/view/KeyEvent;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    invoke-super {p0, p1}, Landroidx/core/app/ComponentActivity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lwp;

    .line 6
    .line 7
    invoke-virtual {p0}, Lwp;->v()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lwp;->n0:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lwp;

    .line 6
    .line 7
    iget-object v0, p0, Lwp;->q0:Luw7;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lwp;->z()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Luw7;

    .line 15
    .line 16
    iget-object v1, p0, Lwp;->p0:Lu70;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Lu70;->U()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v1, p0, Lwp;->m0:Landroid/content/Context;

    .line 26
    .line 27
    :goto_0
    invoke-direct {v0, v1}, Luw7;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lwp;->q0:Luw7;

    .line 31
    .line 32
    :cond_1
    return-object v0
.end method

.method public final invalidateOptionsMenu()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lmp;->a()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwp;

    .line 9
    .line 10
    iget-boolean p1, p0, Lwp;->F0:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean p1, p0, Lwp;->A0:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lwp;->z()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lwp;->p0:Lu70;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Lu70;->Z()V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {}, Laq;->a()Laq;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v0, p0, Lwp;->m0:Landroid/content/Context;

    .line 33
    .line 34
    monitor-enter p1

    .line 35
    :try_start_0
    iget-object v1, p1, Laq;->a:Lrf6;

    .line 36
    .line 37
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 38
    :try_start_1
    iget-object v2, v1, Lrf6;->b:Ljava/util/WeakHashMap;

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lqi4;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, Lqi4;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 55
    monitor-exit p1

    .line 56
    new-instance p1, Landroid/content/res/Configuration;

    .line 57
    .line 58
    iget-object v0, p0, Lwp;->m0:Landroid/content/Context;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-direct {p1, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lwp;->R0:Landroid/content/res/Configuration;

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    invoke-virtual {p0, p1, p1}, Lwp;->m(ZZ)Z

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 79
    :try_start_4
    throw p0

    .line 80
    :catchall_1
    move-exception p0

    .line 81
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 82
    throw p0
.end method

.method public final onContentChanged()V
    .locals 0

    .line 1
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Lmp;->d()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, p2}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    const/4 p0, 0x1

    .line 62
    return p0

    .line 63
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 4

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/FragmentActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->q()Lu70;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    const v1, 0x102002c

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-ne p2, v1, :cond_7

    .line 23
    .line 24
    if-eqz p1, :cond_7

    .line 25
    .line 26
    invoke-virtual {p1}, Lu70;->N()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    and-int/lit8 p1, p1, 0x4

    .line 31
    .line 32
    if-eqz p1, :cond_7

    .line 33
    .line 34
    invoke-static {p0}, Lyn0;->F(Landroidx/appcompat/app/AppCompatActivity;)Landroid/content/Intent;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eqz p1, :cond_7

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_6

    .line 45
    .line 46
    new-instance p1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Lyn0;->F(Landroidx/appcompat/app/AppCompatActivity;)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    if-nez p2, :cond_1

    .line 56
    .line 57
    invoke-static {p0}, Lyn0;->F(Landroidx/appcompat/app/AppCompatActivity;)Landroid/content/Intent;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    :cond_1
    if-eqz p2, :cond_4

    .line 62
    .line 63
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-nez v1, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p2, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    :try_start_0
    invoke-static {p0, v1}, Lyn0;->G(Landroidx/appcompat/app/AppCompatActivity;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :goto_0
    if-eqz v1, :cond_3

    .line 86
    .line 87
    invoke-virtual {p1, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {p0, v1}, Lyn0;->G(Landroidx/appcompat/app/AppCompatActivity;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 95
    .line 96
    .line 97
    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    goto :goto_0

    .line 99
    :cond_3
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :catch_0
    move-exception p0

    .line 104
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 105
    .line 106
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :cond_4
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-nez p2, :cond_5

    .line 115
    .line 116
    new-array p2, v2, [Landroid/content/Intent;

    .line 117
    .line 118
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    check-cast p1, [Landroid/content/Intent;

    .line 123
    .line 124
    new-instance p2, Landroid/content/Intent;

    .line 125
    .line 126
    aget-object v1, p1, v2

    .line 127
    .line 128
    invoke-direct {p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 129
    .line 130
    .line 131
    const v1, 0x1000c000

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    aput-object p2, p1, v2

    .line 139
    .line 140
    const/4 p2, 0x0

    .line 141
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 142
    .line 143
    .line 144
    :try_start_1
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :catch_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 149
    .line 150
    .line 151
    :goto_2
    return v0

    .line 152
    :cond_5
    const-string p0, "No intents added to TaskStackBuilder; cannot startActivities"

    .line 153
    .line 154
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return v2

    .line 158
    :cond_6
    invoke-virtual {p0, p1}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z

    .line 159
    .line 160
    .line 161
    return v0

    .line 162
    :cond_7
    return v2
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwp;

    .line 9
    .line 10
    invoke-virtual {p0}, Lwp;->v()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onPostResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwp;

    .line 9
    .line 10
    invoke-virtual {p0}, Lwp;->z()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lwp;->p0:Lu70;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Lu70;->m0(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwp;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p0, v0, v1}, Lwp;->m(ZZ)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwp;

    .line 9
    .line 10
    invoke-virtual {p0}, Lwp;->z()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lwp;->p0:Lu70;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Lu70;->m0(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Lmp;->k(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final openOptionsMenu()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->q()Lu70;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lu70;->d0()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final p()Lmp;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->E0:Lwp;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lmp;->X:Llp;

    .line 6
    .line 7
    new-instance v0, Lwp;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1, p0, p0}, Lwp;-><init>(Landroid/content/Context;Landroid/view/Window;Lip;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/appcompat/app/AppCompatActivity;->E0:Lwp;

    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public final q()Lu70;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lwp;

    .line 6
    .line 7
    invoke-virtual {p0}, Lwp;->z()V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lwp;->p0:Lu70;

    .line 11
    .line 12
    return-object p0
.end method

.method public final r(Landroidx/appcompat/widget/Toolbar;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lwp;

    .line 6
    .line 7
    iget-object v0, p0, Lwp;->l0:Ljava/lang/Object;

    .line 8
    .line 9
    instance-of v1, v0, Landroid/app/Activity;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0}, Lwp;->z()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lwp;->p0:Lu70;

    .line 18
    .line 19
    instance-of v2, v1, Ls09;

    .line 20
    .line 21
    if-nez v2, :cond_4

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iput-object v2, p0, Lwp;->q0:Luw7;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Lu70;->a0()V

    .line 29
    .line 30
    .line 31
    :cond_1
    iput-object v2, p0, Lwp;->p0:Lu70;

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    new-instance v1, Lsb8;

    .line 36
    .line 37
    instance-of v2, v0, Landroid/app/Activity;

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    check-cast v0, Landroid/app/Activity;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object v0, p0, Lwp;->r0:Ljava/lang/CharSequence;

    .line 49
    .line 50
    :goto_0
    iget-object v2, p0, Lwp;->o0:Lrp;

    .line 51
    .line 52
    invoke-direct {v1, p1, v0, v2}, Lsb8;-><init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Lrp;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Lwp;->p0:Lu70;

    .line 56
    .line 57
    iget-object v0, p0, Lwp;->o0:Lrp;

    .line 58
    .line 59
    iget-object v1, v1, Lsb8;->i:Lqb8;

    .line 60
    .line 61
    iput-object v1, v0, Lrp;->Y:Lqb8;

    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setBackInvokedCallbackEnabled(Z)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    iget-object p1, p0, Lwp;->o0:Lrp;

    .line 69
    .line 70
    iput-object v2, p1, Lrp;->Y:Lqb8;

    .line 71
    .line 72
    :goto_1
    invoke-virtual {p0}, Lwp;->a()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_4
    const-string p0, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    .line 77
    .line 78
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final setContentView(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Lmp;->g(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 12
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->k()V

    .line 13
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    move-result-object p0

    invoke-virtual {p0, p1}, Lmp;->h(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 14
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->k()V

    .line 15
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lmp;->i(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/content/Context;->setTheme(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->p()Lmp;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lwp;

    .line 9
    .line 10
    iput p1, p0, Lwp;->T0:I

    .line 11
    .line 12
    return-void
.end method
