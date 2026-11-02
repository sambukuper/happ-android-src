.class public final Ldc8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:F

.field public final synthetic Y:J

.field public final synthetic Z:Lzy0;


# direct methods
.method public constructor <init>(FJLzy0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ldc8;->X:F

    .line 5
    .line 6
    iput-wide p2, p0, Ldc8;->Y:J

    .line 7
    .line 8
    iput-object p4, p0, Ldc8;->Z:Lzy0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Llp2;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v2

    .line 19
    :goto_0
    and-int/2addr p2, v3

    .line 20
    invoke-virtual {p1, p2, v0}, Llp2;->N(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_4

    .line 25
    .line 26
    sget-object p2, Lec8;->a:Lig5;

    .line 27
    .line 28
    const/high16 p2, 0x41c00000    # 24.0f

    .line 29
    .line 30
    iget v0, p0, Ldc8;->X:F

    .line 31
    .line 32
    sget-object v1, Lhx4;->X:Lhx4;

    .line 33
    .line 34
    const/high16 v4, 0x42200000    # 40.0f

    .line 35
    .line 36
    const/16 v5, 0x8

    .line 37
    .line 38
    invoke-static {v1, v4, p2, v0, v5}, Landroidx/compose/foundation/layout/b;->j(Lkx4;FFFI)Lkx4;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    sget-object v0, Lec8;->a:Lig5;

    .line 43
    .line 44
    invoke-static {p2, v0}, Los4;->w(Lkx4;Lgg5;)Lkx4;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    sget-object v0, Lpz2;->Z:Lp50;

    .line 49
    .line 50
    invoke-static {v0, v2}, Lg80;->c(Lp50;Z)Lxr4;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {p1}, Lkm4;->I(Llp2;)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p1}, Llp2;->l()Lkl5;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {p1, p2}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    sget-object v4, Luz0;->j:Lpz2;

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Llp2;->Z()V

    .line 72
    .line 73
    .line 74
    iget-boolean v4, p1, Llp2;->S:Z

    .line 75
    .line 76
    if-eqz v4, :cond_1

    .line 77
    .line 78
    invoke-virtual {p1}, Llp2;->k()V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-virtual {p1}, Llp2;->j0()V

    .line 83
    .line 84
    .line 85
    :goto_1
    sget-object v4, Lpz2;->B0:Ldx0;

    .line 86
    .line 87
    invoke-static {v4, p1, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget-object v0, Lpz2;->A0:Ldx0;

    .line 91
    .line 92
    invoke-static {v0, p1, v2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget-object v0, Lpz2;->C0:Ldx0;

    .line 96
    .line 97
    iget-boolean v2, p1, Llp2;->S:Z

    .line 98
    .line 99
    if-nez v2, :cond_2

    .line 100
    .line 101
    invoke-virtual {p1}, Llp2;->K()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-static {v2, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-nez v2, :cond_3

    .line 114
    .line 115
    :cond_2
    invoke-static {v1, p1, v1, v0}, Lp61;->v(ILlp2;ILdx0;)V

    .line 116
    .line 117
    .line 118
    :cond_3
    sget-object v0, Lpz2;->z0:Ldx0;

    .line 119
    .line 120
    invoke-static {v0, p1, p2}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    sget-object p2, Lu15;->h:Lxj8;

    .line 124
    .line 125
    invoke-static {p2, p1}, Lyj8;->a(Lxj8;Llp2;)Lo88;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    sget-object v0, Lj41;->a:Lox1;

    .line 130
    .line 131
    new-instance v1, Ldw0;

    .line 132
    .line 133
    iget-wide v6, p0, Ldc8;->Y:J

    .line 134
    .line 135
    invoke-direct {v1, v6, v7}, Ldw0;-><init>(J)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    sget-object v1, Lu78;->a:Lox1;

    .line 143
    .line 144
    invoke-virtual {v1, p2}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    filled-new-array {v0, p2}, [Lt06;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    iget-object p0, p0, Ldc8;->Z:Lzy0;

    .line 153
    .line 154
    invoke-static {p2, p0, p1, v5}, Lmb6;->b([Lt06;Lrn2;Llp2;I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v3}, Llp2;->p(Z)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_4
    invoke-virtual {p1}, Llp2;->Q()V

    .line 162
    .line 163
    .line 164
    :goto_2
    sget-object p0, Ldn8;->a:Ldn8;

    .line 165
    .line 166
    return-object p0
.end method
