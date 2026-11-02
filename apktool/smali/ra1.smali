.class public final Lra1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:Lo15;

.field public final synthetic b:Laa6;

.field public final synthetic c:Lea6;

.field public final synthetic d:Lib1;


# direct methods
.method public constructor <init>(Lo15;Laa6;Lea6;Lib1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lra1;->a:Lo15;

    .line 5
    .line 6
    iput-object p2, p0, Lra1;->b:Laa6;

    .line 7
    .line 8
    iput-object p3, p0, Lra1;->c:Lea6;

    .line 9
    .line 10
    iput-object p4, p0, Lra1;->d:Lib1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lia1;Ls51;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lqa1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lqa1;

    .line 7
    .line 8
    iget v1, v0, Lqa1;->m0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lqa1;->m0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lqa1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lqa1;-><init>(Lra1;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lqa1;->k0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lqa1;->m0:I

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    const/4 v3, 0x2

    .line 31
    const/4 v4, 0x1

    .line 32
    const/4 v5, 0x0

    .line 33
    sget-object v6, Lc71;->X:Lc71;

    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    if-eq v1, v4, :cond_3

    .line 38
    .line 39
    if-eq v1, v3, :cond_2

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    iget-object p0, v0, Lqa1;->h0:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p1, v0, Lqa1;->g0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lea6;

    .line 48
    .line 49
    iget-object v0, v0, Lqa1;->f0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lo15;

    .line 52
    .line 53
    :try_start_0
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :catchall_0
    move-exception p0

    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v5

    .line 67
    :cond_2
    iget-object p0, v0, Lqa1;->h0:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, Lib1;

    .line 70
    .line 71
    iget-object p1, v0, Lqa1;->g0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Lea6;

    .line 74
    .line 75
    iget-object v1, v0, Lqa1;->f0:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Lo15;

    .line 78
    .line 79
    :try_start_1
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :catchall_1
    move-exception p0

    .line 84
    move-object v0, v1

    .line 85
    goto/16 :goto_6

    .line 86
    .line 87
    :cond_3
    iget-object p0, v0, Lqa1;->j0:Lib1;

    .line 88
    .line 89
    iget-object p1, v0, Lqa1;->i0:Lea6;

    .line 90
    .line 91
    iget-object v1, v0, Lqa1;->h0:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v1, Laa6;

    .line 94
    .line 95
    iget-object v4, v0, Lqa1;->g0:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v4, Lo15;

    .line 98
    .line 99
    iget-object v7, v0, Lqa1;->f0:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v7, Lrn2;

    .line 102
    .line 103
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object p2, v7

    .line 107
    move-object v7, p1

    .line 108
    move-object p1, p2

    .line 109
    move-object p2, v4

    .line 110
    goto :goto_1

    .line 111
    :cond_4
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iput-object p1, v0, Lqa1;->f0:Ljava/lang/Object;

    .line 115
    .line 116
    iget-object p2, p0, Lra1;->a:Lo15;

    .line 117
    .line 118
    iput-object p2, v0, Lqa1;->g0:Ljava/lang/Object;

    .line 119
    .line 120
    iget-object v1, p0, Lra1;->b:Laa6;

    .line 121
    .line 122
    iput-object v1, v0, Lqa1;->h0:Ljava/lang/Object;

    .line 123
    .line 124
    iget-object v7, p0, Lra1;->c:Lea6;

    .line 125
    .line 126
    iput-object v7, v0, Lqa1;->i0:Lea6;

    .line 127
    .line 128
    iget-object p0, p0, Lra1;->d:Lib1;

    .line 129
    .line 130
    iput-object p0, v0, Lqa1;->j0:Lib1;

    .line 131
    .line 132
    iput v4, v0, Lqa1;->m0:I

    .line 133
    .line 134
    invoke-interface {p2, v0}, Lo15;->g(Lq51;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    if-ne v4, v6, :cond_5

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    :goto_1
    :try_start_2
    iget-boolean v1, v1, Laa6;->X:Z

    .line 142
    .line 143
    if-nez v1, :cond_9

    .line 144
    .line 145
    iget-object v1, v7, Lea6;->X:Ljava/lang/Object;

    .line 146
    .line 147
    iput-object p2, v0, Lqa1;->f0:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v7, v0, Lqa1;->g0:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object p0, v0, Lqa1;->h0:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object v5, v0, Lqa1;->i0:Lea6;

    .line 154
    .line 155
    iput-object v5, v0, Lqa1;->j0:Lib1;

    .line 156
    .line 157
    iput v3, v0, Lqa1;->m0:I

    .line 158
    .line 159
    invoke-interface {p1, v1, v0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 163
    if-ne p1, v6, :cond_6

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_6
    move-object v1, p2

    .line 167
    move-object p2, p1

    .line 168
    move-object p1, v7

    .line 169
    :goto_2
    :try_start_3
    iget-object v3, p1, Lea6;->X:Ljava/lang/Object;

    .line 170
    .line 171
    invoke-static {p2, v3}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-nez v3, :cond_8

    .line 176
    .line 177
    iput-object v1, v0, Lqa1;->f0:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object p1, v0, Lqa1;->g0:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object p2, v0, Lqa1;->h0:Ljava/lang/Object;

    .line 182
    .line 183
    iput v2, v0, Lqa1;->m0:I

    .line 184
    .line 185
    const/4 v2, 0x0

    .line 186
    invoke-virtual {p0, p2, v2, v0}, Lib1;->h(Ljava/lang/Object;ZLs51;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 190
    if-ne p0, v6, :cond_7

    .line 191
    .line 192
    :goto_3
    return-object v6

    .line 193
    :cond_7
    move-object p0, p2

    .line 194
    move-object v0, v1

    .line 195
    :goto_4
    :try_start_4
    iput-object p0, p1, Lea6;->X:Ljava/lang/Object;

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_8
    move-object v0, v1

    .line 199
    :goto_5
    iget-object p0, p1, Lea6;->X:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 200
    .line 201
    invoke-interface {v0, v5}, Lo15;->m(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    return-object p0

    .line 205
    :catchall_2
    move-exception p0

    .line 206
    move-object v0, p2

    .line 207
    goto :goto_6

    .line 208
    :cond_9
    :try_start_5
    const-string p0, "InitializerApi.updateData should not be called after initialization is complete."

    .line 209
    .line 210
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 211
    .line 212
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 216
    :goto_6
    invoke-interface {v0, v5}, Lo15;->m(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    throw p0
.end method
