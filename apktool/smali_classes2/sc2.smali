.class public final Lsc2;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Lhd6;

.field public final synthetic i0:Lkd6;

.field public final synthetic j0:Ltc2;

.field public final synthetic k0:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lhd6;Lkd6;Ltc2;Landroid/content/Context;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsc2;->h0:Lhd6;

    .line 2
    .line 3
    iput-object p2, p0, Lsc2;->i0:Lkd6;

    .line 4
    .line 5
    iput-object p3, p0, Lsc2;->j0:Ltc2;

    .line 6
    .line 7
    iput-object p4, p0, Lsc2;->k0:Landroid/content/Context;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lsc2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lsc2;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lsc2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 6

    .line 1
    new-instance v0, Lsc2;

    .line 2
    .line 3
    iget-object v3, p0, Lsc2;->j0:Ltc2;

    .line 4
    .line 5
    iget-object v4, p0, Lsc2;->k0:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v1, p0, Lsc2;->h0:Lhd6;

    .line 8
    .line 9
    iget-object v2, p0, Lsc2;->i0:Lkd6;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lsc2;-><init>(Lhd6;Lkd6;Ltc2;Landroid/content/Context;Lq51;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, v0, Lsc2;->g0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, ""

    .line 4
    .line 5
    iget-object v4, v1, Lsc2;->j0:Ltc2;

    .line 6
    .line 7
    iget-object v9, v4, Ltc2;->b:Lvz7;

    .line 8
    .line 9
    iget-object v0, v1, Lsc2;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v10, v0

    .line 12
    check-cast v10, Lb71;

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object v3, v1, Lsc2;->h0:Lhd6;

    .line 18
    .line 19
    :try_start_0
    sget-object v0, Lvm3;->d:Lum3;

    .line 20
    .line 21
    invoke-virtual {v3}, Lhd6;->c()Ljava/util/HashMap;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    const-string v6, "data-locale"

    .line 26
    .line 27
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, Ljava/lang/String;

    .line 32
    .line 33
    if-nez v5, :cond_0

    .line 34
    .line 35
    move-object v5, v2

    .line 36
    :cond_0
    iget-object v6, v0, Lvm3;->b:Lg55;

    .line 37
    .line 38
    sget-object v6, Lda1;->Companion:Lca1;

    .line 39
    .line 40
    invoke-virtual {v6}, Lca1;->serializer()Low3;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    check-cast v6, Low3;

    .line 45
    .line 46
    invoke-virtual {v0, v6, v5}, Lvm3;->a(Low3;Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lda1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    instance-of v5, v0, Ljava/lang/InterruptedException;

    .line 55
    .line 56
    if-nez v5, :cond_8

    .line 57
    .line 58
    instance-of v5, v0, Ljava/util/concurrent/CancellationException;

    .line 59
    .line 60
    if-nez v5, :cond_8

    .line 61
    .line 62
    new-instance v5, Lrj6;

    .line 63
    .line 64
    invoke-direct {v5, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    move-object v0, v5

    .line 68
    :goto_0
    nop

    .line 69
    instance-of v5, v0, Lrj6;

    .line 70
    .line 71
    const/4 v7, 0x0

    .line 72
    if-eqz v5, :cond_1

    .line 73
    .line 74
    move-object v0, v7

    .line 75
    :cond_1
    move-object v13, v0

    .line 76
    check-cast v13, Lda1;

    .line 77
    .line 78
    sget-object v0, Ldn8;->a:Ldn8;

    .line 79
    .line 80
    if-nez v13, :cond_2

    .line 81
    .line 82
    goto/16 :goto_3

    .line 83
    .line 84
    :cond_2
    invoke-virtual {v3}, Lhd6;->c()Ljava/util/HashMap;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    const-string v6, "remote-push-id"

    .line 89
    .line 90
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    move-object v12, v5

    .line 95
    check-cast v12, Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v12, :cond_7

    .line 98
    .line 99
    invoke-virtual {v3}, Lhd6;->c()Ljava/util/HashMap;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    const-string v6, "expire"

    .line 104
    .line 105
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    check-cast v5, Ljava/lang/String;

    .line 110
    .line 111
    if-eqz v5, :cond_7

    .line 112
    .line 113
    invoke-static {v5}, Lmm7;->c0(Ljava/lang/String;)Ljava/lang/Long;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    if-eqz v5, :cond_7

    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 120
    .line 121
    .line 122
    move-result-wide v14

    .line 123
    invoke-virtual {v3}, Lhd6;->c()Ljava/util/HashMap;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    const-string v5, "background-image"

    .line 128
    .line 129
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    move-object/from16 v16, v3

    .line 134
    .line 135
    check-cast v16, Ljava/lang/String;

    .line 136
    .line 137
    const/4 v11, 0x3

    .line 138
    iget-object v5, v1, Lsc2;->k0:Landroid/content/Context;

    .line 139
    .line 140
    if-eqz v16, :cond_3

    .line 141
    .line 142
    new-instance v3, Lr0;

    .line 143
    .line 144
    const/16 v8, 0x14

    .line 145
    .line 146
    move-object/from16 v6, v16

    .line 147
    .line 148
    invoke-direct/range {v3 .. v8}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 149
    .line 150
    .line 151
    invoke-static {v10, v7, v3, v11}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 152
    .line 153
    .line 154
    :cond_3
    move v3, v11

    .line 155
    new-instance v11, Lld6;

    .line 156
    .line 157
    const/16 v18, 0x0

    .line 158
    .line 159
    iget-object v1, v1, Lsc2;->i0:Lkd6;

    .line 160
    .line 161
    move-object/from16 v17, v1

    .line 162
    .line 163
    invoke-direct/range {v11 .. v18}, Lld6;-><init>(Ljava/lang/String;Lda1;JLjava/lang/String;Lkd6;Z)V

    .line 164
    .line 165
    .line 166
    new-instance v6, Lq0;

    .line 167
    .line 168
    const/16 v8, 0x18

    .line 169
    .line 170
    invoke-direct {v6, v4, v11, v7, v8}, Lq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 171
    .line 172
    .line 173
    invoke-static {v10, v7, v6, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 174
    .line 175
    .line 176
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 177
    .line 178
    const/16 v6, 0x1a

    .line 179
    .line 180
    const-string v7, "happ_push_notification"

    .line 181
    .line 182
    if-lt v3, v6, :cond_4

    .line 183
    .line 184
    invoke-virtual {v9}, Lvz7;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    check-cast v3, Landroid/app/NotificationManager;

    .line 189
    .line 190
    invoke-static {}, Ldn;->e()V

    .line 191
    .line 192
    .line 193
    new-instance v6, Landroid/app/NotificationChannel;

    .line 194
    .line 195
    const-string v8, "Happ Push Notifications"

    .line 196
    .line 197
    const/4 v10, 0x4

    .line 198
    invoke-direct {v6, v7, v8, v10}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v6}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 202
    .line 203
    .line 204
    :cond_4
    new-instance v3, Landroid/content/Intent;

    .line 205
    .line 206
    const-class v6, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 207
    .line 208
    invoke-direct {v3, v5, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 209
    .line 210
    .line 211
    const v6, 0x10008000

    .line 212
    .line 213
    .line 214
    invoke-virtual {v3, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    const-string v6, "show_stories"

    .line 219
    .line 220
    const/4 v8, 0x1

    .line 221
    invoke-virtual {v3, v6, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    sget-object v6, Lkd6;->Y:Lkd6;

    .line 226
    .line 227
    const/4 v10, 0x0

    .line 228
    if-ne v1, v6, :cond_5

    .line 229
    .line 230
    move v1, v8

    .line 231
    goto :goto_1

    .line 232
    :cond_5
    move v1, v10

    .line 233
    :goto_1
    const-string v6, "show_stories_force"

    .line 234
    .line 235
    invoke-virtual {v3, v6, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    const/16 v3, 0x64

    .line 240
    .line 241
    const/high16 v6, 0xc000000

    .line 242
    .line 243
    invoke-static {v5, v3, v1, v6}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-virtual {v13}, Lda1;->c()Lga1;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    iget-object v6, v3, Lga1;->X:Ljava/lang/String;

    .line 252
    .line 253
    if-nez v6, :cond_6

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_6
    move-object v2, v6

    .line 257
    :goto_2
    const/16 v6, 0x3f

    .line 258
    .line 259
    invoke-static {v2, v6}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    iget-object v11, v3, Lga1;->Y:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-static {v11, v6}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object v4, v4, Ltc2;->c:Lvz7;

    .line 279
    .line 280
    invoke-virtual {v4}, Lvz7;->getValue()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    check-cast v4, Lkf4;

    .line 285
    .line 286
    new-instance v11, Lrc2;

    .line 287
    .line 288
    invoke-direct {v11, v3, v14, v15, v10}, Lrc2;-><init>(Ljava/lang/Object;JB)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v4, v11}, Lkf4;->g(Lgn2;)V

    .line 292
    .line 293
    .line 294
    new-instance v3, Lr65;

    .line 295
    .line 296
    invoke-direct {v3, v5, v7}, Lr65;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    sget v4, Lq36;->ic_stat_name:I

    .line 300
    .line 301
    iget-object v5, v3, Lr65;->v:Landroid/app/Notification;

    .line 302
    .line 303
    iput v4, v5, Landroid/app/Notification;->icon:I

    .line 304
    .line 305
    const/4 v4, 0x2

    .line 306
    iput v4, v3, Lr65;->j:I

    .line 307
    .line 308
    new-instance v5, Lq65;

    .line 309
    .line 310
    invoke-direct {v5}, Ls65;-><init>()V

    .line 311
    .line 312
    .line 313
    invoke-static {v2}, Lr65;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    iput-object v7, v5, Ls65;->c:Ljava/lang/Object;

    .line 318
    .line 319
    invoke-static {v2}, Lr65;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    iput-object v2, v5, Ls65;->d:Ljava/lang/Object;

    .line 324
    .line 325
    iput-boolean v8, v5, Ls65;->a:Z

    .line 326
    .line 327
    invoke-static {v6}, Lr65;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    iput-object v2, v5, Lq65;->e:Ljava/lang/CharSequence;

    .line 332
    .line 333
    invoke-virtual {v3, v5}, Lr65;->f(Ls65;)V

    .line 334
    .line 335
    .line 336
    iput-object v1, v3, Lr65;->g:Landroid/app/PendingIntent;

    .line 337
    .line 338
    const/16 v1, 0x10

    .line 339
    .line 340
    invoke-virtual {v3, v1, v8}, Lr65;->d(IZ)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v9}, Lvz7;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    check-cast v1, Landroid/app/NotificationManager;

    .line 348
    .line 349
    invoke-virtual {v3}, Lr65;->b()Landroid/app/Notification;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-virtual {v1, v4, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 354
    .line 355
    .line 356
    :cond_7
    :goto_3
    return-object v0

    .line 357
    :cond_8
    throw v0
.end method
