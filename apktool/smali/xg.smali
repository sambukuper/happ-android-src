.class public final synthetic Lxg;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lch;


# direct methods
.method public synthetic constructor <init>(Lch;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lxg;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lxg;->Y:Lch;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lxg;->X:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    sget-object v2, Ldn8;->a:Ldn8;

    .line 5
    .line 6
    iget-object p0, p0, Lxg;->Y:Lch;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Leq1;

    .line 12
    .line 13
    iget-object p1, p0, Lch;->e:Lxd7;

    .line 14
    .line 15
    invoke-virtual {p1}, Lxd7;->d()V

    .line 16
    .line 17
    .line 18
    new-instance p1, Ljd;

    .line 19
    .line 20
    invoke-direct {p1, p0, v1}, Ljd;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    iget-object p0, p0, Lch;->h:Landroid/view/ActionMode;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/ActionMode;->invalidateContentRect()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-object v2

    .line 32
    :pswitch_1
    iget-object p0, p0, Lch;->h:Landroid/view/ActionMode;

    .line 33
    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/ActionMode;->invalidate()V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-object v2

    .line 40
    :pswitch_2
    check-cast p1, Ldn2;

    .line 41
    .line 42
    iget-object p0, p0, Lch;->a:Landroid/view/View;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    const/4 v0, 0x0

    .line 56
    :goto_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    if-ne v0, v3, :cond_3

    .line 61
    .line 62
    invoke-interface {p1}, Ldn2;->invoke()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-eqz p0, :cond_4

    .line 71
    .line 72
    new-instance v0, Lpb;

    .line 73
    .line 74
    invoke-direct {v0, p1, v1}, Lpb;-><init>(Ldn2;B)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 78
    .line 79
    .line 80
    :cond_4
    :goto_1
    return-object v2

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
