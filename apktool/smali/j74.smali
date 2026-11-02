.class public final Lj74;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lny6;


# static fields
.field public static final A0:Lxd6;


# instance fields
.field public final X:Lhf1;

.field public Y:Z

.field public Z:Le74;

.field public f0:Z

.field public final g0:Lwg;

.field public final h0:Lrh5;

.field public final i0:Lxz4;

.field public j0:F

.field public final k0:Lfu6;

.field public final l0:Z

.field public m0:Landroidx/compose/ui/node/LayoutNode;

.field public final n0:Lg74;

.field public final o0:Ld00;

.field public final p0:Ld64;

.field public final q0:Lvk1;

.field public final r0:Lp64;

.field public final s0:Lvk1;

.field public final t0:Lq02;

.field public final u0:Lm64;

.field public final v0:Ly05;

.field public final w0:Lrh5;

.field public final x0:Lrh5;

.field public final y0:Ly05;

.field public final z0:Lzz2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lnw2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lnw2;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Luh3;

    .line 8
    .line 9
    const/4 v2, 0x6

    .line 10
    invoke-direct {v1, v2}, Luh3;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lb1;

    .line 14
    .line 15
    const/16 v3, 0xb

    .line 16
    .line 17
    invoke-direct {v2, v0, v3}, Lb1;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-static {v0, v1}, Lci8;->i(ILjava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    new-instance v0, Lxd6;

    .line 25
    .line 26
    const/4 v3, 0x6

    .line 27
    invoke-direct {v0, v2, v1, v3}, Lxd6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lj74;->A0:Lxd6;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(II)V
    .locals 10

    .line 1
    new-instance v0, Lhf1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    iput v1, v0, Lhf1;->a:I

    .line 8
    .line 9
    iput v1, v0, Lhf1;->d:I

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lj74;->X:Lhf1;

    .line 15
    .line 16
    new-instance v0, Lwg;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v1, Loh5;

    .line 22
    .line 23
    invoke-direct {v1, p1}, Loh5;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v1, v0, Lwg;->b:Ljava/lang/Object;

    .line 27
    .line 28
    new-instance v1, Loh5;

    .line 29
    .line 30
    invoke-direct {v1, p2}, Loh5;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object v1, v0, Lwg;->c:Ljava/lang/Object;

    .line 34
    .line 35
    new-instance p2, Lj64;

    .line 36
    .line 37
    invoke-direct {p2, p1}, Lj64;-><init>(I)V

    .line 38
    .line 39
    .line 40
    iput-object p2, v0, Lwg;->e:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object v0, p0, Lj74;->g0:Lwg;

    .line 43
    .line 44
    sget-object p2, Ll74;->a:Le74;

    .line 45
    .line 46
    sget-object v0, Llh4;->i0:Llh4;

    .line 47
    .line 48
    new-instance v1, Lrh5;

    .line 49
    .line 50
    invoke-direct {v1, p2, v0}, Lrh5;-><init>(Ljava/lang/Object;Lqd7;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lj74;->h0:Lrh5;

    .line 54
    .line 55
    new-instance p2, Lxz4;

    .line 56
    .line 57
    invoke-direct {p2}, Lxz4;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Lj74;->i0:Lxz4;

    .line 61
    .line 62
    new-instance p2, Lvj2;

    .line 63
    .line 64
    const/16 v1, 0xd

    .line 65
    .line 66
    invoke-direct {p2, p0, v1}, Lvj2;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    new-instance v1, Lfu6;

    .line 70
    .line 71
    invoke-direct {v1, p2}, Lfu6;-><init>(Lgn2;)V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, Lj74;->k0:Lfu6;

    .line 75
    .line 76
    const/4 p2, 0x1

    .line 77
    iput-boolean p2, p0, Lj74;->l0:Z

    .line 78
    .line 79
    new-instance p2, Lg74;

    .line 80
    .line 81
    invoke-direct {p2, p0}, Lg74;-><init>(Lj74;)V

    .line 82
    .line 83
    .line 84
    iput-object p2, p0, Lj74;->n0:Lg74;

    .line 85
    .line 86
    new-instance p2, Ld00;

    .line 87
    .line 88
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object p2, p0, Lj74;->o0:Ld00;

    .line 92
    .line 93
    new-instance p2, Ld64;

    .line 94
    .line 95
    invoke-direct {p2}, Ld64;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object p2, p0, Lj74;->p0:Ld64;

    .line 99
    .line 100
    new-instance p2, Lvk1;

    .line 101
    .line 102
    const/16 v1, 0x16

    .line 103
    .line 104
    invoke-direct {p2, v1}, Lvk1;-><init>(B)V

    .line 105
    .line 106
    .line 107
    iput-object p2, p0, Lj74;->q0:Lvk1;

    .line 108
    .line 109
    new-instance p2, Lp64;

    .line 110
    .line 111
    new-instance v1, Lqb;

    .line 112
    .line 113
    invoke-direct {v1, p0, p1}, Lqb;-><init>(Lj74;I)V

    .line 114
    .line 115
    .line 116
    invoke-direct {p2, v1}, Lp64;-><init>(Lqb;)V

    .line 117
    .line 118
    .line 119
    iput-object p2, p0, Lj74;->r0:Lp64;

    .line 120
    .line 121
    new-instance p1, Lvk1;

    .line 122
    .line 123
    const/16 p2, 0x17

    .line 124
    .line 125
    invoke-direct {p1, p0, p2}, Lvk1;-><init>(Ljava/lang/Object;B)V

    .line 126
    .line 127
    .line 128
    iput-object p1, p0, Lj74;->s0:Lvk1;

    .line 129
    .line 130
    new-instance p1, Lq02;

    .line 131
    .line 132
    const/16 p2, 0xf

    .line 133
    .line 134
    invoke-direct {p1, p0, p2}, Lq02;-><init>(Ljava/lang/Object;B)V

    .line 135
    .line 136
    .line 137
    iput-object p1, p0, Lj74;->t0:Lq02;

    .line 138
    .line 139
    new-instance p1, Lm64;

    .line 140
    .line 141
    invoke-direct {p1}, Lm64;-><init>()V

    .line 142
    .line 143
    .line 144
    iput-object p1, p0, Lj74;->u0:Lm64;

    .line 145
    .line 146
    new-instance p1, Lrh5;

    .line 147
    .line 148
    sget-object p2, Ldn8;->a:Ldn8;

    .line 149
    .line 150
    invoke-direct {p1, p2, v0}, Lrh5;-><init>(Ljava/lang/Object;Lqd7;)V

    .line 151
    .line 152
    .line 153
    iput-object p1, p0, Lj74;->v0:Ly05;

    .line 154
    .line 155
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    iput-object v1, p0, Lj74;->w0:Lrh5;

    .line 162
    .line 163
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iput-object p1, p0, Lj74;->x0:Lrh5;

    .line 168
    .line 169
    new-instance p1, Lrh5;

    .line 170
    .line 171
    invoke-direct {p1, p2, v0}, Lrh5;-><init>(Ljava/lang/Object;Lqd7;)V

    .line 172
    .line 173
    .line 174
    iput-object p1, p0, Lj74;->y0:Ly05;

    .line 175
    .line 176
    new-instance p1, Lzz2;

    .line 177
    .line 178
    const/16 p2, 0x8

    .line 179
    .line 180
    const/4 v0, 0x0

    .line 181
    invoke-direct {p1, p2, v0}, Lzz2;-><init>(BZ)V

    .line 182
    .line 183
    .line 184
    sget-object v2, Lys0;->j0:Lug8;

    .line 185
    .line 186
    const/4 p2, 0x0

    .line 187
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    new-instance v1, Lqk;

    .line 192
    .line 193
    iget-object p2, v2, Lug8;->a:Lgn2;

    .line 194
    .line 195
    invoke-interface {p2, v3}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    move-object v4, p2

    .line 200
    check-cast v4, Lwk;

    .line 201
    .line 202
    const-wide/high16 v5, -0x8000000000000000L

    .line 203
    .line 204
    const-wide/high16 v7, -0x8000000000000000L

    .line 205
    .line 206
    const/4 v9, 0x0

    .line 207
    invoke-direct/range {v1 .. v9}, Lqk;-><init>(Lug8;Ljava/lang/Object;Lwk;JJZ)V

    .line 208
    .line 209
    .line 210
    iput-object v1, p1, Lzz2;->Z:Ljava/lang/Object;

    .line 211
    .line 212
    iput-object p1, p0, Lj74;->z0:Lzz2;

    .line 213
    .line 214
    return-void
.end method

.method public static f(Lj74;ILq51;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Li74;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, p0, p1, v1, v2}, Li74;-><init>(Ljava/lang/Object;ILq51;B)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lf15;->X:Lf15;

    .line 12
    .line 13
    invoke-virtual {p0, p1, v0, p2}, Lj74;->i(Lf15;Lrn2;Lq51;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, Lc71;->X:Lc71;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 23
    .line 24
    return-object p0
.end method


# virtual methods
.method public final a(Le74;ZZ)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lys0;->j0:Lug8;

    .line 6
    .line 7
    iget-object v3, v1, Le74;->l:Ljava/util/List;

    .line 8
    .line 9
    iget v4, v1, Le74;->o:I

    .line 10
    .line 11
    iget v5, v1, Le74;->b:I

    .line 12
    .line 13
    iget-object v6, v1, Le74;->a:Lf74;

    .line 14
    .line 15
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    iget-object v8, v0, Lj74;->r0:Lp64;

    .line 20
    .line 21
    iput v7, v8, Lp64;->e:I

    .line 22
    .line 23
    const/16 v7, 0x3c

    .line 24
    .line 25
    iget-object v8, v0, Lj74;->z0:Lzz2;

    .line 26
    .line 27
    iget-object v9, v0, Lj74;->g0:Lwg;

    .line 28
    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v11, 0x0

    .line 31
    if-nez p2, :cond_4

    .line 32
    .line 33
    iget-boolean v12, v0, Lj74;->Y:Z

    .line 34
    .line 35
    if-eqz v12, :cond_4

    .line 36
    .line 37
    iput-object v1, v0, Lj74;->Z:Le74;

    .line 38
    .line 39
    invoke-static {}, Lyn0;->D()Ldd7;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-virtual {v1}, Ldd7;->e()Lgn2;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    move-object v3, v0

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v3, v11

    .line 52
    :goto_0
    invoke-static {v1}, Lyn0;->P(Ldd7;)Ldd7;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    :try_start_0
    iget-object v0, v8, Lzz2;->Z:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lqk;

    .line 59
    .line 60
    iget-object v0, v0, Lqk;->Y:Lrh5;

    .line 61
    .line 62
    invoke-virtual {v0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    cmpg-float v0, v0, v10

    .line 73
    .line 74
    if-nez v0, :cond_1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    if-eqz v6, :cond_3

    .line 78
    .line 79
    iget v0, v6, Lf74;->a:I

    .line 80
    .line 81
    iget-object v6, v9, Lwg;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v6, Loh5;

    .line 84
    .line 85
    invoke-virtual {v6}, Loh5;->l()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-ne v0, v6, :cond_3

    .line 90
    .line 91
    iget-object v0, v9, Lwg;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Loh5;

    .line 94
    .line 95
    invoke-virtual {v0}, Loh5;->l()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-ne v5, v0, :cond_3

    .line 100
    .line 101
    iget-object v0, v8, Lzz2;->Y:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Log7;

    .line 104
    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    invoke-virtual {v0, v11}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 108
    .line 109
    .line 110
    :cond_2
    new-instance v0, Lqk;

    .line 111
    .line 112
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-direct {v0, v2, v5, v11, v7}, Lqk;-><init>(Lug8;Ljava/lang/Object;Lwk;I)V

    .line 117
    .line 118
    .line 119
    iput-object v0, v8, Lzz2;->Z:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    goto :goto_2

    .line 124
    :cond_3
    :goto_1
    invoke-static {v1, v4, v3}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :goto_2
    invoke-static {v1, v4, v3}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :cond_4
    const/4 v12, 0x1

    .line 133
    if-eqz p2, :cond_5

    .line 134
    .line 135
    iput-boolean v12, v0, Lj74;->Y:Z

    .line 136
    .line 137
    :cond_5
    if-eqz v6, :cond_6

    .line 138
    .line 139
    iget v14, v6, Lf74;->a:I

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    const/4 v14, 0x0

    .line 143
    :goto_3
    if-nez v14, :cond_8

    .line 144
    .line 145
    if-eqz v5, :cond_7

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    const/4 v14, 0x0

    .line 149
    goto :goto_5

    .line 150
    :cond_8
    :goto_4
    move v14, v12

    .line 151
    :goto_5
    iget-object v15, v0, Lj74;->x0:Lrh5;

    .line 152
    .line 153
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 154
    .line 155
    .line 156
    move-result-object v14

    .line 157
    invoke-virtual {v15, v14}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iget-boolean v14, v1, Le74;->c:Z

    .line 161
    .line 162
    iget-object v15, v0, Lj74;->w0:Lrh5;

    .line 163
    .line 164
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 165
    .line 166
    .line 167
    move-result-object v14

    .line 168
    invoke-virtual {v15, v14}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget v14, v0, Lj74;->j0:F

    .line 172
    .line 173
    iget v15, v1, Le74;->d:F

    .line 174
    .line 175
    sub-float/2addr v14, v15

    .line 176
    iput v14, v0, Lj74;->j0:F

    .line 177
    .line 178
    iget-object v14, v0, Lj74;->h0:Lrh5;

    .line 179
    .line 180
    invoke-virtual {v14, v1}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    const-string v14, "scrollOffset should be non-negative"

    .line 184
    .line 185
    if-eqz p3, :cond_a

    .line 186
    .line 187
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    int-to-float v0, v5

    .line 191
    cmpl-float v0, v0, v10

    .line 192
    .line 193
    if-ltz v0, :cond_9

    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_9
    invoke-static {v14}, Lzc3;->c(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :goto_6
    iget-object v0, v9, Lwg;->c:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, Loh5;

    .line 202
    .line 203
    invoke-virtual {v0, v5}, Loh5;->m(I)V

    .line 204
    .line 205
    .line 206
    move-object/from16 v19, v8

    .line 207
    .line 208
    goto/16 :goto_e

    .line 209
    .line 210
    :cond_a
    invoke-static {v3}, Lwv0;->t0(Ljava/util/List;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v15

    .line 214
    check-cast v15, Lf74;

    .line 215
    .line 216
    invoke-static {v3}, Lwv0;->B0(Ljava/util/List;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v16

    .line 220
    move-object/from16 v13, v16

    .line 221
    .line 222
    check-cast v13, Lf74;

    .line 223
    .line 224
    const-wide/16 v17, -0x1

    .line 225
    .line 226
    if-eqz v15, :cond_b

    .line 227
    .line 228
    iget v15, v15, Lf74;->a:I

    .line 229
    .line 230
    move-object/from16 v19, v8

    .line 231
    .line 232
    int-to-long v7, v15

    .line 233
    goto :goto_7

    .line 234
    :cond_b
    move-object/from16 v19, v8

    .line 235
    .line 236
    move-wide/from16 v7, v17

    .line 237
    .line 238
    :goto_7
    const-string v15, "firstVisibleItem:index"

    .line 239
    .line 240
    invoke-static {v7, v8, v15}, Lwa;->O(JLjava/lang/String;)V

    .line 241
    .line 242
    .line 243
    if-eqz v13, :cond_c

    .line 244
    .line 245
    iget v7, v13, Lf74;->a:I

    .line 246
    .line 247
    int-to-long v7, v7

    .line 248
    goto :goto_8

    .line 249
    :cond_c
    move-wide/from16 v7, v17

    .line 250
    .line 251
    :goto_8
    const-string v13, "lastVisibleItem:index"

    .line 252
    .line 253
    invoke-static {v7, v8, v13}, Lwa;->O(JLjava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    if-eqz v6, :cond_d

    .line 260
    .line 261
    iget-object v7, v6, Lf74;->i:Ljava/lang/Object;

    .line 262
    .line 263
    goto :goto_9

    .line 264
    :cond_d
    move-object v7, v11

    .line 265
    :goto_9
    iput-object v7, v9, Lwg;->d:Ljava/lang/Object;

    .line 266
    .line 267
    iget-boolean v7, v9, Lwg;->a:Z

    .line 268
    .line 269
    if-nez v7, :cond_e

    .line 270
    .line 271
    if-lez v4, :cond_11

    .line 272
    .line 273
    :cond_e
    iput-boolean v12, v9, Lwg;->a:Z

    .line 274
    .line 275
    int-to-float v7, v5

    .line 276
    cmpl-float v7, v7, v10

    .line 277
    .line 278
    if-ltz v7, :cond_f

    .line 279
    .line 280
    goto :goto_a

    .line 281
    :cond_f
    invoke-static {v14}, Lzc3;->c(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    :goto_a
    if-eqz v6, :cond_10

    .line 285
    .line 286
    iget v6, v6, Lf74;->a:I

    .line 287
    .line 288
    goto :goto_b

    .line 289
    :cond_10
    const/4 v6, 0x0

    .line 290
    :goto_b
    invoke-virtual {v9, v6, v5}, Lwg;->B(II)V

    .line 291
    .line 292
    .line 293
    :cond_11
    iget-boolean v5, v0, Lj74;->l0:Z

    .line 294
    .line 295
    if-eqz v5, :cond_17

    .line 296
    .line 297
    iget-object v5, v0, Lj74;->X:Lhf1;

    .line 298
    .line 299
    iget v6, v5, Lhf1;->a:I

    .line 300
    .line 301
    iget-boolean v7, v5, Lhf1;->c:Z

    .line 302
    .line 303
    const/4 v8, -0x1

    .line 304
    if-eq v6, v8, :cond_13

    .line 305
    .line 306
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 307
    .line 308
    .line 309
    move-result v9

    .line 310
    if-nez v9, :cond_13

    .line 311
    .line 312
    invoke-static {v1, v7}, Lhf1;->a(Le74;Z)I

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    if-eq v6, v7, :cond_13

    .line 317
    .line 318
    iput v8, v5, Lhf1;->a:I

    .line 319
    .line 320
    iget-object v6, v5, Lhf1;->b:Lo64;

    .line 321
    .line 322
    if-eqz v6, :cond_12

    .line 323
    .line 324
    invoke-interface {v6}, Lo64;->cancel()V

    .line 325
    .line 326
    .line 327
    :cond_12
    iput-object v11, v5, Lhf1;->b:Lo64;

    .line 328
    .line 329
    :cond_13
    iget v6, v5, Lhf1;->d:I

    .line 330
    .line 331
    if-eq v6, v8, :cond_16

    .line 332
    .line 333
    iget v7, v5, Lhf1;->e:F

    .line 334
    .line 335
    cmpg-float v7, v7, v10

    .line 336
    .line 337
    if-nez v7, :cond_14

    .line 338
    .line 339
    goto :goto_d

    .line 340
    :cond_14
    if-eq v6, v4, :cond_16

    .line 341
    .line 342
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    if-nez v3, :cond_16

    .line 347
    .line 348
    iget v3, v5, Lhf1;->e:F

    .line 349
    .line 350
    cmpg-float v3, v3, v10

    .line 351
    .line 352
    if-gez v3, :cond_15

    .line 353
    .line 354
    goto :goto_c

    .line 355
    :cond_15
    const/4 v12, 0x0

    .line 356
    :goto_c
    invoke-static {v1, v12}, Lhf1;->a(Le74;Z)I

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    if-ltz v3, :cond_16

    .line 361
    .line 362
    if-ge v3, v4, :cond_16

    .line 363
    .line 364
    iput v3, v5, Lhf1;->a:I

    .line 365
    .line 366
    iget-object v0, v0, Lj74;->s0:Lvk1;

    .line 367
    .line 368
    invoke-static {v0, v3}, Lvk1;->G(Lvk1;I)Lo64;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    iput-object v0, v5, Lhf1;->b:Lo64;

    .line 373
    .line 374
    :cond_16
    :goto_d
    iput v4, v5, Lhf1;->d:I

    .line 375
    .line 376
    :cond_17
    :goto_e
    if-eqz p2, :cond_1c

    .line 377
    .line 378
    iget v0, v1, Le74;->f:F

    .line 379
    .line 380
    iget-object v3, v1, Le74;->i:Lfi1;

    .line 381
    .line 382
    iget-object v1, v1, Le74;->h:Lb71;

    .line 383
    .line 384
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    const/high16 v4, 0x3f800000    # 1.0f

    .line 388
    .line 389
    invoke-interface {v3, v4}, Lfi1;->h0(F)F

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    cmpg-float v3, v0, v3

    .line 394
    .line 395
    if-gtz v3, :cond_18

    .line 396
    .line 397
    goto :goto_13

    .line 398
    :cond_18
    invoke-static {}, Lyn0;->D()Ldd7;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    if-eqz v3, :cond_19

    .line 403
    .line 404
    invoke-virtual {v3}, Ldd7;->e()Lgn2;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    goto :goto_f

    .line 409
    :cond_19
    move-object v4, v11

    .line 410
    :goto_f
    invoke-static {v3}, Lyn0;->P(Ldd7;)Ldd7;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    move-object/from16 v6, v19

    .line 415
    .line 416
    :try_start_1
    iget-object v7, v6, Lzz2;->Z:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v7, Lqk;

    .line 419
    .line 420
    iget-object v7, v7, Lqk;->Y:Lrh5;

    .line 421
    .line 422
    invoke-virtual {v7}, Lrh5;->getValue()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v7

    .line 426
    check-cast v7, Ljava/lang/Number;

    .line 427
    .line 428
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 429
    .line 430
    .line 431
    move-result v7

    .line 432
    iget-object v8, v6, Lzz2;->Y:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v8, Log7;

    .line 435
    .line 436
    if-eqz v8, :cond_1a

    .line 437
    .line 438
    invoke-virtual {v8, v11}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 439
    .line 440
    .line 441
    goto :goto_10

    .line 442
    :catchall_1
    move-exception v0

    .line 443
    goto :goto_12

    .line 444
    :cond_1a
    :goto_10
    iget-object v8, v6, Lzz2;->Z:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v8, Lqk;

    .line 447
    .line 448
    iget-boolean v9, v8, Lqk;->h0:Z

    .line 449
    .line 450
    if-eqz v9, :cond_1b

    .line 451
    .line 452
    sub-float/2addr v7, v0

    .line 453
    const/16 v0, 0x1e

    .line 454
    .line 455
    invoke-static {v8, v7, v10, v0}, Lz68;->u(Lqk;FFI)Lqk;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    iput-object v0, v6, Lzz2;->Z:Ljava/lang/Object;

    .line 460
    .line 461
    goto :goto_11

    .line 462
    :cond_1b
    new-instance v7, Lqk;

    .line 463
    .line 464
    neg-float v0, v0

    .line 465
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    const/16 v8, 0x3c

    .line 470
    .line 471
    invoke-direct {v7, v2, v0, v11, v8}, Lqk;-><init>(Lug8;Ljava/lang/Object;Lwk;I)V

    .line 472
    .line 473
    .line 474
    iput-object v7, v6, Lzz2;->Z:Ljava/lang/Object;

    .line 475
    .line 476
    :goto_11
    new-instance v0, Lr5;

    .line 477
    .line 478
    const/16 v2, 0x11

    .line 479
    .line 480
    invoke-direct {v0, v6, v11, v2}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 481
    .line 482
    .line 483
    const/4 v2, 0x3

    .line 484
    invoke-static {v1, v11, v11, v0, v2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    iput-object v0, v6, Lzz2;->Y:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 489
    .line 490
    invoke-static {v3, v5, v4}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 491
    .line 492
    .line 493
    goto :goto_13

    .line 494
    :goto_12
    invoke-static {v3, v5, v4}, Lyn0;->c0(Ldd7;Ldd7;Lgn2;)V

    .line 495
    .line 496
    .line 497
    throw v0

    .line 498
    :cond_1c
    :goto_13
    return-void
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lj74;->k0:Lfu6;

    .line 2
    .line 3
    invoke-virtual {p0}, Lfu6;->b()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c()I
    .locals 0

    .line 1
    iget-object p0, p0, Lj74;->g0:Lwg;

    .line 2
    .line 3
    iget-object p0, p0, Lwg;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Loh5;

    .line 6
    .line 7
    invoke-virtual {p0}, Loh5;->l()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final d()Le74;
    .locals 0

    .line 1
    iget-object p0, p0, Lj74;->h0:Lrh5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Le74;

    .line 8
    .line 9
    return-object p0
.end method

.method public final e(FLe74;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lj74;->l0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p2, Le74;->l:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Lj74;->X:Lhf1;

    .line 12
    .line 13
    if-nez v0, :cond_5

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    cmpg-float v0, p1, v0

    .line 17
    .line 18
    if-gez v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-static {p2, v0}, Lhf1;->a(Le74;Z)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-ltz v2, :cond_5

    .line 28
    .line 29
    iget v3, p2, Le74;->o:I

    .line 30
    .line 31
    if-ge v2, v3, :cond_5

    .line 32
    .line 33
    iget v3, v1, Lhf1;->a:I

    .line 34
    .line 35
    if-eq v2, v3, :cond_3

    .line 36
    .line 37
    iget-boolean v3, v1, Lhf1;->c:Z

    .line 38
    .line 39
    if-eq v3, v0, :cond_2

    .line 40
    .line 41
    const/4 v3, -0x1

    .line 42
    iput v3, v1, Lhf1;->a:I

    .line 43
    .line 44
    iget-object v3, v1, Lhf1;->b:Lo64;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    invoke-interface {v3}, Lo64;->cancel()V

    .line 49
    .line 50
    .line 51
    :cond_1
    const/4 v3, 0x0

    .line 52
    iput-object v3, v1, Lhf1;->b:Lo64;

    .line 53
    .line 54
    :cond_2
    iput-boolean v0, v1, Lhf1;->c:Z

    .line 55
    .line 56
    iput v2, v1, Lhf1;->a:I

    .line 57
    .line 58
    iget-object p0, p0, Lj74;->s0:Lvk1;

    .line 59
    .line 60
    invoke-static {p0, v2}, Lvk1;->G(Lvk1;I)Lo64;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iput-object p0, v1, Lhf1;->b:Lo64;

    .line 65
    .line 66
    :cond_3
    iget-object p0, p2, Le74;->l:Ljava/util/List;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-static {p0}, Lwv0;->A0(Ljava/util/List;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Lf74;

    .line 75
    .line 76
    iget v0, p2, Le74;->r:I

    .line 77
    .line 78
    iget v2, p0, Lf74;->m:I

    .line 79
    .line 80
    iget p0, p0, Lf74;->n:I

    .line 81
    .line 82
    add-int/2addr v2, p0

    .line 83
    add-int/2addr v2, v0

    .line 84
    iget p0, p2, Le74;->n:I

    .line 85
    .line 86
    sub-int/2addr v2, p0

    .line 87
    int-to-float p0, v2

    .line 88
    neg-float p2, p1

    .line 89
    cmpg-float p0, p0, p2

    .line 90
    .line 91
    if-gez p0, :cond_5

    .line 92
    .line 93
    iget-object p0, v1, Lhf1;->b:Lo64;

    .line 94
    .line 95
    if-eqz p0, :cond_5

    .line 96
    .line 97
    invoke-interface {p0}, Lo64;->g()V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-static {p0}, Lwv0;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    check-cast p0, Lf74;

    .line 106
    .line 107
    iget p2, p2, Le74;->m:I

    .line 108
    .line 109
    iget p0, p0, Lf74;->m:I

    .line 110
    .line 111
    sub-int/2addr p2, p0

    .line 112
    int-to-float p0, p2

    .line 113
    cmpg-float p0, p0, p1

    .line 114
    .line 115
    if-gez p0, :cond_5

    .line 116
    .line 117
    iget-object p0, v1, Lhf1;->b:Lo64;

    .line 118
    .line 119
    if-eqz p0, :cond_5

    .line 120
    .line 121
    invoke-interface {p0}, Lo64;->g()V

    .line 122
    .line 123
    .line 124
    :cond_5
    :goto_1
    iput p1, v1, Lhf1;->e:F

    .line 125
    .line 126
    :cond_6
    return-void
.end method

.method public final i(Lf15;Lrn2;Lq51;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lh74;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lh74;

    .line 11
    .line 12
    iget v3, v2, Lh74;->j0:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lh74;->j0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lh74;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lh74;-><init>(Lj74;Lq51;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lh74;->h0:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Lh74;->j0:I

    .line 32
    .line 33
    sget-object v4, Ldn8;->a:Ldn8;

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x1

    .line 38
    sget-object v8, Lc71;->X:Lc71;

    .line 39
    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    if-eq v3, v7, :cond_2

    .line 43
    .line 44
    if-ne v3, v5, :cond_1

    .line 45
    .line 46
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-object v4

    .line 50
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v6

    .line 56
    :cond_2
    iget-object v3, v2, Lh74;->g0:Luy7;

    .line 57
    .line 58
    check-cast v3, Lrn2;

    .line 59
    .line 60
    iget-object v7, v2, Lh74;->f0:Lf15;

    .line 61
    .line 62
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object v1, v7

    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :cond_3
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v1, v0, Lj74;->h0:Lrh5;

    .line 72
    .line 73
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    sget-object v3, Ll74;->a:Le74;

    .line 78
    .line 79
    if-ne v1, v3, :cond_a

    .line 80
    .line 81
    move-object/from16 v1, p1

    .line 82
    .line 83
    iput-object v1, v2, Lh74;->f0:Lf15;

    .line 84
    .line 85
    move-object/from16 v3, p2

    .line 86
    .line 87
    check-cast v3, Luy7;

    .line 88
    .line 89
    iput-object v3, v2, Lh74;->g0:Luy7;

    .line 90
    .line 91
    iput v7, v2, Lh74;->j0:I

    .line 92
    .line 93
    iget-object v3, v0, Lj74;->o0:Ld00;

    .line 94
    .line 95
    iget-object v9, v3, Ld00;->Y:Lux0;

    .line 96
    .line 97
    if-nez v9, :cond_8

    .line 98
    .line 99
    new-instance v9, Lux0;

    .line 100
    .line 101
    invoke-direct {v9}, Lux0;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v9, v3, Ld00;->Y:Lux0;

    .line 105
    .line 106
    iget-object v3, v3, Ld00;->X:Lc00;

    .line 107
    .line 108
    if-eqz v3, :cond_8

    .line 109
    .line 110
    iget-boolean v10, v3, Ljx4;->p0:Z

    .line 111
    .line 112
    if-eqz v10, :cond_8

    .line 113
    .line 114
    iget-object v10, v3, Lc00;->r0:Ld00;

    .line 115
    .line 116
    new-instance v11, Lp0;

    .line 117
    .line 118
    const/4 v12, 0x5

    .line 119
    invoke-direct {v11, v3, v10, v12}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 120
    .line 121
    .line 122
    invoke-static {v3}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    iget v12, v10, Landroidx/compose/ui/node/LayoutNode;->Y:I

    .line 127
    .line 128
    invoke-static {v10}, Lq34;->a(Landroidx/compose/ui/node/LayoutNode;)Lmf5;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    invoke-interface {v10}, Lmf5;->getRectManager()Lu86;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    iget-object v13, v10, Lu86;->d:Lu98;

    .line 137
    .line 138
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object v14, v13, Lu98;->a:Lvz4;

    .line 142
    .line 143
    new-instance v15, Lt98;

    .line 144
    .line 145
    invoke-direct {v15, v13, v12, v3, v11}, Lt98;-><init>(Lu98;ILc00;Lp0;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v14, v12}, Lff3;->b(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v11

    .line 152
    if-nez v11, :cond_4

    .line 153
    .line 154
    invoke-virtual {v14, v12, v15}, Lvz4;->h(ILjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    move-object v11, v15

    .line 158
    :cond_4
    check-cast v11, Lt98;

    .line 159
    .line 160
    if-eq v11, v15, :cond_6

    .line 161
    .line 162
    :goto_1
    iget-object v12, v11, Lt98;->d:Lt98;

    .line 163
    .line 164
    if-eqz v12, :cond_5

    .line 165
    .line 166
    move-object v11, v12

    .line 167
    goto :goto_1

    .line 168
    :cond_5
    iput-object v15, v11, Lt98;->d:Lt98;

    .line 169
    .line 170
    :cond_6
    iget-object v11, v3, Ljx4;->X:Ljx4;

    .line 171
    .line 172
    invoke-static {v11}, Lyn0;->Z(Lnh1;)Landroidx/compose/ui/node/LayoutNode;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    iget v12, v11, Landroidx/compose/ui/node/LayoutNode;->i0:I

    .line 177
    .line 178
    const/4 v13, -0x4

    .line 179
    if-eq v12, v13, :cond_7

    .line 180
    .line 181
    iget-object v12, v10, Lu86;->c:Lne;

    .line 182
    .line 183
    invoke-virtual {v10, v11}, Lu86;->d(Landroidx/compose/ui/node/LayoutNode;)I

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    iget-object v12, v12, Lne;->c:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v12, [J

    .line 190
    .line 191
    add-int/2addr v11, v5

    .line 192
    aget-wide v13, v12, v11

    .line 193
    .line 194
    const-wide v16, 0x6fffffffffffffffL    # 3.1050361846014175E231

    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    and-long v13, v13, v16

    .line 200
    .line 201
    const-wide/high16 v16, -0x7000000000000000L

    .line 202
    .line 203
    or-long v13, v13, v16

    .line 204
    .line 205
    aput-wide v13, v12, v11

    .line 206
    .line 207
    :cond_7
    iput-boolean v7, v10, Lu86;->f:Z

    .line 208
    .line 209
    invoke-virtual {v10}, Lu86;->j()V

    .line 210
    .line 211
    .line 212
    iput-object v15, v3, Lc00;->q0:Lt98;

    .line 213
    .line 214
    :cond_8
    invoke-virtual {v9, v2}, Lrm3;->h(Lq51;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    if-ne v3, v8, :cond_9

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_9
    move-object v3, v4

    .line 222
    :goto_2
    if-ne v3, v8, :cond_b

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_a
    move-object/from16 v1, p1

    .line 226
    .line 227
    :cond_b
    move-object/from16 v3, p2

    .line 228
    .line 229
    :goto_3
    iput-object v6, v2, Lh74;->f0:Lf15;

    .line 230
    .line 231
    iput-object v6, v2, Lh74;->g0:Luy7;

    .line 232
    .line 233
    iput v5, v2, Lh74;->j0:I

    .line 234
    .line 235
    iget-object v0, v0, Lj74;->k0:Lfu6;

    .line 236
    .line 237
    invoke-virtual {v0, v1, v3, v2}, Lfu6;->i(Lf15;Lrn2;Lq51;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    if-ne v0, v8, :cond_c

    .line 242
    .line 243
    :goto_4
    return-object v8

    .line 244
    :cond_c
    return-object v4
.end method

.method public final j()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lj74;->x0:Lrh5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final m()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lj74;->w0:Lrh5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final n(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lj74;->k0:Lfu6;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lfu6;->n(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final o()Ltx6;
    .locals 0

    .line 1
    iget-object p0, p0, Lj74;->t0:Lq02;

    .line 2
    .line 3
    return-object p0
.end method
