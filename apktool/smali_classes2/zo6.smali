.class public final Lzo6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lzo6;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lzo6;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, Lzo6;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lzo6;->Y:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    check-cast p0, Landroid/net/Uri;

    .line 16
    .line 17
    const-string v0, "fm"

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-static {p0, v0, p1, v1}, Lrp7;->c(Landroid/net/Uri;Ljava/lang/String;II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p0, Lt14;

    .line 26
    .line 27
    check-cast p1, Lvx4;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_1
    check-cast p0, Lxd6;

    .line 34
    .line 35
    check-cast p1, Lmi8;

    .line 36
    .line 37
    iget-object v0, p1, Lmi8;->a:Lhi8;

    .line 38
    .line 39
    iget-object v2, p1, Lmi8;->b:Lnl3;

    .line 40
    .line 41
    iget-object p1, v2, Lnl3;->e:Ljava/util/Set;

    .line 42
    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    invoke-interface {v0}, Lhi8;->a()Lhi8;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {p1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    invoke-virtual {p0, v2}, Lxd6;->p(Lnl3;)Lmo8;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :cond_0
    invoke-interface {v0}, Lot0;->X()Laa7;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 69
    .line 70
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-static {v3, v3, v4, p1}, Ly08;->d(Lt14;Laa7;Ljava/util/LinkedHashSet;Ljava/util/Set;)V

    .line 74
    .line 75
    .line 76
    const/16 v3, 0xa

    .line 77
    .line 78
    invoke-static {v4, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-static {v3}, Laq4;->G(I)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    const/16 v5, 0x10

    .line 87
    .line 88
    if-ge v3, v5, :cond_1

    .line 89
    .line 90
    move v3, v5

    .line 91
    :cond_1
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 92
    .line 93
    invoke-direct {v8, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_5

    .line 105
    .line 106
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    move-object v10, v3

    .line 111
    check-cast v10, Lhi8;

    .line 112
    .line 113
    if-eqz p1, :cond_3

    .line 114
    .line 115
    invoke-interface {p1, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-nez v3, :cond_2

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_2
    invoke-static {v10, v2}, Lcj8;->k(Lhi8;Lnl3;)Lni8;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    goto :goto_4

    .line 127
    :cond_3
    :goto_1
    iget-object v3, v2, Lnl3;->e:Ljava/util/Set;

    .line 128
    .line 129
    if-eqz v3, :cond_4

    .line 130
    .line 131
    invoke-static {v3, v0}, Lq57;->a0(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    :goto_2
    move-object v5, v3

    .line 136
    goto :goto_3

    .line 137
    :cond_4
    invoke-static {v0}, Lw45;->U(Ljava/lang/Object;)Ljava/util/Set;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    goto :goto_2

    .line 142
    :goto_3
    const/4 v6, 0x0

    .line 143
    const/16 v7, 0x2f

    .line 144
    .line 145
    const/4 v3, 0x0

    .line 146
    const/4 v4, 0x0

    .line 147
    invoke-static/range {v2 .. v7}, Lnl3;->a(Lnl3;Lol3;ZLjava/util/Set;Laa7;I)Lnl3;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {p0, v10, v3}, Lxd6;->q(Lhi8;Lnl3;)Lt14;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-static {v10, v2, p0, v3}, Lwe5;->e(Lhi8;Lnl3;Lxd6;Lt14;)Lni8;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    :goto_4
    invoke-interface {v10}, Lhi8;->l()Llh8;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-interface {v8, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_5
    new-instance p1, Lxg7;

    .line 168
    .line 169
    const/4 v3, 0x1

    .line 170
    invoke-direct {p1, v8, v3}, Lxg7;-><init>(Ljava/lang/Object;B)V

    .line 171
    .line 172
    .line 173
    new-instance v4, Lwi8;

    .line 174
    .line 175
    invoke-direct {v4, p1}, Lwi8;-><init>(Lui8;)V

    .line 176
    .line 177
    .line 178
    invoke-interface {v0}, Lhi8;->getUpperBounds()Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, v4, p1, v2}, Lxd6;->K(Lwi8;Ljava/util/List;Lnl3;)Lo57;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    iget-object v0, p1, Lo57;->X:Lip4;

    .line 190
    .line 191
    invoke-virtual {v0}, Lip4;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-nez v0, :cond_7

    .line 196
    .line 197
    iget-object p0, p1, Lo57;->X:Lip4;

    .line 198
    .line 199
    iget p0, p0, Lip4;->k0:I

    .line 200
    .line 201
    if-ne p0, v3, :cond_6

    .line 202
    .line 203
    invoke-static {p1}, Lwv0;->N0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    move-object v1, p0

    .line 208
    check-cast v1, Lt14;

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_6
    const-string p0, "Should only be one computed upper bound if no need to intersect all bounds"

    .line 212
    .line 213
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_7
    invoke-virtual {p0, v2}, Lxd6;->p(Lnl3;)Lmo8;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    :goto_5
    return-object v1

    .line 222
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 223
    .line 224
    check-cast p0, Lbz7;

    .line 225
    .line 226
    iget-object v0, p0, Lbz7;->Z:Lmm0;

    .line 227
    .line 228
    if-eqz v0, :cond_8

    .line 229
    .line 230
    invoke-virtual {v0, p1}, Lmm0;->z(Ljava/lang/Throwable;)Z

    .line 231
    .line 232
    .line 233
    :cond_8
    iput-object v1, p0, Lbz7;->Z:Lmm0;

    .line 234
    .line 235
    sget-object p0, Ldn8;->a:Ldn8;

    .line 236
    .line 237
    return-object p0

    .line 238
    :pswitch_3
    check-cast p1, Lqs7;

    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    check-cast p0, Lqs7;

    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_4
    check-cast p0, Lot8;

    .line 247
    .line 248
    check-cast p1, Lld0;

    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-interface {p1}, Ljd0;->L()Ljava/util/List;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    iget p0, p0, Lot8;->j0:I

    .line 258
    .line 259
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    check-cast p0, Lot8;

    .line 264
    .line 265
    invoke-virtual {p0}, Lqt8;->c()Lt14;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    return-object p0

    .line 273
    :pswitch_5
    check-cast p1, Ljava/util/Map$Entry;

    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    check-cast v0, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 283
    .line 284
    invoke-virtual {v0}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    check-cast p1, Lb83;

    .line 293
    .line 294
    check-cast p0, Lep6;

    .line 295
    .line 296
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-static {v0}, Lep6;->g(Ljava/lang/String;)Ltn6;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {p0, p1}, Lep6;->f(Lb83;)Lj2;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    if-eqz v0, :cond_a

    .line 308
    .line 309
    if-nez p0, :cond_9

    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_9
    new-instance v1, Lqg5;

    .line 313
    .line 314
    invoke-direct {v1, v0, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    :cond_a
    :goto_6
    return-object v1

    .line 318
    nop

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
