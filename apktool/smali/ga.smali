.class public final Lga;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Ljava/lang/Object;

.field public final synthetic j0:Ljava/lang/Object;

.field public final synthetic k0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, Lga;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lga;->k0:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lga;->i0:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lga;->j0:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lga;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lq51;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lga;->m(Lq51;)Lq51;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lga;

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lga;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, Lga;->m(Lq51;)Lq51;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lga;

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Lga;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :pswitch_1
    invoke-virtual {p0, p1}, Lga;->m(Lq51;)Lq51;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lga;

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lga;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_2
    invoke-virtual {p0, p1}, Lga;->m(Lq51;)Lq51;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Lga;

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lga;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Lq51;)Lq51;
    .locals 11

    .line 1
    iget-byte v0, p0, Lga;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lga;->i0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lga;->j0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lga;->k0:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v4, Lga;

    .line 13
    .line 14
    move-object v5, v3

    .line 15
    check-cast v5, Lwq8;

    .line 16
    .line 17
    move-object v6, v1

    .line 18
    check-cast v6, Lgg0;

    .line 19
    .line 20
    move-object v7, v2

    .line 21
    check-cast v7, Ljava/util/Map;

    .line 22
    .line 23
    const/4 v9, 0x3

    .line 24
    move-object v8, p1

    .line 25
    invoke-direct/range {v4 .. v9}, Lga;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 26
    .line 27
    .line 28
    return-object v4

    .line 29
    :pswitch_0
    move-object v9, p1

    .line 30
    new-instance v5, Lga;

    .line 31
    .line 32
    move-object v6, v3

    .line 33
    check-cast v6, Lwq8;

    .line 34
    .line 35
    move-object v7, v1

    .line 36
    check-cast v7, Ljava/util/Map;

    .line 37
    .line 38
    move-object v8, v2

    .line 39
    check-cast v8, Lk11;

    .line 40
    .line 41
    const/4 v10, 0x2

    .line 42
    invoke-direct/range {v5 .. v10}, Lga;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 43
    .line 44
    .line 45
    return-object v5

    .line 46
    :pswitch_1
    move-object v9, p1

    .line 47
    new-instance v5, Lga;

    .line 48
    .line 49
    move-object v6, v3

    .line 50
    check-cast v6, Lla;

    .line 51
    .line 52
    move-object v8, v2

    .line 53
    check-cast v8, Ltn2;

    .line 54
    .line 55
    const/4 v10, 0x1

    .line 56
    iget-object v7, p0, Lga;->i0:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-direct/range {v5 .. v10}, Lga;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 59
    .line 60
    .line 61
    return-object v5

    .line 62
    :pswitch_2
    move-object v9, p1

    .line 63
    new-instance v5, Lga;

    .line 64
    .line 65
    move-object v6, v3

    .line 66
    check-cast v6, Lt5;

    .line 67
    .line 68
    move-object v8, v2

    .line 69
    check-cast v8, Ltn2;

    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    iget-object v7, p0, Lga;->i0:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-direct/range {v5 .. v10}, Lga;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 75
    .line 76
    .line 77
    return-object v5

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, Lga;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lga;->j0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lga;->i0:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    sget-object v5, Lc71;->X:Lc71;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    iget-object v7, p0, Lga;->k0:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast v7, Lwq8;

    .line 21
    .line 22
    iget-boolean v0, p0, Lga;->h0:Z

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    if-ne v0, v6, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    move-object p1, v8

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const-string p1, "CXCP"

    .line 41
    .line 42
    invoke-static {p1}, Lhi5;->i0(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    iget-object p1, v7, Lwq8;->k:Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    new-instance v0, Lsq8;

    .line 48
    .line 49
    sget-object v1, Lwq8;->l:Lux0;

    .line 50
    .line 51
    check-cast v3, Lgg0;

    .line 52
    .line 53
    new-instance v1, Lfg0;

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-direct {v1, v4}, Lfg0;-><init>(B)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v3}, Lfg0;->c(Ll11;)V

    .line 60
    .line 61
    .line 62
    check-cast v2, Ljava/util/Map;

    .line 63
    .line 64
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 65
    .line 66
    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 67
    .line 68
    .line 69
    const/16 v2, 0xc

    .line 70
    .line 71
    invoke-direct {v0, v1, v3, v8, v2}, Lsq8;-><init>(Lfg0;Ljava/util/LinkedHashMap;Lwe6;I)V

    .line 72
    .line 73
    .line 74
    sget-object v1, Lpq8;->Z:Lpq8;

    .line 75
    .line 76
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    iget-object p1, v7, Lwq8;->k:Ljava/util/LinkedHashMap;

    .line 80
    .line 81
    invoke-static {p1}, Lwq8;->j(Ljava/util/LinkedHashMap;)Lsq8;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-boolean v6, p0, Lga;->h0:Z

    .line 86
    .line 87
    invoke-virtual {v7, p1, v8, p0}, Lwq8;->m(Lsq8;Ljava/util/LinkedHashSet;Ls51;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-ne p1, v5, :cond_2

    .line 92
    .line 93
    move-object p1, v5

    .line 94
    :cond_2
    :goto_0
    return-object p1

    .line 95
    :pswitch_0
    iget-boolean v0, p0, Lga;->h0:Z

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    if-ne v0, v6, :cond_3

    .line 100
    .line 101
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    move-object p1, v8

    .line 109
    goto :goto_1

    .line 110
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    check-cast v7, Lwq8;

    .line 114
    .line 115
    check-cast v3, Ljava/util/Map;

    .line 116
    .line 117
    check-cast v2, Lk11;

    .line 118
    .line 119
    iput-boolean v6, p0, Lga;->h0:Z

    .line 120
    .line 121
    sget-object p1, Lwq8;->l:Lux0;

    .line 122
    .line 123
    sget-object p1, Lpq8;->Y:Lpq8;

    .line 124
    .line 125
    invoke-virtual {v7, p1, v3, v2, p0}, Lwq8;->l(Lpq8;Ljava/util/Map;Lk11;Luy7;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-ne p1, v5, :cond_5

    .line 130
    .line 131
    move-object p1, v5

    .line 132
    :cond_5
    :goto_1
    return-object p1

    .line 133
    :pswitch_1
    check-cast v7, Lla;

    .line 134
    .line 135
    iget-boolean v0, p0, Lga;->h0:Z

    .line 136
    .line 137
    if-eqz v0, :cond_7

    .line 138
    .line 139
    if-ne v0, v6, :cond_6

    .line 140
    .line 141
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_6
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    move-object v1, v8

    .line 149
    goto :goto_3

    .line 150
    :cond_7
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget-object p1, v7, Lla;->h:Lrh5;

    .line 154
    .line 155
    invoke-virtual {p1, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    new-instance p1, Lba;

    .line 159
    .line 160
    const/4 v0, 0x2

    .line 161
    invoke-direct {p1, v7, v0}, Lba;-><init>(Lla;B)V

    .line 162
    .line 163
    .line 164
    new-instance v0, Lr0;

    .line 165
    .line 166
    check-cast v2, Ltn2;

    .line 167
    .line 168
    const/4 v4, 0x4

    .line 169
    invoke-direct {v0, v2, v7, v8, v4}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 170
    .line 171
    .line 172
    iput-boolean v6, p0, Lga;->h0:Z

    .line 173
    .line 174
    invoke-static {p1, v0, p0}, Lt9;->b(Ldn2;Lrn2;Ls51;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    if-ne p0, v5, :cond_8

    .line 179
    .line 180
    move-object v1, v5

    .line 181
    goto :goto_3

    .line 182
    :cond_8
    :goto_2
    iget-object p0, v7, Lla;->a:Ly2;

    .line 183
    .line 184
    invoke-virtual {v7}, Lla;->b()Lke1;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {p0, v3}, Lke1;->c(Ljava/lang/Object;)F

    .line 189
    .line 190
    .line 191
    move-result p0

    .line 192
    iget-object p1, v7, Lla;->j:Lia;

    .line 193
    .line 194
    iget-object v0, v7, Lla;->g:Lnh5;

    .line 195
    .line 196
    invoke-virtual {v0}, Lnh5;->l()F

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    invoke-virtual {p1, p0, v0}, Lia;->a(FF)V

    .line 201
    .line 202
    .line 203
    iget-object p0, v7, Lla;->d:Lrh5;

    .line 204
    .line 205
    invoke-virtual {p0, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    iget-object p0, v7, Lla;->c:Lrh5;

    .line 209
    .line 210
    invoke-virtual {p0, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    :goto_3
    return-object v1

    .line 214
    :pswitch_2
    check-cast v7, Lt5;

    .line 215
    .line 216
    iget-boolean v0, p0, Lga;->h0:Z

    .line 217
    .line 218
    if-eqz v0, :cond_a

    .line 219
    .line 220
    if-ne v0, v6, :cond_9

    .line 221
    .line 222
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_9
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    move-object v1, v8

    .line 230
    goto :goto_4

    .line 231
    :cond_a
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    iget-object p1, v7, Lt5;->m0:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast p1, Lrh5;

    .line 237
    .line 238
    invoke-virtual {p1, v3}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    new-instance p1, Laa;

    .line 242
    .line 243
    const/4 v0, 0x3

    .line 244
    invoke-direct {p1, v7, v0}, Laa;-><init>(Lt5;B)V

    .line 245
    .line 246
    .line 247
    new-instance v3, Lr0;

    .line 248
    .line 249
    check-cast v2, Ltn2;

    .line 250
    .line 251
    invoke-direct {v3, v2, v7, v8, v0}, Lr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 252
    .line 253
    .line 254
    iput-boolean v6, p0, Lga;->h0:Z

    .line 255
    .line 256
    invoke-static {p1, v3, p0}, Lys0;->T(Ldn2;Lrn2;Ls51;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    if-ne p0, v5, :cond_b

    .line 261
    .line 262
    move-object v1, v5

    .line 263
    :cond_b
    :goto_4
    return-object v1

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
