.class public final Lfb1;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic g0:B

.field public h0:B

.field public final synthetic i0:Lib1;

.field public j0:Ljava/lang/Object;

.field public final synthetic k0:Ljava/lang/Object;

.field public final synthetic l0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lea6;Lib1;Lca6;Lq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lfb1;->g0:B

    .line 3
    .line 4
    iput-object p1, p0, Lfb1;->k0:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lfb1;->i0:Lib1;

    .line 7
    .line 8
    iput-object p3, p0, Lfb1;->l0:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lib1;Ls61;Lrn2;Lq51;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Lfb1;->g0:B

    .line 15
    iput-object p1, p0, Lfb1;->i0:Lib1;

    iput-object p2, p0, Lfb1;->k0:Ljava/lang/Object;

    iput-object p3, p0, Lfb1;->l0:Ljava/lang/Object;

    invoke-direct {p0, v0, p4}, Luy7;-><init>(ILq51;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lfb1;->g0:B

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
    invoke-virtual {p0, p1}, Lfb1;->m(Lq51;)Lq51;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lfb1;

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lfb1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, Lfb1;->m(Lq51;)Lq51;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lfb1;

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Lfb1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Lq51;)Lq51;
    .locals 3

    .line 1
    iget-byte v0, p0, Lfb1;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lfb1;->l0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lfb1;->k0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Lfb1;->i0:Lib1;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, Lfb1;

    .line 13
    .line 14
    check-cast v2, Ls61;

    .line 15
    .line 16
    check-cast v1, Lrn2;

    .line 17
    .line 18
    invoke-direct {v0, p0, v2, v1, p1}, Lfb1;-><init>(Lib1;Ls61;Lrn2;Lq51;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    new-instance v0, Lfb1;

    .line 23
    .line 24
    check-cast v2, Lea6;

    .line 25
    .line 26
    check-cast v1, Lca6;

    .line 27
    .line 28
    invoke-direct {v0, v2, p0, v1, p1}, Lfb1;-><init>(Lea6;Lib1;Lca6;Lq51;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, Lfb1;->g0:B

    .line 2
    .line 3
    iget-object v1, p0, Lfb1;->l0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lfb1;->k0:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    sget-object v4, Lc71;->X:Lc71;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x3

    .line 14
    iget-object v8, p0, Lfb1;->i0:Lib1;

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-byte v0, p0, Lfb1;->h0:B

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    if-eq v0, v5, :cond_2

    .line 25
    .line 26
    if-eq v0, v6, :cond_1

    .line 27
    .line 28
    if-ne v0, v7, :cond_0

    .line 29
    .line 30
    iget-object v4, p0, Lfb1;->j0:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_4

    .line 36
    :cond_0
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    move-object v4, v9

    .line 40
    goto :goto_4

    .line 41
    :cond_1
    iget-object v0, p0, Lfb1;->j0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lv91;

    .line 44
    .line 45
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-byte v5, p0, Lfb1;->h0:B

    .line 57
    .line 58
    invoke-virtual {v8, v5, p0}, Lib1;->g(ZLs51;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v4, :cond_4

    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_4
    :goto_1
    move-object v0, p1

    .line 66
    check-cast v0, Lv91;

    .line 67
    .line 68
    check-cast v2, Ls61;

    .line 69
    .line 70
    new-instance p1, Lq0;

    .line 71
    .line 72
    check-cast v1, Lrn2;

    .line 73
    .line 74
    const/16 v3, 0x12

    .line 75
    .line 76
    invoke-direct {p1, v1, v0, v9, v3}, Lq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lfb1;->j0:Ljava/lang/Object;

    .line 80
    .line 81
    iput-byte v6, p0, Lfb1;->h0:B

    .line 82
    .line 83
    invoke-static {v2, p1, p0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-ne p1, v4, :cond_5

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_5
    :goto_2
    iget-object v1, v0, Lv91;->b:Ljava/lang/Object;

    .line 91
    .line 92
    if-eqz v1, :cond_6

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    goto :goto_3

    .line 99
    :cond_6
    const/4 v1, 0x0

    .line 100
    :goto_3
    iget v2, v0, Lv91;->c:I

    .line 101
    .line 102
    if-ne v1, v2, :cond_8

    .line 103
    .line 104
    iget-object v0, v0, Lv91;->b:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-static {v0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_7

    .line 111
    .line 112
    iput-object p1, p0, Lfb1;->j0:Ljava/lang/Object;

    .line 113
    .line 114
    iput-byte v7, p0, Lfb1;->h0:B

    .line 115
    .line 116
    invoke-virtual {v8, p1, v5, p0}, Lib1;->h(Ljava/lang/Object;ZLs51;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    if-ne p0, v4, :cond_7

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_7
    move-object v4, p1

    .line 124
    goto :goto_4

    .line 125
    :cond_8
    const-string p0, "Data in DataStore was mutated but DataStore is only compatible with Immutable types."

    .line 126
    .line 127
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :goto_4
    return-object v4

    .line 132
    :pswitch_0
    check-cast v1, Lca6;

    .line 133
    .line 134
    check-cast v2, Lea6;

    .line 135
    .line 136
    iget-byte v0, p0, Lfb1;->h0:B

    .line 137
    .line 138
    if-eqz v0, :cond_c

    .line 139
    .line 140
    if-eq v0, v5, :cond_b

    .line 141
    .line 142
    if-eq v0, v6, :cond_a

    .line 143
    .line 144
    if-ne v0, v7, :cond_9

    .line 145
    .line 146
    iget-object p0, p0, Lfb1;->j0:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast p0, Ljava/io/Serializable;

    .line 149
    .line 150
    move-object v1, p0

    .line 151
    check-cast v1, Lca6;

    .line 152
    .line 153
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_9
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    move-object v4, v9

    .line 161
    goto :goto_9

    .line 162
    :cond_a
    iget-object v0, p0, Lfb1;->j0:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Ljava/io/Serializable;

    .line 165
    .line 166
    check-cast v0, Lca6;

    .line 167
    .line 168
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Lj71; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_b
    iget-object v0, p0, Lfb1;->j0:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Ljava/io/Serializable;

    .line 175
    .line 176
    check-cast v0, Lea6;

    .line 177
    .line 178
    :try_start_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catch Lj71; {:try_start_1 .. :try_end_1} :catch_0

    .line 179
    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_c
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    :try_start_2
    iput-object v2, p0, Lfb1;->j0:Ljava/lang/Object;

    .line 186
    .line 187
    iput-byte v5, p0, Lfb1;->h0:B

    .line 188
    .line 189
    iget-object p1, v8, Lib1;->l0:Lvz7;

    .line 190
    .line 191
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    check-cast p1, Lp92;

    .line 196
    .line 197
    new-instance v0, Lta1;

    .line 198
    .line 199
    invoke-direct {v0, v7, v9}, Lta1;-><init>(ILq51;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v0, p0}, Lp92;->a(Lta1;Ls51;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    if-ne p1, v4, :cond_d

    .line 207
    .line 208
    goto :goto_9

    .line 209
    :cond_d
    move-object v0, v2

    .line 210
    :goto_5
    iput-object p1, v0, Lea6;->X:Ljava/lang/Object;

    .line 211
    .line 212
    invoke-virtual {v8}, Lib1;->b()Lja7;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    iput-object v1, p0, Lfb1;->j0:Ljava/lang/Object;

    .line 217
    .line 218
    iput-byte v6, p0, Lfb1;->h0:B

    .line 219
    .line 220
    invoke-virtual {p1}, Lja7;->a()Ljava/lang/Integer;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    if-ne p1, v4, :cond_e

    .line 225
    .line 226
    goto :goto_9

    .line 227
    :cond_e
    move-object v0, v1

    .line 228
    :goto_6
    check-cast p1, Ljava/lang/Number;

    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    iput p1, v0, Lca6;->X:I
    :try_end_2
    .catch Lj71; {:try_start_2 .. :try_end_2} :catch_0

    .line 235
    .line 236
    goto :goto_8

    .line 237
    :catch_0
    iget-object p1, v2, Lea6;->X:Ljava/lang/Object;

    .line 238
    .line 239
    iput-object v1, p0, Lfb1;->j0:Ljava/lang/Object;

    .line 240
    .line 241
    iput-byte v7, p0, Lfb1;->h0:B

    .line 242
    .line 243
    invoke-virtual {v8, p1, v5, p0}, Lib1;->h(Ljava/lang/Object;ZLs51;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    if-ne p1, v4, :cond_f

    .line 248
    .line 249
    goto :goto_9

    .line 250
    :cond_f
    :goto_7
    check-cast p1, Ljava/lang/Number;

    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 253
    .line 254
    .line 255
    move-result p0

    .line 256
    iput p0, v1, Lca6;->X:I

    .line 257
    .line 258
    :goto_8
    sget-object v4, Ldn8;->a:Ldn8;

    .line 259
    .line 260
    :goto_9
    return-object v4

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
