.class public final synthetic Lho0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lho0;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lho0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lho0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, Lho0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lio/sentry/android/replay/k0;

    .line 9
    .line 10
    sub-int/2addr p4, p2

    .line 11
    sub-int/2addr p5, p3

    .line 12
    sub-int/2addr p8, p6

    .line 13
    sub-int/2addr p9, p7

    .line 14
    if-ne p4, p8, :cond_0

    .line 15
    .line 16
    if-ne p5, p9, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-object p2, p0, Lio/sentry/android/replay/k0;->i0:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-static {p2}, Lwv0;->B0(Ljava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Landroid/view/View;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p2, 0x0

    .line 37
    :goto_0
    invoke-static {p1, p2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-nez p2, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/k0;->k(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    :goto_1
    return-void

    .line 51
    :pswitch_0
    check-cast p0, Landroidx/camera/view/PreviewView;

    .line 52
    .line 53
    sget p1, Landroidx/camera/view/PreviewView;->r0:I

    .line 54
    .line 55
    sub-int/2addr p4, p2

    .line 56
    sub-int/2addr p8, p6

    .line 57
    if-ne p4, p8, :cond_3

    .line 58
    .line 59
    sub-int/2addr p5, p3

    .line 60
    sub-int/2addr p9, p7

    .line 61
    if-eq p5, p9, :cond_4

    .line 62
    .line 63
    :cond_3
    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->a()V

    .line 64
    .line 65
    .line 66
    invoke-static {}, Ls08;->b()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->getViewPort()Lpx8;

    .line 70
    .line 71
    .line 72
    :cond_4
    return-void

    .line 73
    :pswitch_1
    check-cast p0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 74
    .line 75
    sub-int/2addr p4, p2

    .line 76
    sub-int/2addr p8, p6

    .line 77
    if-ne p4, p8, :cond_5

    .line 78
    .line 79
    sub-int/2addr p5, p3

    .line 80
    sub-int/2addr p9, p7

    .line 81
    if-eq p5, p9, :cond_6

    .line 82
    .line 83
    :cond_5
    new-instance p2, Lc1;

    .line 84
    .line 85
    const/16 p3, 0xa

    .line 86
    .line 87
    invoke-direct {p2, p0, p3}, Lc1;-><init>(Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 91
    .line 92
    .line 93
    :cond_6
    return-void

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
