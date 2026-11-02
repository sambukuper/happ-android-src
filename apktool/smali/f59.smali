.class public final synthetic Lf59;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lf59;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lf59;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lf59;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, Lf59;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lf59;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Lf59;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lun5;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    check-cast p1, Ljava/lang/Long;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v3, v4, v2}, Lun5;->d(JLjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :pswitch_0
    check-cast p0, Lh59;

    .line 30
    .line 31
    check-cast v2, Lzy0;

    .line 32
    .line 33
    check-cast p1, Lxz0;

    .line 34
    .line 35
    iget-boolean v0, p0, Lh59;->Z:Z

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1}, Lxz0;->d()Ld94;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v3, p1, Lxz0;->a:Landroid/view/View;

    .line 44
    .line 45
    invoke-interface {v0}, Ld94;->h()Lg94;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v2, p0, Lh59;->g0:Lzy0;

    .line 50
    .line 51
    iget-object v4, p0, Lh59;->f0:Lg94;

    .line 52
    .line 53
    if-nez v4, :cond_1

    .line 54
    .line 55
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {v3}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {p1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-nez p1, :cond_0

    .line 72
    .line 73
    new-instance p1, Lsc4;

    .line 74
    .line 75
    const/16 v2, 0x14

    .line 76
    .line 77
    invoke-direct {p1, p0, v0, v2}, Lsc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    iput-object v0, p0, Lh59;->f0:Lg94;

    .line 85
    .line 86
    invoke-virtual {v0, p0}, Lg94;->a(Lc94;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    iget-object v0, v0, Lg94;->i:Lo84;

    .line 91
    .line 92
    sget-object v3, Lo84;->Z:Lo84;

    .line 93
    .line 94
    invoke-virtual {v0, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-ltz v0, :cond_2

    .line 99
    .line 100
    iget-object v0, p0, Lh59;->Y:Lr01;

    .line 101
    .line 102
    new-instance v3, Lfh;

    .line 103
    .line 104
    const/16 v4, 0x18

    .line 105
    .line 106
    invoke-direct {v3, p0, p1, v2, v4}, Lfh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 107
    .line 108
    .line 109
    new-instance p0, Lzy0;

    .line 110
    .line 111
    const p1, -0x66c1ecc8

    .line 112
    .line 113
    .line 114
    const/4 v2, 0x1

    .line 115
    invoke-direct {p0, p1, v2, v3}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, p0}, Lr01;->A(Lrn2;)V

    .line 119
    .line 120
    .line 121
    :cond_2
    :goto_0
    return-object v1

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
