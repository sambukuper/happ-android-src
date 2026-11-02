.class public final synthetic Lrh;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:I

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Runnable;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lrh;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lrh;->Y:I

    .line 8
    .line 9
    iput-object p2, p0, Lrh;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 12
    iput-byte p3, p0, Lrh;->X:B

    iput-object p1, p0, Lrh;->Z:Ljava/lang/Object;

    iput p2, p0, Lrh;->Y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-byte v0, p0, Lrh;->X:B

    .line 2
    .line 3
    iget v1, p0, Lrh;->Y:I

    .line 4
    .line 5
    iget-object p0, p0, Lrh;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroid/content/Context;

    .line 11
    .line 12
    sget v0, Lfb8;->b:I

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/widget/Toast;->getView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    new-instance v2, Lfv6;

    .line 32
    .line 33
    invoke-direct {v2, p0}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, Lfb8;->a(Landroid/view/View;Lfv6;)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lfb8;

    .line 40
    .line 41
    invoke-direct {v1, p0, v0}, Lfb8;-><init>(Landroid/content/Context;Landroid/widget/Toast;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lfb8;->show()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_0
    check-cast p0, Lcom/google/android/material/button/MaterialButton;

    .line 49
    .line 50
    sget-object v0, Lcom/google/android/material/button/MaterialButton;->T0:[I

    .line 51
    .line 52
    invoke-virtual {p0, v1}, Lcom/google/android/material/button/MaterialButton;->setIconSize(I)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_1
    check-cast p0, Lxg0;

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Lxg0;->a(I)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_2
    check-cast p0, Ljava/util/function/IntConsumer;

    .line 63
    .line 64
    invoke-interface {p0, v1}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_3
    check-cast p0, Ljava/lang/Runnable;

    .line 69
    .line 70
    invoke-static {v1}, Landroid/os/Process;->setThreadPriority(I)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
