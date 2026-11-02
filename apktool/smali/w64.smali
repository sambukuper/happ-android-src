.class public final Lw64;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lw07;


# instance fields
.field public q0:Ldn2;

.field public r0:Ls64;

.field public s0:Lsd5;

.field public t0:Z

.field public u0:Ljx6;

.field public final v0:Lu64;

.field public w0:Lu64;


# direct methods
.method public constructor <init>(Ldn2;Ls64;Lsd5;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljx4;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw64;->q0:Ldn2;

    .line 5
    .line 6
    iput-object p2, p0, Lw64;->r0:Ls64;

    .line 7
    .line 8
    iput-object p3, p0, Lw64;->s0:Lsd5;

    .line 9
    .line 10
    iput-boolean p4, p0, Lw64;->t0:Z

    .line 11
    .line 12
    new-instance p1, Lu64;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p0, p2}, Lu64;-><init>(Lw64;B)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lw64;->v0:Lu64;

    .line 19
    .line 20
    invoke-virtual {p0}, Lw64;->Y0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final N0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final Y0()V
    .locals 4

    .line 1
    new-instance v0, Ljx6;

    .line 2
    .line 3
    new-instance v1, Lv64;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, Lv64;-><init>(Lw64;B)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Lv64;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-direct {v2, p0, v3}, Lv64;-><init>(Lw64;B)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Ljx6;-><init>(Ldn2;Ldn2;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lw64;->u0:Ljx6;

    .line 19
    .line 20
    iget-boolean v0, p0, Lw64;->t0:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Lu64;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, p0, v1}, Lu64;-><init>(Lw64;B)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    iput-object v0, p0, Lw64;->w0:Lu64;

    .line 33
    .line 34
    return-void
.end method

.method public final h(Lf17;)V
    .locals 7

    .line 1
    invoke-static {p1}, Ld17;->f(Lf17;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lw64;->v0:Lu64;

    .line 5
    .line 6
    sget-object v1, Lc17;->P:Le17;

    .line 7
    .line 8
    invoke-interface {p1, v1, v0}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lw64;->s0:Lsd5;

    .line 12
    .line 13
    iget-object v1, p0, Lw64;->u0:Ljx6;

    .line 14
    .line 15
    const-string v2, "scrollAxisRange"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    sget-object v4, Lsd5;->X:Lsd5;

    .line 19
    .line 20
    if-ne v0, v4, :cond_1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    sget-object v0, Lc17;->w:Le17;

    .line 25
    .line 26
    sget-object v2, Ld17;->a:[Lnw3;

    .line 27
    .line 28
    const/16 v4, 0xd

    .line 29
    .line 30
    aget-object v4, v2, v4

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v0, v1}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {v2}, Ldh3;->T(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v3

    .line 43
    :cond_1
    if-eqz v1, :cond_3

    .line 44
    .line 45
    sget-object v0, Lc17;->v:Le17;

    .line 46
    .line 47
    sget-object v2, Ld17;->a:[Lnw3;

    .line 48
    .line 49
    const/16 v4, 0xc

    .line 50
    .line 51
    aget-object v4, v2, v4

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, v0, v1}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    iget-object v0, p0, Lw64;->w0:Lu64;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    sget-object v1, Ls07;->f:Le17;

    .line 64
    .line 65
    new-instance v4, Lq3;

    .line 66
    .line 67
    invoke-direct {v4, v3, v0}, Lq3;-><init>(Ljava/lang/String;Lon2;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, v1, v4}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    new-instance v0, Lv64;

    .line 74
    .line 75
    const/4 v1, 0x2

    .line 76
    invoke-direct {v0, p0, v1}, Lv64;-><init>(Lw64;B)V

    .line 77
    .line 78
    .line 79
    sget-object v1, Ls07;->C:Le17;

    .line 80
    .line 81
    new-instance v4, Lq3;

    .line 82
    .line 83
    new-instance v5, Lt16;

    .line 84
    .line 85
    const/16 v6, 0x10

    .line 86
    .line 87
    invoke-direct {v5, v0, v6}, Lt16;-><init>(Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v4, v3, v5}, Lq3;-><init>(Ljava/lang/String;Lon2;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p1, v1, v4}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object p0, p0, Lw64;->r0:Ls64;

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    new-instance v0, Lsv0;

    .line 102
    .line 103
    iget-object p0, p0, Ls64;->a:Lzi1;

    .line 104
    .line 105
    invoke-virtual {p0}, Lzi1;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, Ljava/lang/Number;

    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    const/4 v1, 0x1

    .line 116
    invoke-direct {v0, p0, v1}, Lsv0;-><init>(II)V

    .line 117
    .line 118
    .line 119
    sget-object p0, Lc17;->f:Le17;

    .line 120
    .line 121
    const/16 v1, 0x18

    .line 122
    .line 123
    aget-object v1, v2, v1

    .line 124
    .line 125
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-interface {p1, p0, v0}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_3
    invoke-static {v2}, Ldh3;->T(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v3
.end method
