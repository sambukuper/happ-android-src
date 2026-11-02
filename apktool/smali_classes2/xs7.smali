.class public final synthetic Lxs7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Z

.field public final synthetic Y:Lqs7;

.field public final synthetic Z:Lgn2;

.field public final synthetic f0:Lkx4;

.field public final synthetic g0:Lj2;

.field public final synthetic h0:Z


# direct methods
.method public synthetic constructor <init>(ZLqs7;Lgn2;Lkx4;Lj2;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lxs7;->X:Z

    .line 5
    .line 6
    iput-object p2, p0, Lxs7;->Y:Lqs7;

    .line 7
    .line 8
    iput-object p3, p0, Lxs7;->Z:Lgn2;

    .line 9
    .line 10
    iput-object p4, p0, Lxs7;->f0:Lkx4;

    .line 11
    .line 12
    iput-object p5, p0, Lxs7;->g0:Lj2;

    .line 13
    .line 14
    iput-boolean p6, p0, Lxs7;->h0:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit8 p2, p1, 0x3

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v10, 0x0

    .line 15
    if-eq p2, v0, :cond_0

    .line 16
    .line 17
    move p2, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p2, v10

    .line 20
    :goto_0
    and-int/2addr p1, v1

    .line 21
    invoke-virtual {v7, p1, p2}, Llp2;->N(IZ)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_d

    .line 26
    .line 27
    iget-boolean p1, p0, Lxs7;->X:Z

    .line 28
    .line 29
    iget-object p2, p0, Lxs7;->Y:Lqs7;

    .line 30
    .line 31
    iget-object v11, p0, Lxs7;->Z:Lgn2;

    .line 32
    .line 33
    iget-object v3, p0, Lxs7;->f0:Lkx4;

    .line 34
    .line 35
    sget-object v12, Lzz0;->a:Lbe;

    .line 36
    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    const p1, -0x1966a11f

    .line 40
    .line 41
    .line 42
    invoke-virtual {v7, p1}, Llp2;->W(I)V

    .line 43
    .line 44
    .line 45
    sget p1, Ly46;->sub_properties_general_update_on_open:I

    .line 46
    .line 47
    invoke-static {p1, v7}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-boolean v1, p2, Lqs7;->b:Z

    .line 52
    .line 53
    invoke-virtual {v7, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {v7}, Llp2;->K()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-nez p1, :cond_1

    .line 62
    .line 63
    if-ne v2, v12, :cond_2

    .line 64
    .line 65
    :cond_1
    new-instance v2, Lpr2;

    .line 66
    .line 67
    const/16 p1, 0x10

    .line 68
    .line 69
    invoke-direct {v2, v11, p1}, Lpr2;-><init>(Lgn2;B)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    check-cast v2, Lgn2;

    .line 76
    .line 77
    const/16 v8, 0xc00

    .line 78
    .line 79
    const/16 v9, 0xf0

    .line 80
    .line 81
    const/4 v4, 0x0

    .line 82
    const/4 v5, 0x0

    .line 83
    const/4 v6, 0x0

    .line 84
    invoke-static/range {v0 .. v9}, Lg33;->a(Ljava/lang/String;ZLgn2;Lkx4;ZLjava/lang/String;Lgn2;Llp2;II)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v7, v10}, Llp2;->p(Z)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    const p1, -0x19602b39

    .line 92
    .line 93
    .line 94
    invoke-virtual {v7, p1}, Llp2;->W(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7, v10}, Llp2;->p(Z)V

    .line 98
    .line 99
    .line 100
    :goto_1
    sget p1, Ly46;->sub_properties_general_ping_on_open:I

    .line 101
    .line 102
    invoke-static {p1, v7}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-boolean v1, p2, Lqs7;->c:Z

    .line 107
    .line 108
    iget-object p1, p2, Lqs7;->d:Lfs7;

    .line 109
    .line 110
    invoke-virtual {v7, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    invoke-virtual {v7}, Llp2;->K()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    if-nez v2, :cond_4

    .line 119
    .line 120
    if-ne v4, v12, :cond_5

    .line 121
    .line 122
    :cond_4
    new-instance v4, Lpr2;

    .line 123
    .line 124
    const/16 v2, 0x11

    .line 125
    .line 126
    invoke-direct {v4, v11, v2}, Lpr2;-><init>(Lgn2;B)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_5
    move-object v2, v4

    .line 133
    check-cast v2, Lgn2;

    .line 134
    .line 135
    const/16 v8, 0xc00

    .line 136
    .line 137
    const/16 v9, 0xf0

    .line 138
    .line 139
    const/4 v4, 0x0

    .line 140
    const/4 v5, 0x0

    .line 141
    const/4 v6, 0x0

    .line 142
    invoke-static/range {v0 .. v9}, Lg33;->a(Ljava/lang/String;ZLgn2;Lkx4;ZLjava/lang/String;Lgn2;Llp2;II)V

    .line 143
    .line 144
    .line 145
    sget v0, Ly46;->sub_properties_general_connect_on_open:I

    .line 146
    .line 147
    invoke-static {v0, v7}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iget-boolean v1, p1, Lfs7;->a:Z

    .line 152
    .line 153
    invoke-virtual {v7, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    invoke-virtual {v7}, Llp2;->K()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    if-nez v2, :cond_6

    .line 162
    .line 163
    if-ne v4, v12, :cond_7

    .line 164
    .line 165
    :cond_6
    new-instance v4, Lpr2;

    .line 166
    .line 167
    const/16 v2, 0x12

    .line 168
    .line 169
    invoke-direct {v4, v11, v2}, Lpr2;-><init>(Lgn2;B)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v7, v4}, Llp2;->g0(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_7
    move-object v2, v4

    .line 176
    check-cast v2, Lgn2;

    .line 177
    .line 178
    const/16 v8, 0xc00

    .line 179
    .line 180
    const/16 v9, 0xf0

    .line 181
    .line 182
    const/4 v4, 0x0

    .line 183
    const/4 v5, 0x0

    .line 184
    const/4 v6, 0x0

    .line 185
    invoke-static/range {v0 .. v9}, Lg33;->a(Ljava/lang/String;ZLgn2;Lkx4;ZLjava/lang/String;Lgn2;Llp2;II)V

    .line 186
    .line 187
    .line 188
    sget v0, Ly46;->sub_properties_general_connect_to:I

    .line 189
    .line 190
    invoke-static {v0, v7}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    iget-object p1, p1, Lfs7;->b:Lsu/happ/proxyutility/dto/enums/SubscriptionAutoConnectType;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    const/16 v6, 0x180

    .line 201
    .line 202
    move-object v5, v7

    .line 203
    const/16 v7, 0x30

    .line 204
    .line 205
    iget-object v1, p0, Lxs7;->g0:Lj2;

    .line 206
    .line 207
    const/4 v4, 0x0

    .line 208
    move-object v2, v3

    .line 209
    move v3, p1

    .line 210
    invoke-static/range {v0 .. v7}, Lys0;->g(Ljava/lang/String;Lb83;Lkx4;ILtn2;Llp2;II)V

    .line 211
    .line 212
    .line 213
    move-object v3, v2

    .line 214
    move-object v7, v5

    .line 215
    sget p1, Ly46;->sub_properties_general_collapse:I

    .line 216
    .line 217
    invoke-static {p1, v7}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    iget-boolean v1, p2, Lqs7;->e:Z

    .line 222
    .line 223
    invoke-virtual {v7, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    invoke-virtual {v7}, Llp2;->K()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    if-nez p1, :cond_8

    .line 232
    .line 233
    if-ne v2, v12, :cond_9

    .line 234
    .line 235
    :cond_8
    new-instance v2, Lpr2;

    .line 236
    .line 237
    const/16 p1, 0x13

    .line 238
    .line 239
    invoke-direct {v2, v11, p1}, Lpr2;-><init>(Lgn2;B)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v7, v2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    :cond_9
    check-cast v2, Lgn2;

    .line 246
    .line 247
    const/16 v8, 0xc00

    .line 248
    .line 249
    const/16 v9, 0xf0

    .line 250
    .line 251
    const/4 v4, 0x0

    .line 252
    const/4 v5, 0x0

    .line 253
    const/4 v6, 0x0

    .line 254
    invoke-static/range {v0 .. v9}, Lg33;->a(Ljava/lang/String;ZLgn2;Lkx4;ZLjava/lang/String;Lgn2;Llp2;II)V

    .line 255
    .line 256
    .line 257
    iget-boolean p0, p0, Lxs7;->h0:Z

    .line 258
    .line 259
    if-eqz p0, :cond_c

    .line 260
    .line 261
    const p0, -0x1945d4f7

    .line 262
    .line 263
    .line 264
    invoke-virtual {v7, p0}, Llp2;->W(I)V

    .line 265
    .line 266
    .line 267
    sget p0, Ly46;->sub_properties_general_filter:I

    .line 268
    .line 269
    invoke-static {p0, v7}, Lvj8;->j0(ILlp2;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    iget-boolean v1, p2, Lqs7;->f:Z

    .line 274
    .line 275
    invoke-virtual {v7, v11}, Llp2;->f(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result p0

    .line 279
    invoke-virtual {v7}, Llp2;->K()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    if-nez p0, :cond_a

    .line 284
    .line 285
    if-ne p1, v12, :cond_b

    .line 286
    .line 287
    :cond_a
    new-instance p1, Lpr2;

    .line 288
    .line 289
    const/16 p0, 0x14

    .line 290
    .line 291
    invoke-direct {p1, v11, p0}, Lpr2;-><init>(Lgn2;B)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v7, p1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    :cond_b
    move-object v2, p1

    .line 298
    check-cast v2, Lgn2;

    .line 299
    .line 300
    const/16 v8, 0xc00

    .line 301
    .line 302
    const/16 v9, 0xf0

    .line 303
    .line 304
    const/4 v4, 0x0

    .line 305
    const/4 v5, 0x0

    .line 306
    const/4 v6, 0x0

    .line 307
    invoke-static/range {v0 .. v9}, Lg33;->a(Ljava/lang/String;ZLgn2;Lkx4;ZLjava/lang/String;Lgn2;Llp2;II)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v7, v10}, Llp2;->p(Z)V

    .line 311
    .line 312
    .line 313
    goto :goto_2

    .line 314
    :cond_c
    const p0, -0x193e8cd9

    .line 315
    .line 316
    .line 317
    invoke-virtual {v7, p0}, Llp2;->W(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v7, v10}, Llp2;->p(Z)V

    .line 321
    .line 322
    .line 323
    goto :goto_2

    .line 324
    :cond_d
    invoke-virtual {v7}, Llp2;->Q()V

    .line 325
    .line 326
    .line 327
    :goto_2
    sget-object p0, Ldn8;->a:Ldn8;

    .line 328
    .line 329
    return-object p0
.end method
