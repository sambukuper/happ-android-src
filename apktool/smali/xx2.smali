.class public final synthetic Lxx2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lsn2;


# instance fields
.field public final synthetic X:Lxz4;

.field public final synthetic Y:Ljb7;

.field public final synthetic Z:Lgn2;

.field public final synthetic f0:F

.field public final synthetic g0:Z


# direct methods
.method public synthetic constructor <init>(Lxz4;Ljb7;Lgn2;FZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxx2;->X:Lxz4;

    .line 5
    .line 6
    iput-object p2, p0, Lxx2;->Y:Ljb7;

    .line 7
    .line 8
    iput-object p3, p0, Lxx2;->Z:Lgn2;

    .line 9
    .line 10
    iput p4, p0, Lxx2;->f0:F

    .line 11
    .line 12
    iput-boolean p5, p0, Lxx2;->g0:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Lwb7;

    .line 2
    .line 3
    move-object v6, p2

    .line 4
    check-cast v6, Llp2;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p1, p2, 0x11

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    const/4 v8, 0x1

    .line 19
    const/16 v9, 0x10

    .line 20
    .line 21
    if-eq p1, v9, :cond_0

    .line 22
    .line 23
    move p1, v8

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p1, p3

    .line 26
    :goto_0
    and-int/2addr p2, v8

    .line 27
    invoke-virtual {v6, p2, p1}, Llp2;->N(IZ)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    sget-object p1, Lpz2;->i0:Lp50;

    .line 34
    .line 35
    invoke-static {p1, p3}, Lg80;->c(Lp50;Z)Lxr4;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-wide v0, v6, Llp2;->T:J

    .line 40
    .line 41
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    invoke-virtual {v6}, Llp2;->l()Lkl5;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v10, Lhx4;->X:Lhx4;

    .line 50
    .line 51
    invoke-static {v6, v10}, Lw45;->Q(Llp2;Lkx4;)Lkx4;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v2, Luz0;->j:Lpz2;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6}, Llp2;->Z()V

    .line 61
    .line 62
    .line 63
    iget-boolean v2, v6, Llp2;->S:Z

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-virtual {v6}, Llp2;->k()V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v6}, Llp2;->j0()V

    .line 72
    .line 73
    .line 74
    :goto_1
    sget-object v2, Lpz2;->B0:Ldx0;

    .line 75
    .line 76
    invoke-static {v2, v6, p1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget-object p1, Lpz2;->A0:Ldx0;

    .line 80
    .line 81
    invoke-static {p1, v6, v0}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    sget-object p2, Lpz2;->C0:Ldx0;

    .line 89
    .line 90
    invoke-static {p2, v6, p1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v6}, Lpn7;->l(Llp2;)V

    .line 94
    .line 95
    .line 96
    sget-object p1, Lpz2;->z0:Ldx0;

    .line 97
    .line 98
    invoke-static {p1, v6, v1}, Lpn7;->m(Lrn2;Llp2;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    sget-object v0, Lpb7;->a:Lpb7;

    .line 102
    .line 103
    const-wide/16 v4, 0x0

    .line 104
    .line 105
    const/high16 v7, 0x30000

    .line 106
    .line 107
    iget-object v1, p0, Lxx2;->X:Lxz4;

    .line 108
    .line 109
    const/4 v2, 0x0

    .line 110
    iget-object v3, p0, Lxx2;->Y:Ljb7;

    .line 111
    .line 112
    invoke-virtual/range {v0 .. v7}, Lpb7;->a(Lxz4;Lkx4;Ljb7;JLlp2;I)V

    .line 113
    .line 114
    .line 115
    iget p1, p0, Lxx2;->f0:F

    .line 116
    .line 117
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-object p2, p0, Lxx2;->Z:Lgn2;

    .line 122
    .line 123
    invoke-interface {p2, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v6}, Llp2;->K()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    sget-object v0, Lzz0;->a:Lbe;

    .line 134
    .line 135
    if-ne p2, v0, :cond_2

    .line 136
    .line 137
    new-instance p2, Ll4;

    .line 138
    .line 139
    invoke-direct {p2, v9}, Ll4;-><init>(B)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v6, p2}, Llp2;->g0(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_2
    check-cast p2, Lsn2;

    .line 146
    .line 147
    invoke-static {v10, p2}, Lz68;->q0(Lkx4;Lsn2;)Lkx4;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    iget-boolean p0, p0, Lxx2;->g0:Z

    .line 152
    .line 153
    invoke-static {p1, p0, p2, v6, p3}, Lu70;->r(Ljava/lang/String;ZLkx4;Llp2;I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v6, v8}, Llp2;->p(Z)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_3
    invoke-virtual {v6}, Llp2;->Q()V

    .line 161
    .line 162
    .line 163
    :goto_2
    sget-object p0, Ldn8;->a:Ldn8;

    .line 164
    .line 165
    return-object p0
.end method
