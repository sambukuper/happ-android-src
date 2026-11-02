.class public abstract Lm87;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lsg8;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lyx1;->a:Lb81;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0x12c

    .line 5
    .line 6
    invoke-static {v2, v1, v0}, Lwl7;->i0(IILxx1;)Lsg8;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lm87;->a:Lsg8;

    .line 11
    .line 12
    return-void
.end method

.method public static final a(Lzy0;Llp2;I)V
    .locals 13

    .line 1
    const v0, 0x3d9bae7c

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Llp2;->X(I)Llp2;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x13

    .line 8
    .line 9
    const/16 v1, 0x12

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    move v0, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v2

    .line 18
    :goto_0
    and-int/lit8 v1, p2, 0x1

    .line 19
    .line 20
    invoke-virtual {p1, v1, v0}, Llp2;->N(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    sget v0, La56;->m3c_bottom_sheet_drag_handle_description:I

    .line 27
    .line 28
    invoke-static {v0, p1}, Lw79;->B(ILlp2;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, Lpz2;->r0:Ln50;

    .line 33
    .line 34
    new-instance v4, Lr03;

    .line 35
    .line 36
    invoke-direct {v4, v1}, Lr03;-><init>(Ln50;)V

    .line 37
    .line 38
    .line 39
    sget-object v1, Lpz2;->Z:Lp50;

    .line 40
    .line 41
    invoke-static {v1, v2}, Lg80;->c(Lp50;Z)Lxr4;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {p1}, Lkm4;->I(Llp2;)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    invoke-virtual {p1}, Llp2;->l()Lkl5;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-static {p1, v4}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    sget-object v7, Luz0;->j:Lpz2;

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Llp2;->Z()V

    .line 63
    .line 64
    .line 65
    iget-boolean v7, p1, Llp2;->S:Z

    .line 66
    .line 67
    if-eqz v7, :cond_1

    .line 68
    .line 69
    invoke-virtual {p1}, Llp2;->k()V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-virtual {p1}, Llp2;->j0()V

    .line 74
    .line 75
    .line 76
    :goto_1
    sget-object v7, Lpz2;->B0:Ldx0;

    .line 77
    .line 78
    invoke-static {v7, p1, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object v1, Lpz2;->A0:Ldx0;

    .line 82
    .line 83
    invoke-static {v1, p1, v6}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    sget-object v1, Lpz2;->C0:Ldx0;

    .line 87
    .line 88
    iget-boolean v6, p1, Llp2;->S:Z

    .line 89
    .line 90
    if-nez v6, :cond_2

    .line 91
    .line 92
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    invoke-static {v6, v7}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-nez v6, :cond_3

    .line 105
    .line 106
    :cond_2
    invoke-static {v5, p1, v5, v1}, Lp61;->v(ILlp2;ILdx0;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    sget-object v1, Lpz2;->z0:Ldx0;

    .line 110
    .line 111
    invoke-static {v1, p1, v4}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    const/16 v1, 0x186

    .line 115
    .line 116
    const/4 v4, 0x2

    .line 117
    invoke-static {p1, v1, v4}, Lzb8;->a(Llp2;II)Lgc8;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    new-instance v1, Lmg1;

    .line 122
    .line 123
    invoke-direct {v1, v0, v3}, Lmg1;-><init>(Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    const v0, 0x7ac6d537

    .line 127
    .line 128
    .line 129
    invoke-static {v0, v1, p1}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    const/4 v0, 0x7

    .line 134
    invoke-static {p1, v2, v0}, Lec8;->e(Llp2;II)Ljc8;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    const/4 v9, 0x0

    .line 139
    const v12, 0x6000030

    .line 140
    .line 141
    .line 142
    const/4 v8, 0x0

    .line 143
    move-object v10, p0

    .line 144
    move-object v11, p1

    .line 145
    invoke-static/range {v5 .. v12}, Lec8;->c(Lnr5;Lzy0;Ljc8;Lkx4;ZLzy0;Llp2;I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v11, v3}, Llp2;->p(Z)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_4
    move-object v10, p0

    .line 153
    move-object v11, p1

    .line 154
    invoke-virtual {v11}, Llp2;->Q()V

    .line 155
    .line 156
    .line 157
    :goto_2
    invoke-virtual {v11}, Llp2;->r()Lj86;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-eqz p0, :cond_5

    .line 162
    .line 163
    new-instance p1, Lh8;

    .line 164
    .line 165
    const/16 v0, 0x9

    .line 166
    .line 167
    invoke-direct {p1, v10, p2, v0}, Lh8;-><init>(Lzy0;IB)V

    .line 168
    .line 169
    .line 170
    iput-object p1, p0, Lj86;->d:Lrn2;

    .line 171
    .line 172
    :cond_5
    return-void
.end method
