.class public final Lxh4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Lj74;

.field public final synthetic Y:Lb71;

.field public final synthetic Z:F


# direct methods
.method public constructor <init>(Lj74;Lb71;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxh4;->X:Lj74;

    .line 5
    .line 6
    iput-object p2, p0, Lxh4;->Y:Lb71;

    .line 7
    .line 8
    iput p3, p0, Lxh4;->Z:F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

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
    sget-wide v2, Lax3;->d:J

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
    iget-object v6, p0, Lxh4;->X:Lj74;

    .line 24
    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {v6}, Lj74;->j()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    invoke-static {v0, v1, v2, v3}, Lax3;->a(JJ)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/4 v3, 0x3

    .line 39
    iget-object v4, p0, Lxh4;->Y:Lb71;

    .line 40
    .line 41
    const/4 v7, 0x1

    .line 42
    const/4 v8, 0x0

    .line 43
    iget p0, p0, Lxh4;->Z:F

    .line 44
    .line 45
    const/4 v9, 0x2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-static {p1}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-ne v2, v9, :cond_1

    .line 53
    .line 54
    new-instance p1, Lwh4;

    .line 55
    .line 56
    invoke-direct {p1, v6, p0, v8, v5}, Lwh4;-><init>(Lj74;FLq51;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {v4, v8, p1, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 60
    .line 61
    .line 62
    :goto_0
    move v5, v7

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    sget-wide v10, Lax3;->e:J

    .line 65
    .line 66
    invoke-static {v0, v1, v10, v11}, Lax3;->a(JJ)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    invoke-static {p1}, Lw39;->S(Landroid/view/KeyEvent;)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-ne p1, v9, :cond_2

    .line 77
    .line 78
    new-instance p1, Lwh4;

    .line 79
    .line 80
    invoke-direct {p1, v6, p0, v8, v7}, Lwh4;-><init>(Lj74;FLq51;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {v4, v8, p1, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    :goto_1
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0
.end method
