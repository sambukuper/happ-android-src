.class public final Lie5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lkx4;

.field public final synthetic Y:Lsn2;

.field public final synthetic Z:Lq58;

.field public final synthetic f0:Z

.field public final synthetic g0:Li48;

.field public final synthetic h0:Ly68;

.field public final synthetic i0:Z

.field public final synthetic j0:Lw58;

.field public final synthetic k0:Lxz4;

.field public final synthetic l0:Lgg5;

.field public final synthetic m0:Lde3;

.field public final synthetic n0:Lo88;

.field public final synthetic o0:Lwx3;

.field public final synthetic p0:Lay6;

.field public final synthetic q0:Lx67;


# direct methods
.method public constructor <init>(Lkx4;Lsn2;Lq58;ZLi48;Ly68;ZLw58;Lxz4;Lgg5;Lde3;Lo88;Lwx3;Lay6;Lx67;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lie5;->X:Lkx4;

    .line 5
    .line 6
    iput-object p2, p0, Lie5;->Y:Lsn2;

    .line 7
    .line 8
    iput-object p3, p0, Lie5;->Z:Lq58;

    .line 9
    .line 10
    iput-boolean p4, p0, Lie5;->f0:Z

    .line 11
    .line 12
    iput-object p5, p0, Lie5;->g0:Li48;

    .line 13
    .line 14
    iput-object p6, p0, Lie5;->h0:Ly68;

    .line 15
    .line 16
    iput-boolean p7, p0, Lie5;->i0:Z

    .line 17
    .line 18
    iput-object p8, p0, Lie5;->j0:Lw58;

    .line 19
    .line 20
    iput-object p9, p0, Lie5;->k0:Lxz4;

    .line 21
    .line 22
    iput-object p10, p0, Lie5;->l0:Lgg5;

    .line 23
    .line 24
    iput-object p11, p0, Lie5;->m0:Lde3;

    .line 25
    .line 26
    iput-object p12, p0, Lie5;->n0:Lo88;

    .line 27
    .line 28
    iput-object p13, p0, Lie5;->o0:Lwx3;

    .line 29
    .line 30
    iput-object p14, p0, Lie5;->p0:Lay6;

    .line 31
    .line 32
    iput-object p15, p0, Lie5;->q0:Lx67;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v11, p1

    .line 4
    .line 5
    check-cast v11, Llp2;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v5

    .line 25
    :goto_0
    and-int/2addr v1, v4

    .line 26
    invoke-virtual {v11, v1, v2}, Llp2;->N(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_5

    .line 31
    .line 32
    iget-object v1, v0, Lie5;->Y:Lsn2;

    .line 33
    .line 34
    sget-object v2, Lhx4;->X:Lhx4;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    const v1, -0x78d30ea7

    .line 39
    .line 40
    .line 41
    invoke-virtual {v11, v1}, Llp2;->W(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v11}, Llp2;->K()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    sget-object v3, Lzz0;->a:Lbe;

    .line 49
    .line 50
    if-ne v1, v3, :cond_1

    .line 51
    .line 52
    new-instance v1, Ldx4;

    .line 53
    .line 54
    const/16 v3, 0x8

    .line 55
    .line 56
    invoke-direct {v1, v3}, Ldx4;-><init>(B)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v11, v1}, Llp2;->g0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    check-cast v1, Lgn2;

    .line 63
    .line 64
    invoke-static {v2, v4, v1}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 65
    .line 66
    .line 67
    move-result-object v12

    .line 68
    invoke-static {v11}, Lpn7;->k(Llp2;)F

    .line 69
    .line 70
    .line 71
    move-result v14

    .line 72
    const/16 v16, 0x0

    .line 73
    .line 74
    const/16 v17, 0xd

    .line 75
    .line 76
    const/4 v13, 0x0

    .line 77
    const/4 v15, 0x0

    .line 78
    invoke-static/range {v12 .. v17}, Los4;->A(Lkx4;FFFFI)Lkx4;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v11, v5}, Llp2;->p(Z)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    const v1, -0x78cd33e0

    .line 87
    .line 88
    .line 89
    invoke-virtual {v11, v1}, Llp2;->W(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v11, v5}, Llp2;->p(Z)V

    .line 93
    .line 94
    .line 95
    :goto_1
    iget-object v1, v0, Lie5;->X:Lkx4;

    .line 96
    .line 97
    invoke-interface {v1, v2}, Lkx4;->y(Lkx4;)Lkx4;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    sget v2, Lb56;->default_error_message:I

    .line 102
    .line 103
    invoke-static {v2, v11}, Lw79;->B(ILlp2;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    iget-boolean v3, v0, Lie5;->f0:Z

    .line 108
    .line 109
    if-eqz v3, :cond_3

    .line 110
    .line 111
    new-instance v3, Lnm7;

    .line 112
    .line 113
    const/4 v4, 0x3

    .line 114
    invoke-direct {v3, v2, v4}, Lnm7;-><init>(Ljava/lang/String;B)V

    .line 115
    .line 116
    .line 117
    invoke-static {v1, v5, v3}, Lv07;->a(Lkx4;ZLgn2;)Lkx4;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    :cond_3
    const/high16 v2, 0x438c0000    # 280.0f

    .line 122
    .line 123
    const/high16 v3, 0x42600000    # 56.0f

    .line 124
    .line 125
    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/layout/b;->a(Lkx4;FF)Lkx4;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    new-instance v8, Lfe7;

    .line 130
    .line 131
    iget-object v6, v0, Lie5;->g0:Li48;

    .line 132
    .line 133
    iget-boolean v4, v0, Lie5;->f0:Z

    .line 134
    .line 135
    if-eqz v4, :cond_4

    .line 136
    .line 137
    iget-wide v2, v6, Li48;->j:J

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_4
    iget-wide v2, v6, Li48;->i:J

    .line 141
    .line 142
    :goto_2
    invoke-direct {v8, v2, v3}, Lfe7;-><init>(J)V

    .line 143
    .line 144
    .line 145
    new-instance v2, Lhe5;

    .line 146
    .line 147
    iget-object v7, v0, Lie5;->q0:Lx67;

    .line 148
    .line 149
    iget-boolean v3, v0, Lie5;->i0:Z

    .line 150
    .line 151
    iget-object v5, v0, Lie5;->k0:Lxz4;

    .line 152
    .line 153
    invoke-direct/range {v2 .. v7}, Lhe5;-><init>(ZZLxz4;Li48;Lx67;)V

    .line 154
    .line 155
    .line 156
    move/from16 v17, v3

    .line 157
    .line 158
    move/from16 v18, v4

    .line 159
    .line 160
    move-object/from16 v19, v5

    .line 161
    .line 162
    move-object/from16 v21, v6

    .line 163
    .line 164
    const v3, -0x5dd54bf

    .line 165
    .line 166
    .line 167
    invoke-static {v3, v2, v11}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 168
    .line 169
    .line 170
    move-result-object v22

    .line 171
    new-instance v9, Lde5;

    .line 172
    .line 173
    iget-object v13, v0, Lie5;->h0:Ly68;

    .line 174
    .line 175
    iget-object v14, v0, Lie5;->j0:Lw58;

    .line 176
    .line 177
    iget-object v15, v0, Lie5;->Z:Lq58;

    .line 178
    .line 179
    iget-object v2, v0, Lie5;->Y:Lsn2;

    .line 180
    .line 181
    iget-object v3, v0, Lie5;->l0:Lgg5;

    .line 182
    .line 183
    move-object/from16 v16, v2

    .line 184
    .line 185
    move-object/from16 v20, v3

    .line 186
    .line 187
    move-object v12, v9

    .line 188
    invoke-direct/range {v12 .. v22}, Lde5;-><init>(Ly68;Lw58;Lq58;Lsn2;ZZLxz4;Lgg5;Li48;Lzy0;)V

    .line 189
    .line 190
    .line 191
    const/4 v13, 0x0

    .line 192
    const/4 v14, 0x0

    .line 193
    iget-object v2, v0, Lie5;->h0:Ly68;

    .line 194
    .line 195
    move-object v3, v2

    .line 196
    iget-boolean v2, v0, Lie5;->i0:Z

    .line 197
    .line 198
    move-object v4, v3

    .line 199
    iget-object v3, v0, Lie5;->m0:Lde3;

    .line 200
    .line 201
    move-object v5, v4

    .line 202
    iget-object v4, v0, Lie5;->n0:Lo88;

    .line 203
    .line 204
    move-object v6, v5

    .line 205
    iget-object v5, v0, Lie5;->o0:Lwx3;

    .line 206
    .line 207
    move-object v7, v6

    .line 208
    iget-object v6, v0, Lie5;->j0:Lw58;

    .line 209
    .line 210
    move-object v10, v7

    .line 211
    iget-object v7, v0, Lie5;->k0:Lxz4;

    .line 212
    .line 213
    iget-object v0, v0, Lie5;->p0:Lay6;

    .line 214
    .line 215
    const/4 v12, 0x0

    .line 216
    move-object/from16 v23, v10

    .line 217
    .line 218
    move-object v10, v0

    .line 219
    move-object/from16 v0, v23

    .line 220
    .line 221
    invoke-static/range {v0 .. v14}, Lx30;->b(Ly68;Lkx4;ZLde3;Lo88;Lwx3;Lw58;Lxz4;Ld90;Lo48;Lay6;Llp2;III)V

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_5
    invoke-virtual {v11}, Llp2;->Q()V

    .line 226
    .line 227
    .line 228
    :goto_3
    sget-object v0, Ldn8;->a:Ldn8;

    .line 229
    .line 230
    return-object v0
.end method
