.class public final Ldo7;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:B

.field public synthetic h0:Ljava/lang/Object;

.field public final synthetic i0:Lky2;

.field public final synthetic j0:Landroid/content/Context;

.field public final synthetic k0:Lgn2;

.field public final synthetic l0:Lfn6;

.field public final synthetic m0:Lgn2;

.field public final synthetic n0:Lo87;

.field public final synthetic o0:Landroid/app/Activity;

.field public final synthetic p0:Lgn2;

.field public final synthetic q0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lky2;Landroid/content/Context;Lgn2;Lfn6;Lgn2;Lo87;Landroid/app/Activity;Lgn2;Ljava/lang/String;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldo7;->i0:Lky2;

    .line 2
    .line 3
    iput-object p2, p0, Ldo7;->j0:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Ldo7;->k0:Lgn2;

    .line 6
    .line 7
    iput-object p4, p0, Ldo7;->l0:Lfn6;

    .line 8
    .line 9
    iput-object p5, p0, Ldo7;->m0:Lgn2;

    .line 10
    .line 11
    iput-object p6, p0, Ldo7;->n0:Lo87;

    .line 12
    .line 13
    iput-object p7, p0, Ldo7;->o0:Landroid/app/Activity;

    .line 14
    .line 15
    iput-object p8, p0, Ldo7;->p0:Lgn2;

    .line 16
    .line 17
    iput-object p9, p0, Ldo7;->q0:Ljava/lang/String;

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1, p10}, Luy7;-><init>(ILq51;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lco7;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Ldo7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ldo7;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ldo7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 11

    .line 1
    new-instance v0, Ldo7;

    .line 2
    .line 3
    iget-object v8, p0, Ldo7;->p0:Lgn2;

    .line 4
    .line 5
    iget-object v9, p0, Ldo7;->q0:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, Ldo7;->i0:Lky2;

    .line 8
    .line 9
    iget-object v2, p0, Ldo7;->j0:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v3, p0, Ldo7;->k0:Lgn2;

    .line 12
    .line 13
    iget-object v4, p0, Ldo7;->l0:Lfn6;

    .line 14
    .line 15
    iget-object v5, p0, Ldo7;->m0:Lgn2;

    .line 16
    .line 17
    iget-object v6, p0, Ldo7;->n0:Lo87;

    .line 18
    .line 19
    iget-object v7, p0, Ldo7;->o0:Landroid/app/Activity;

    .line 20
    .line 21
    move-object v10, p1

    .line 22
    invoke-direct/range {v0 .. v10}, Ldo7;-><init>(Lky2;Landroid/content/Context;Lgn2;Lfn6;Lgn2;Lo87;Landroid/app/Activity;Lgn2;Ljava/lang/String;Lq51;)V

    .line 23
    .line 24
    .line 25
    iput-object p2, v0, Ldo7;->h0:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Ldo7;->h0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lco7;

    .line 4
    .line 5
    iget-byte v1, p0, Ldo7;->g0:B

    .line 6
    .line 7
    iget-object v2, p0, Ldo7;->m0:Lgn2;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v3

    .line 19
    :pswitch_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    :pswitch_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :pswitch_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    instance-of p1, v0, Lwn7;

    .line 33
    .line 34
    sget-object v1, Lmy2;->Y:Lmy2;

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    iget-object v5, p0, Ldo7;->i0:Lky2;

    .line 38
    .line 39
    iget-object v6, p0, Ldo7;->j0:Landroid/content/Context;

    .line 40
    .line 41
    sget-object v7, Lc71;->X:Lc71;

    .line 42
    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    new-instance p1, Lby2;

    .line 46
    .line 47
    sget v0, Ly46;->toast_failure:I

    .line 48
    .line 49
    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, v0, v1}, Lby2;-><init>(Ljava/lang/String;Lmy2;)V

    .line 57
    .line 58
    .line 59
    iput-object v3, p0, Ldo7;->h0:Ljava/lang/Object;

    .line 60
    .line 61
    iput-byte v4, p0, Ldo7;->g0:B

    .line 62
    .line 63
    invoke-virtual {v5, p1, p0}, Lky2;->c(Lby2;Lq51;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-ne p0, v7, :cond_b

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_0
    instance-of p1, v0, Lxn7;

    .line 72
    .line 73
    if-eqz p1, :cond_1

    .line 74
    .line 75
    new-instance p1, Lby2;

    .line 76
    .line 77
    sget v0, Ly46;->routing_export_profile_failure_not_select:I

    .line 78
    .line 79
    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, v0, v1}, Lby2;-><init>(Ljava/lang/String;Lmy2;)V

    .line 87
    .line 88
    .line 89
    iput-object v3, p0, Ldo7;->h0:Ljava/lang/Object;

    .line 90
    .line 91
    const/4 v0, 0x2

    .line 92
    iput-byte v0, p0, Ldo7;->g0:B

    .line 93
    .line 94
    invoke-virtual {v5, p1, p0}, Lky2;->c(Lby2;Lq51;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    if-ne p0, v7, :cond_b

    .line 99
    .line 100
    goto/16 :goto_1

    .line 101
    .line 102
    :cond_1
    instance-of p1, v0, Lyn7;

    .line 103
    .line 104
    if-eqz p1, :cond_2

    .line 105
    .line 106
    sget-object p1, Lss8;->a:Lss8;

    .line 107
    .line 108
    check-cast v0, Lyn7;

    .line 109
    .line 110
    iget-object p1, v0, Lyn7;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v6, p1}, Lss8;->E(Landroid/content/Context;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    new-instance p1, Lby2;

    .line 116
    .line 117
    sget v0, Ly46;->toast_success:I

    .line 118
    .line 119
    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    sget-object v1, Lmy2;->X:Lmy2;

    .line 127
    .line 128
    invoke-direct {p1, v0, v1}, Lby2;-><init>(Ljava/lang/String;Lmy2;)V

    .line 129
    .line 130
    .line 131
    iput-object v3, p0, Ldo7;->h0:Ljava/lang/Object;

    .line 132
    .line 133
    const/4 v0, 0x3

    .line 134
    iput-byte v0, p0, Ldo7;->g0:B

    .line 135
    .line 136
    invoke-virtual {v5, p1, p0}, Lky2;->c(Lby2;Lq51;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    if-ne p0, v7, :cond_b

    .line 141
    .line 142
    goto/16 :goto_1

    .line 143
    .line 144
    :cond_2
    instance-of p1, v0, Lao7;

    .line 145
    .line 146
    sget-object v8, Lmy2;->Z:Lmy2;

    .line 147
    .line 148
    if-eqz p1, :cond_3

    .line 149
    .line 150
    new-instance p1, Lby2;

    .line 151
    .line 152
    sget v0, Ly46;->routing_settings_warning_empty_profiles:I

    .line 153
    .line 154
    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-direct {p1, v0, v8}, Lby2;-><init>(Ljava/lang/String;Lmy2;)V

    .line 162
    .line 163
    .line 164
    iput-object v3, p0, Ldo7;->h0:Ljava/lang/Object;

    .line 165
    .line 166
    const/4 v0, 0x4

    .line 167
    iput-byte v0, p0, Ldo7;->g0:B

    .line 168
    .line 169
    invoke-virtual {v5, p1, p0}, Lky2;->c(Lby2;Lq51;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    if-ne p0, v7, :cond_b

    .line 174
    .line 175
    goto/16 :goto_1

    .line 176
    .line 177
    :cond_3
    instance-of p1, v0, Lun7;

    .line 178
    .line 179
    if-eqz p1, :cond_4

    .line 180
    .line 181
    new-instance p1, Lby2;

    .line 182
    .line 183
    sget v0, Ly46;->routing_settings_profile_name_empty:I

    .line 184
    .line 185
    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-direct {p1, v0, v1}, Lby2;-><init>(Ljava/lang/String;Lmy2;)V

    .line 193
    .line 194
    .line 195
    iput-object v3, p0, Ldo7;->h0:Ljava/lang/Object;

    .line 196
    .line 197
    const/4 v0, 0x5

    .line 198
    iput-byte v0, p0, Ldo7;->g0:B

    .line 199
    .line 200
    invoke-virtual {v5, p1, p0}, Lky2;->c(Lby2;Lq51;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    if-ne p0, v7, :cond_b

    .line 205
    .line 206
    goto/16 :goto_1

    .line 207
    .line 208
    :cond_4
    instance-of p1, v0, Lvn7;

    .line 209
    .line 210
    if-eqz p1, :cond_5

    .line 211
    .line 212
    new-instance p1, Lby2;

    .line 213
    .line 214
    sget v0, Ly46;->routing_import_profile_main_error:I

    .line 215
    .line 216
    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-direct {p1, v0, v1}, Lby2;-><init>(Ljava/lang/String;Lmy2;)V

    .line 224
    .line 225
    .line 226
    iput-object v3, p0, Ldo7;->h0:Ljava/lang/Object;

    .line 227
    .line 228
    const/4 v0, 0x6

    .line 229
    iput-byte v0, p0, Ldo7;->g0:B

    .line 230
    .line 231
    invoke-virtual {v5, p1, p0}, Lky2;->c(Lby2;Lq51;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    if-ne p0, v7, :cond_b

    .line 236
    .line 237
    goto/16 :goto_1

    .line 238
    .line 239
    :cond_5
    instance-of p1, v0, Ltn7;

    .line 240
    .line 241
    if-eqz p1, :cond_6

    .line 242
    .line 243
    check-cast v0, Ltn7;

    .line 244
    .line 245
    iget-object v6, v0, Ltn7;->a:Ljava/lang/String;

    .line 246
    .line 247
    iget-object v7, v0, Ltn7;->b:Ljava/lang/String;

    .line 248
    .line 249
    iget-boolean v8, v0, Ltn7;->c:Z

    .line 250
    .line 251
    iget-object v10, v0, Ltn7;->d:Ljava/lang/String;

    .line 252
    .line 253
    iget-object v9, v0, Ltn7;->e:Ljava/lang/String;

    .line 254
    .line 255
    new-instance v5, Ldw5;

    .line 256
    .line 257
    iget-object v11, p0, Ldo7;->l0:Lfn6;

    .line 258
    .line 259
    invoke-direct/range {v5 .. v11}, Ldw5;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lfn6;)V

    .line 260
    .line 261
    .line 262
    iget-object p0, p0, Ldo7;->k0:Lgn2;

    .line 263
    .line 264
    invoke-interface {p0, v5}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    new-instance p0, Lyo7;

    .line 268
    .line 269
    invoke-direct {p0, v4}, Lyo7;-><init>(Z)V

    .line 270
    .line 271
    .line 272
    invoke-interface {v2, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    goto :goto_2

    .line 276
    :cond_6
    instance-of p1, v0, Lrn7;

    .line 277
    .line 278
    if-eqz p1, :cond_8

    .line 279
    .line 280
    iput-object v3, p0, Ldo7;->h0:Ljava/lang/Object;

    .line 281
    .line 282
    const/4 p1, 0x7

    .line 283
    iput-byte p1, p0, Ldo7;->g0:B

    .line 284
    .line 285
    iget-object p1, p0, Ldo7;->n0:Lo87;

    .line 286
    .line 287
    invoke-virtual {p1, p0}, Lo87;->c(Luy7;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    if-ne p0, v7, :cond_7

    .line 292
    .line 293
    goto :goto_1

    .line 294
    :cond_7
    :goto_0
    sget-object p0, Lio7;->a:Lio7;

    .line 295
    .line 296
    invoke-interface {v2, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    goto :goto_2

    .line 300
    :cond_8
    instance-of p1, v0, Lzn7;

    .line 301
    .line 302
    if-eqz p1, :cond_9

    .line 303
    .line 304
    iget-object p0, p0, Ldo7;->o0:Landroid/app/Activity;

    .line 305
    .line 306
    if-eqz p0, :cond_b

    .line 307
    .line 308
    new-instance p1, Landroid/content/Intent;

    .line 309
    .line 310
    const-class v1, Lsu/happ/proxyutility/feature/routing/rules/RoutingRulesActivity;

    .line 311
    .line 312
    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 313
    .line 314
    .line 315
    check-cast v0, Lzn7;

    .line 316
    .line 317
    iget-object v0, v0, Lzn7;->a:Ljava/lang/String;

    .line 318
    .line 319
    const-string v1, "profileId"

    .line 320
    .line 321
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 322
    .line 323
    .line 324
    move-result-object p1

    .line 325
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 326
    .line 327
    .line 328
    goto :goto_2

    .line 329
    :cond_9
    instance-of p1, v0, Lbo7;

    .line 330
    .line 331
    if-eqz p1, :cond_a

    .line 332
    .line 333
    new-instance p1, Lby2;

    .line 334
    .line 335
    sget v0, Ly46;->warning_settings_after_tunnel_restart:I

    .line 336
    .line 337
    invoke-virtual {v6, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    invoke-direct {p1, v0, v8}, Lby2;-><init>(Ljava/lang/String;Lmy2;)V

    .line 345
    .line 346
    .line 347
    iput-object v3, p0, Ldo7;->h0:Ljava/lang/Object;

    .line 348
    .line 349
    const/16 v0, 0x8

    .line 350
    .line 351
    iput-byte v0, p0, Ldo7;->g0:B

    .line 352
    .line 353
    invoke-virtual {v5, p1, p0}, Lky2;->c(Lby2;Lq51;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    if-ne p0, v7, :cond_b

    .line 358
    .line 359
    :goto_1
    return-object v7

    .line 360
    :cond_a
    sget-object p1, Lsn7;->a:Lsn7;

    .line 361
    .line 362
    invoke-static {v0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    if-eqz p1, :cond_c

    .line 367
    .line 368
    new-instance p1, Lrv5;

    .line 369
    .line 370
    iget-object v0, p0, Ldo7;->q0:Ljava/lang/String;

    .line 371
    .line 372
    iget-object v1, p0, Ldo7;->l0:Lfn6;

    .line 373
    .line 374
    invoke-direct {p1, v0, v1}, Lrv5;-><init>(Ljava/lang/String;Lfn6;)V

    .line 375
    .line 376
    .line 377
    iget-object p0, p0, Ldo7;->p0:Lgn2;

    .line 378
    .line 379
    invoke-interface {p0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    :cond_b
    :goto_2
    sget-object p0, Ldn8;->a:Ldn8;

    .line 383
    .line 384
    return-object p0

    .line 385
    :cond_c
    invoke-static {}, Lb61;->c()V

    .line 386
    .line 387
    .line 388
    return-object v3

    .line 389
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
