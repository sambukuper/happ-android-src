.class public final Lmp5;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Lo15;

.field public h0:Lop5;

.field public i0:B

.field public final synthetic j0:Lop5;

.field public final synthetic k0:Lrn2;


# direct methods
.method public constructor <init>(Lop5;Lrn2;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmp5;->j0:Lop5;

    .line 2
    .line 3
    iput-object p2, p0, Lmp5;->k0:Lrn2;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
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
    invoke-virtual {p0, p2, p1}, Lmp5;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lmp5;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lmp5;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 1

    .line 1
    new-instance p2, Lmp5;

    .line 2
    .line 3
    iget-object v0, p0, Lmp5;->j0:Lop5;

    .line 4
    .line 5
    iget-object p0, p0, Lmp5;->k0:Lrn2;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0, p1}, Lmp5;-><init>(Lop5;Lrn2;Lq51;)V

    .line 8
    .line 9
    .line 10
    return-object p2
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, Lmp5;->i0:B

    .line 2
    .line 3
    sget-object v1, Llx1;->Z:Llx1;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    sget-object v6, Lc71;->X:Lc71;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    if-eq v0, v4, :cond_2

    .line 14
    .line 15
    if-eq v0, v3, :cond_1

    .line 16
    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v5

    .line 29
    :cond_1
    iget-object v0, p0, Lmp5;->g0:Lo15;

    .line 30
    .line 31
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto/16 :goto_4

    .line 37
    .line 38
    :cond_2
    iget-object v0, p0, Lmp5;->h0:Lop5;

    .line 39
    .line 40
    iget-object v4, p0, Lmp5;->g0:Lo15;

    .line 41
    .line 42
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object p1, v4

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lmp5;->j0:Lop5;

    .line 51
    .line 52
    iget-object p1, v0, Lop5;->e:Lq15;

    .line 53
    .line 54
    iput-object p1, p0, Lmp5;->g0:Lo15;

    .line 55
    .line 56
    iput-object v0, p0, Lmp5;->h0:Lop5;

    .line 57
    .line 58
    iput-byte v4, p0, Lmp5;->i0:B

    .line 59
    .line 60
    invoke-virtual {p1, p0}, Lq15;->g(Lq51;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    if-ne v4, v6, :cond_4

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    :goto_0
    :try_start_1
    iget-object v4, v0, Lop5;->f:Landroid/view/textclassifier/TextClassifier;

    .line 68
    .line 69
    if-eqz v4, :cond_5

    .line 70
    .line 71
    invoke-interface {v4}, Landroid/view/textclassifier/TextClassifier;->isDestroyed()Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_7

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_1
    move-exception p0

    .line 79
    move-object v0, p1

    .line 80
    goto :goto_4

    .line 81
    :cond_5
    :goto_1
    sget-object v4, Lgx1;->Y:Lbe;

    .line 82
    .line 83
    const-wide/16 v7, 0x12c

    .line 84
    .line 85
    invoke-static {v7, v8, v1}, Lvj8;->m0(JLlx1;)J

    .line 86
    .line 87
    .line 88
    move-result-wide v7

    .line 89
    new-instance v4, Ll40;

    .line 90
    .line 91
    const/16 v9, 0x9

    .line 92
    .line 93
    invoke-direct {v4, v0, v5, v9}, Ll40;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 94
    .line 95
    .line 96
    iput-object p1, p0, Lmp5;->g0:Lo15;

    .line 97
    .line 98
    iput-object v5, p0, Lmp5;->h0:Lop5;

    .line 99
    .line 100
    iput-byte v3, p0, Lmp5;->i0:B

    .line 101
    .line 102
    invoke-static {v7, v8}, Lu70;->s0(J)J

    .line 103
    .line 104
    .line 105
    move-result-wide v7

    .line 106
    invoke-static {v7, v8, v4, p0}, La28;->x(JLrn2;Ls51;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 110
    if-ne v0, v6, :cond_6

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_6
    move-object v10, v0

    .line 114
    move-object v0, p1

    .line 115
    move-object p1, v10

    .line 116
    :goto_2
    :try_start_2
    invoke-static {p1}, Lkp5;->d(Ljava/lang/Object;)Landroid/view/textclassifier/TextClassifier;

    .line 117
    .line 118
    .line 119
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    move-object p1, v0

    .line 121
    :cond_7
    invoke-interface {p1, v5}, Lo15;->m(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    sget-object p1, Lgx1;->Y:Lbe;

    .line 125
    .line 126
    const-wide/16 v7, 0xc8

    .line 127
    .line 128
    invoke-static {v7, v8, v1}, Lvj8;->m0(JLlx1;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v0

    .line 132
    new-instance p1, Ljy2;

    .line 133
    .line 134
    iget-object v3, p0, Lmp5;->k0:Lrn2;

    .line 135
    .line 136
    const/16 v7, 0x13

    .line 137
    .line 138
    invoke-direct {p1, v4, v3, v5, v7}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 139
    .line 140
    .line 141
    iput-object v5, p0, Lmp5;->g0:Lo15;

    .line 142
    .line 143
    iput-object v5, p0, Lmp5;->h0:Lop5;

    .line 144
    .line 145
    iput-byte v2, p0, Lmp5;->i0:B

    .line 146
    .line 147
    invoke-static {v0, v1}, Lu70;->s0(J)J

    .line 148
    .line 149
    .line 150
    move-result-wide v0

    .line 151
    invoke-static {v0, v1, p1, p0}, La28;->x(JLrn2;Ls51;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    if-ne p0, v6, :cond_8

    .line 156
    .line 157
    :goto_3
    return-object v6

    .line 158
    :cond_8
    return-object p0

    .line 159
    :goto_4
    invoke-interface {v0, v5}, Lo15;->m(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    throw p0
.end method
