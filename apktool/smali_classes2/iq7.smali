.class public final synthetic Liq7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic X:Lkq7;

.field public final synthetic Y:Lrv7;

.field public final synthetic Z:Lsu/happ/proxyutility/dto/SubscriptionItem;

.field public final synthetic f0:Landroidx/appcompat/widget/AppCompatImageButton;


# direct methods
.method public synthetic constructor <init>(Lkq7;Lrv7;Lsu/happ/proxyutility/dto/SubscriptionItem;Landroidx/appcompat/widget/AppCompatImageButton;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Liq7;->X:Lkq7;

    .line 5
    .line 6
    iput-object p2, p0, Liq7;->Y:Lrv7;

    .line 7
    .line 8
    iput-object p3, p0, Liq7;->Z:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 9
    .line 10
    iput-object p4, p0, Liq7;->f0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 7

    .line 1
    iget-object v3, p0, Liq7;->Z:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 2
    .line 3
    iget-object p1, p0, Liq7;->Y:Lrv7;

    .line 4
    .line 5
    iget-object v0, p1, Lrv7;->b:Lsu/happ/proxyutility/dto/ConfigGroupCache;

    .line 6
    .line 7
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/ConfigGroupCache;->c()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v4, Lsn;

    .line 12
    .line 13
    const/16 v0, 0x1d

    .line 14
    .line 15
    iget-object v1, p0, Liq7;->f0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 16
    .line 17
    iget-object p0, p0, Liq7;->X:Lkq7;

    .line 18
    .line 19
    invoke-direct {v4, v1, p0, p1, v0}, Lsn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    :try_start_0
    invoke-virtual {v1, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lkq7;->c:Lgv7;

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    move-object v1, p0

    .line 32
    check-cast v1, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object p0, v1, Landroidx/core/app/ComponentActivity;->X:Lg94;

    .line 38
    .line 39
    invoke-static {p0}, Lys0;->z(Lg94;)Lu84;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    new-instance v0, Lpi;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    const/16 v6, 0xd

    .line 47
    .line 48
    invoke-direct/range {v0 .. v6}, Lpi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x3

    .line 52
    invoke-static {p0, p1, v0, v1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    sget-object p1, Ldn8;->a:Ldn8;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    move-object p0, v0

    .line 60
    instance-of p1, p0, Ljava/lang/InterruptedException;

    .line 61
    .line 62
    if-nez p1, :cond_2

    .line 63
    .line 64
    instance-of p1, p0, Ljava/util/concurrent/CancellationException;

    .line 65
    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    new-instance p1, Lrj6;

    .line 69
    .line 70
    invoke-direct {p1, p0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    :cond_0
    :goto_0
    invoke-static {p1}, Lsj6;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-eqz p0, :cond_1

    .line 78
    .line 79
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {v4, p0}, Lsn;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    :cond_1
    const/4 p0, 0x1

    .line 85
    return p0

    .line 86
    :cond_2
    throw p0
.end method
