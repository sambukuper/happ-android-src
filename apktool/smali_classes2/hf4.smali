.class public final Lhf4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Lla;

.field public final synthetic Y:Lb71;

.field public final synthetic Z:Ldn2;

.field public final synthetic f0:Lgn2;

.field public final synthetic g0:Llf4;


# direct methods
.method public constructor <init>(Lla;Lb71;Ldn2;Lgn2;Llf4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhf4;->X:Lla;

    .line 5
    .line 6
    iput-object p2, p0, Lhf4;->Y:Lb71;

    .line 7
    .line 8
    iput-object p3, p0, Lhf4;->Z:Ldn2;

    .line 9
    .line 10
    iput-object p4, p0, Lhf4;->f0:Lgn2;

    .line 11
    .line 12
    iput-object p5, p0, Lhf4;->g0:Llf4;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    check-cast p1, Lcx3;

    .line 2
    .line 3
    iget-object p1, p1, Lcx3;->a:Landroid/view/KeyEvent;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Lpu;->d(I)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    sget-wide v2, Lax3;->g:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Lax3;->a(JJ)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x3

    .line 24
    iget-object v7, p0, Lhf4;->Y:Lb71;

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x1

    .line 28
    const/4 v10, 0x2

    .line 29
    iget-object v11, p0, Lhf4;->X:Lla;

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-static {p1}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-ne v4, v10, :cond_0

    .line 38
    .line 39
    iget-object v4, v11, Lla;->d:Lrh5;

    .line 40
    .line 41
    invoke-virtual {v4}, Lrh5;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    sget-object v12, Ldv1;->X:Ldv1;

    .line 46
    .line 47
    if-ne v4, v12, :cond_0

    .line 48
    .line 49
    new-instance p0, Lgf4;

    .line 50
    .line 51
    invoke-direct {p0, v11, v8, v5}, Lgf4;-><init>(Lla;Lq51;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {v7, v8, p0, v6}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 55
    .line 56
    .line 57
    :goto_0
    move v5, v9

    .line 58
    goto :goto_1

    .line 59
    :cond_0
    invoke-static {v0, v1, v2, v3}, Lax3;->a(JJ)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    sget-object v3, Ldv1;->Y:Ldv1;

    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    invoke-static {p1}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-ne v2, v10, :cond_2

    .line 72
    .line 73
    iget-object v2, v11, Lla;->d:Lrh5;

    .line 74
    .line 75
    invoke-virtual {v2}, Lrh5;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-ne v2, v3, :cond_2

    .line 80
    .line 81
    iget-object p1, p0, Lhf4;->Z:Ldn2;

    .line 82
    .line 83
    if-eqz p1, :cond_1

    .line 84
    .line 85
    invoke-interface {p1}, Ldn2;->invoke()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_1
    iget-object p1, p0, Lhf4;->g0:Llf4;

    .line 89
    .line 90
    iget-object p1, p1, Llf4;->b:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    new-instance v0, Lyf4;

    .line 96
    .line 97
    invoke-direct {v0, p1}, Lyf4;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget-object p0, p0, Lhf4;->f0:Lgn2;

    .line 101
    .line 102
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    sget-wide v12, Lax3;->f:J

    .line 107
    .line 108
    invoke-static {v0, v1, v12, v13}, Lax3;->a(JJ)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-eqz p0, :cond_3

    .line 113
    .line 114
    invoke-static {p1}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-ne p0, v10, :cond_3

    .line 119
    .line 120
    iget-object p0, v11, Lla;->d:Lrh5;

    .line 121
    .line 122
    invoke-virtual {p0}, Lrh5;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v3, :cond_3

    .line 127
    .line 128
    new-instance p0, Lgf4;

    .line 129
    .line 130
    invoke-direct {p0, v11, v8, v9}, Lgf4;-><init>(Lla;Lq51;B)V

    .line 131
    .line 132
    .line 133
    invoke-static {v7, v8, p0, v6}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_3
    :goto_1
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0
.end method
