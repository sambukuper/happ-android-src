.class public final Ltd7;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Ly45;

.field public h0:Ljp0;

.field public i0:Ljava/lang/Object;

.field public j0:B

.field public synthetic k0:Ljava/lang/Object;

.field public final synthetic l0:Ldn2;


# direct methods
.method public constructor <init>(Ldn2;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltd7;->l0:Ldn2;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lze2;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Ltd7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ltd7;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ltd7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p0, Lc71;->X:Lc71;

    .line 17
    .line 18
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 1

    .line 1
    new-instance v0, Ltd7;

    .line 2
    .line 3
    iget-object p0, p0, Ltd7;->l0:Ldn2;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Ltd7;-><init>(Ldn2;Lq51;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, v0, Ltd7;->k0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, Ltd7;->j0:B

    .line 2
    .line 3
    iget-object v1, p0, Ltd7;->l0:Ldn2;

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
    if-eq v0, v4, :cond_0

    .line 14
    .line 15
    if-eq v0, v3, :cond_2

    .line 16
    .line 17
    if-ne v0, v2, :cond_1

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Ltd7;->i0:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v4, p0, Ltd7;->h0:Ljp0;

    .line 22
    .line 23
    iget-object v7, p0, Ltd7;->g0:Ly45;

    .line 24
    .line 25
    iget-object v8, p0, Ltd7;->k0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v8, Lze2;

    .line 28
    .line 29
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v5

    .line 42
    :cond_2
    iget-object v0, p0, Ltd7;->i0:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v4, p0, Ltd7;->h0:Ljp0;

    .line 45
    .line 46
    iget-object v7, p0, Ltd7;->g0:Ly45;

    .line 47
    .line 48
    iget-object v8, p0, Ltd7;->k0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v8, Lze2;

    .line 51
    .line 52
    :try_start_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Ltd7;->k0:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v8, p1

    .line 62
    check-cast v8, Lze2;

    .line 63
    .line 64
    new-instance v7, Ly45;

    .line 65
    .line 66
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance p1, Lna7;

    .line 70
    .line 71
    invoke-direct {p1}, Lna7;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p1, v7, Ly45;->X:Ljava/lang/Object;

    .line 75
    .line 76
    const/4 p1, 0x6

    .line 77
    invoke-static {v4, v5, v5, p1}, Lgv3;->b(ILl90;Lgn2;I)Lx90;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    :try_start_2
    invoke-virtual {v7, p1, v1}, Ly45;->M(Ljp0;Ldn2;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v8, p0, Ltd7;->k0:Ljava/lang/Object;

    .line 86
    .line 87
    iput-object v7, p0, Ltd7;->g0:Ly45;

    .line 88
    .line 89
    iput-object p1, p0, Ltd7;->h0:Ljp0;

    .line 90
    .line 91
    iput-object v0, p0, Ltd7;->i0:Ljava/lang/Object;

    .line 92
    .line 93
    iput-byte v4, p0, Ltd7;->j0:B

    .line 94
    .line 95
    invoke-interface {v8, v0, p0}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 99
    if-ne v4, v6, :cond_4

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    move-object v4, p1

    .line 103
    :cond_5
    :goto_0
    :try_start_3
    iput-object v8, p0, Ltd7;->k0:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v7, p0, Ltd7;->g0:Ly45;

    .line 106
    .line 107
    iput-object v4, p0, Ltd7;->h0:Ljp0;

    .line 108
    .line 109
    iput-object v0, p0, Ltd7;->i0:Ljava/lang/Object;

    .line 110
    .line 111
    iput-byte v3, p0, Ltd7;->j0:B

    .line 112
    .line 113
    invoke-interface {v4, p0}, Ljp0;->r(Lq51;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-ne p1, v6, :cond_6

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    :goto_1
    invoke-virtual {v7, v4, v1}, Ly45;->M(Ljp0;Ldn2;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {p1, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-nez v9, :cond_5

    .line 129
    .line 130
    iput-object v8, p0, Ltd7;->k0:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v7, p0, Ltd7;->g0:Ly45;

    .line 133
    .line 134
    iput-object v4, p0, Ltd7;->h0:Ljp0;

    .line 135
    .line 136
    iput-object p1, p0, Ltd7;->i0:Ljava/lang/Object;

    .line 137
    .line 138
    iput-byte v2, p0, Ltd7;->j0:B

    .line 139
    .line 140
    invoke-interface {v8, p1, p0}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 144
    if-ne v0, v6, :cond_7

    .line 145
    .line 146
    :goto_2
    return-object v6

    .line 147
    :cond_7
    move-object v0, p1

    .line 148
    goto :goto_0

    .line 149
    :catchall_1
    move-exception p0

    .line 150
    move-object v4, p1

    .line 151
    :goto_3
    iget-object p1, v7, Ly45;->X:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p1, Lcw0;

    .line 154
    .line 155
    if-eqz p1, :cond_8

    .line 156
    .line 157
    invoke-virtual {p1, v4}, Lcw0;->C0(Ljp0;)V

    .line 158
    .line 159
    .line 160
    :cond_8
    iget-object p1, v7, Ly45;->X:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p1, Lcw0;

    .line 163
    .line 164
    if-eqz p1, :cond_9

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_9
    const-string v0, "Called dispose on a manager that has been disposed of"

    .line 168
    .line 169
    invoke-static {v0}, Lwr5;->b(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :goto_4
    invoke-virtual {p1}, Lcw0;->r0()V

    .line 173
    .line 174
    .line 175
    iput-object v5, v7, Ly45;->X:Ljava/lang/Object;

    .line 176
    .line 177
    throw p0
.end method
