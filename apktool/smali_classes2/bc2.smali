.class public final Lbc2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lze2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lze2;

.field public final synthetic Z:Lqc2;


# direct methods
.method public synthetic constructor <init>(Lze2;Lqc2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lbc2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lbc2;->Y:Lze2;

    .line 4
    .line 5
    iput-object p2, p0, Lbc2;->Z:Lqc2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, Lbc2;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lbc2;->Z:Lqc2;

    .line 6
    .line 7
    iget-object v3, p0, Lbc2;->Y:Lze2;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    sget-object v5, Lc71;->X:Lc71;

    .line 12
    .line 13
    const/high16 v6, -0x80000000

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    instance-of v0, p2, Lkc2;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move-object v0, p2

    .line 25
    check-cast v0, Lkc2;

    .line 26
    .line 27
    iget v9, v0, Lkc2;->g0:I

    .line 28
    .line 29
    and-int v10, v9, v6

    .line 30
    .line 31
    if-eqz v10, :cond_0

    .line 32
    .line 33
    sub-int/2addr v9, v6

    .line 34
    iput v9, v0, Lkc2;->g0:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v0, Lkc2;

    .line 38
    .line 39
    invoke-direct {v0, p0, p2}, Lkc2;-><init>(Lbc2;Lq51;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object p0, v0, Lkc2;->f0:Ljava/lang/Object;

    .line 43
    .line 44
    iget p2, v0, Lkc2;->g0:I

    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    if-ne p2, v7, :cond_1

    .line 49
    .line 50
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    move-object v1, v8

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    check-cast p1, Lo05;

    .line 63
    .line 64
    iget-object p0, v2, Lqc2;->e:Ljs5;

    .line 65
    .line 66
    invoke-virtual {p1, p0}, Lo05;->c(Ljs5;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    iput v7, v0, Lkc2;->g0:I

    .line 71
    .line 72
    invoke-interface {v3, p0, v0}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-ne p0, v5, :cond_3

    .line 77
    .line 78
    move-object v1, v5

    .line 79
    :cond_3
    :goto_1
    return-object v1

    .line 80
    :pswitch_0
    instance-of v0, p2, Lic2;

    .line 81
    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    move-object v0, p2

    .line 85
    check-cast v0, Lic2;

    .line 86
    .line 87
    iget v9, v0, Lic2;->g0:I

    .line 88
    .line 89
    and-int v10, v9, v6

    .line 90
    .line 91
    if-eqz v10, :cond_4

    .line 92
    .line 93
    sub-int/2addr v9, v6

    .line 94
    iput v9, v0, Lic2;->g0:I

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    new-instance v0, Lic2;

    .line 98
    .line 99
    invoke-direct {v0, p0, p2}, Lic2;-><init>(Lbc2;Lq51;)V

    .line 100
    .line 101
    .line 102
    :goto_2
    iget-object p0, v0, Lic2;->f0:Ljava/lang/Object;

    .line 103
    .line 104
    iget p2, v0, Lic2;->g0:I

    .line 105
    .line 106
    if-eqz p2, :cond_6

    .line 107
    .line 108
    if-ne p2, v7, :cond_5

    .line 109
    .line 110
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    move-object v1, v8

    .line 118
    goto :goto_3

    .line 119
    :cond_6
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    check-cast p1, Lo05;

    .line 123
    .line 124
    iget-object p0, v2, Lqc2;->d:Ljs5;

    .line 125
    .line 126
    invoke-virtual {p1, p0}, Lo05;->c(Ljs5;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    iput v7, v0, Lic2;->g0:I

    .line 131
    .line 132
    invoke-interface {v3, p0, v0}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    if-ne p0, v5, :cond_7

    .line 137
    .line 138
    move-object v1, v5

    .line 139
    :cond_7
    :goto_3
    return-object v1

    .line 140
    :pswitch_1
    instance-of v0, p2, Lgc2;

    .line 141
    .line 142
    if-eqz v0, :cond_8

    .line 143
    .line 144
    move-object v0, p2

    .line 145
    check-cast v0, Lgc2;

    .line 146
    .line 147
    iget v9, v0, Lgc2;->g0:I

    .line 148
    .line 149
    and-int v10, v9, v6

    .line 150
    .line 151
    if-eqz v10, :cond_8

    .line 152
    .line 153
    sub-int/2addr v9, v6

    .line 154
    iput v9, v0, Lgc2;->g0:I

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_8
    new-instance v0, Lgc2;

    .line 158
    .line 159
    invoke-direct {v0, p0, p2}, Lgc2;-><init>(Lbc2;Lq51;)V

    .line 160
    .line 161
    .line 162
    :goto_4
    iget-object p0, v0, Lgc2;->f0:Ljava/lang/Object;

    .line 163
    .line 164
    iget p2, v0, Lgc2;->g0:I

    .line 165
    .line 166
    if-eqz p2, :cond_a

    .line 167
    .line 168
    if-ne p2, v7, :cond_9

    .line 169
    .line 170
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_9
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    move-object v1, v8

    .line 178
    goto :goto_5

    .line 179
    :cond_a
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    check-cast p1, Lo05;

    .line 183
    .line 184
    iget-object p0, v2, Lqc2;->c:Ljs5;

    .line 185
    .line 186
    invoke-virtual {p1, p0}, Lo05;->c(Ljs5;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    iput v7, v0, Lgc2;->g0:I

    .line 191
    .line 192
    invoke-interface {v3, p0, v0}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    if-ne p0, v5, :cond_b

    .line 197
    .line 198
    move-object v1, v5

    .line 199
    :cond_b
    :goto_5
    return-object v1

    .line 200
    :pswitch_2
    instance-of v0, p2, Lac2;

    .line 201
    .line 202
    if-eqz v0, :cond_c

    .line 203
    .line 204
    move-object v0, p2

    .line 205
    check-cast v0, Lac2;

    .line 206
    .line 207
    iget v9, v0, Lac2;->g0:I

    .line 208
    .line 209
    and-int v10, v9, v6

    .line 210
    .line 211
    if-eqz v10, :cond_c

    .line 212
    .line 213
    sub-int/2addr v9, v6

    .line 214
    iput v9, v0, Lac2;->g0:I

    .line 215
    .line 216
    goto :goto_6

    .line 217
    :cond_c
    new-instance v0, Lac2;

    .line 218
    .line 219
    invoke-direct {v0, p0, p2}, Lac2;-><init>(Lbc2;Lq51;)V

    .line 220
    .line 221
    .line 222
    :goto_6
    iget-object p0, v0, Lac2;->f0:Ljava/lang/Object;

    .line 223
    .line 224
    iget p2, v0, Lac2;->g0:I

    .line 225
    .line 226
    if-eqz p2, :cond_e

    .line 227
    .line 228
    if-ne p2, v7, :cond_d

    .line 229
    .line 230
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    goto :goto_9

    .line 234
    :cond_d
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    move-object v1, v8

    .line 238
    goto :goto_9

    .line 239
    :cond_e
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    check-cast p1, Lo05;

    .line 243
    .line 244
    iget-object p0, v2, Lqc2;->b:Ljs5;

    .line 245
    .line 246
    invoke-virtual {p1, p0}, Lo05;->c(Ljs5;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    check-cast p0, Ljava/util/Set;

    .line 251
    .line 252
    if-nez p0, :cond_f

    .line 253
    .line 254
    sget-object p0, Lm02;->X:Lm02;

    .line 255
    .line 256
    :cond_f
    check-cast p0, Ljava/lang/Iterable;

    .line 257
    .line 258
    new-instance p1, Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 261
    .line 262
    .line 263
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    :cond_10
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result p2

    .line 271
    if-eqz p2, :cond_13

    .line 272
    .line 273
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p2

    .line 277
    check-cast p2, Ljava/lang/String;

    .line 278
    .line 279
    :try_start_0
    sget-object v2, Lvm3;->d:Lum3;

    .line 280
    .line 281
    iget-object v4, v2, Lvm3;->b:Lg55;

    .line 282
    .line 283
    sget-object v4, Lld6;->Companion:Ljd6;

    .line 284
    .line 285
    invoke-virtual {v4}, Ljd6;->serializer()Low3;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    check-cast v4, Low3;

    .line 290
    .line 291
    invoke-virtual {v2, v4, p2}, Lvm3;->a(Low3;Ljava/lang/String;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object p2

    .line 295
    check-cast p2, Lld6;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 296
    .line 297
    goto :goto_8

    .line 298
    :catchall_0
    move-exception p2

    .line 299
    instance-of v2, p2, Ljava/lang/InterruptedException;

    .line 300
    .line 301
    if-nez v2, :cond_12

    .line 302
    .line 303
    instance-of v2, p2, Ljava/util/concurrent/CancellationException;

    .line 304
    .line 305
    if-nez v2, :cond_12

    .line 306
    .line 307
    new-instance v2, Lrj6;

    .line 308
    .line 309
    invoke-direct {v2, p2}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 310
    .line 311
    .line 312
    move-object p2, v2

    .line 313
    :goto_8
    nop

    .line 314
    instance-of v2, p2, Lrj6;

    .line 315
    .line 316
    if-eqz v2, :cond_11

    .line 317
    .line 318
    move-object p2, v8

    .line 319
    :cond_11
    check-cast p2, Lld6;

    .line 320
    .line 321
    if-eqz p2, :cond_10

    .line 322
    .line 323
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_12
    throw p2

    .line 328
    :cond_13
    iput v7, v0, Lac2;->g0:I

    .line 329
    .line 330
    invoke-interface {v3, p1, v0}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    if-ne p0, v5, :cond_14

    .line 335
    .line 336
    move-object v1, v5

    .line 337
    :cond_14
    :goto_9
    return-object v1

    .line 338
    nop

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
