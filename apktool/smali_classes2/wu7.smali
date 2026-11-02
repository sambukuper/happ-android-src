.class public final Lwu7;
.super Lsn1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006"
    }
    d2 = {
        "Lwu7;",
        "Lsn1;",
        "<init>",
        "()V",
        "tu7",
        "uu7",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final y1:Lcom/google/gson/a;

.field public static final z1:Lm51;


# instance fields
.field public t1:Lyk2;

.field public final u1:Loh7;

.field public final v1:Ly5;

.field public w1:Luu7;

.field public final x1:Lvz7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/gson/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/gson/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwu7;->y1:Lcom/google/gson/a;

    .line 7
    .line 8
    invoke-static {}, Lpw7;->b()Low7;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Ltp1;->a:Lnf1;

    .line 13
    .line 14
    sget-object v1, Ldm4;->a:Lhv2;

    .line 15
    .line 16
    invoke-static {v0, v1}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lwu7;->z1:Lm51;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lsn1;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lwu7;->u1:Loh7;

    .line 10
    .line 11
    new-instance v0, Lzk3;

    .line 12
    .line 13
    const/16 v1, 0x16

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, Lzk3;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lzk3;

    .line 19
    .line 20
    const/16 v2, 0x17

    .line 21
    .line 22
    invoke-direct {v1, v0, v2}, Lzk3;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lw74;->Y:Lw74;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lx97;->P(Lw74;Ldn2;)Lg44;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-class v1, Lpu7;

    .line 32
    .line 33
    sget-object v2, Lyb6;->a:Lzb6;

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v2, Ldo1;

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    invoke-direct {v2, v0, v3}, Ldo1;-><init>(Lg44;B)V

    .line 43
    .line 44
    .line 45
    new-instance v3, Ldo1;

    .line 46
    .line 47
    const/4 v4, 0x5

    .line 48
    invoke-direct {v3, v0, v4}, Ldo1;-><init>(Lg44;B)V

    .line 49
    .line 50
    .line 51
    new-instance v4, Lc3;

    .line 52
    .line 53
    const/16 v5, 0x1d

    .line 54
    .line 55
    invoke-direct {v4, p0, v0, v5}, Lc3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Ly5;

    .line 59
    .line 60
    invoke-direct {v0, v1, v2, v4, v3}, Ly5;-><init>(Lzu3;Ldn2;Ldn2;Ldn2;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, Lwu7;->v1:Ly5;

    .line 64
    .line 65
    new-instance v0, Lhr5;

    .line 66
    .line 67
    const/16 v1, 0x1a

    .line 68
    .line 69
    invoke-direct {v0, p0, v1}, Lhr5;-><init>(Ljava/lang/Object;B)V

    .line 70
    .line 71
    .line 72
    new-instance v1, Lvz7;

    .line 73
    .line 74
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, Lwu7;->x1:Lvz7;

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final I(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsn1;->o1:Landroid/app/Dialog;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    new-instance p1, Landroid/view/WindowManager$LayoutParams;

    .line 15
    .line 16
    invoke-direct {p1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1, v0}, Landroid/view/WindowManager$LayoutParams;->copyFrom(Landroid/view/WindowManager$LayoutParams;)I

    .line 24
    .line 25
    .line 26
    const/4 v0, -0x1

    .line 27
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 28
    .line 29
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final T(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    .line 1
    new-instance p1, Landroid/app/AlertDialog$Builder;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqk2;->i()Landroidx/fragment/app/FragmentActivity;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget v0, Lp56;->AppThemeDialogFull:I

    .line 8
    .line 9
    invoke-direct {p1, p0, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public final Y()V
    .locals 3

    .line 1
    iget-object v0, p0, Lwu7;->v1:Ly5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly5;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lpu7;

    .line 8
    .line 9
    iget-object v0, v0, Lpu7;->b:Lvz7;

    .line 10
    .line 11
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ld27;

    .line 16
    .line 17
    iget-object v1, v0, Ld27;->c:Log7;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-virtual {v1, v2}, Lrm3;->m(Ljava/util/concurrent/CancellationException;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, v0, Ld27;->b:Loh7;

    .line 26
    .line 27
    :cond_1
    invoke-virtual {v0}, Loh7;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v2, v1

    .line 32
    check-cast v2, Lw17;

    .line 33
    .line 34
    sget-object v2, Lw17;->Z:Lw17;

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Loh7;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, v0, v0}, Lsn1;->R(ZZ)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final x(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lsn1;->x(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Luu7;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, Luu7;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object p1, v1

    .line 13
    :goto_0
    iput-object p1, p0, Lwu7;->w1:Luu7;

    .line 14
    .line 15
    iget-object p1, p0, Lwu7;->v1:Ly5;

    .line 16
    .line 17
    invoke-virtual {p1}, Ly5;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lpu7;

    .line 22
    .line 23
    new-instance v0, Llr5;

    .line 24
    .line 25
    const/16 v2, 0x12

    .line 26
    .line 27
    invoke-direct {v0, p0, v2}, Llr5;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lzw8;->a(Lxw8;)Ltu0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    new-instance v2, Lt17;

    .line 35
    .line 36
    const/16 v3, 0xb

    .line 37
    .line 38
    invoke-direct {v2, p1, v0, v1, v3}, Lt17;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x3

    .line 42
    invoke-static {p0, v1, v2, p1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final z(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lqk2;->l()Landroid/view/LayoutInflater;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget p2, Lyk2;->A0:I

    .line 9
    .line 10
    sget-object p2, Lx91;->a:Landroidx/databinding/DataBinderMapperImpl;

    .line 11
    .line 12
    sget p2, Lt46;->fragment_dialog_subscription_sync:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-static {p2, p1, v0}, Lkw8;->c(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lkw8;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lyk2;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lwu7;->t1:Lyk2;

    .line 25
    .line 26
    iget-object p1, p0, Lwu7;->x1:Lvz7;

    .line 27
    .line 28
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lou7;

    .line 33
    .line 34
    invoke-static {p1}, Lmb6;->g(Lg91;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lwu7;->t1:Lyk2;

    .line 38
    .line 39
    const-string p2, "binding"

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object p1, p1, Lyk2;->n0:Lsu/happ/proxyutility/ui/foundation/component/button/HappTextButton;

    .line 44
    .line 45
    new-instance v1, Lqu7;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {v1, p0, v2}, Lqu7;-><init>(Lwu7;B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lqk2;->S0:Lg94;

    .line 55
    .line 56
    invoke-static {p1}, Lys0;->z(Lg94;)Lu84;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    sget-object v1, Ltp1;->a:Lnf1;

    .line 61
    .line 62
    sget-object v1, Ldm4;->a:Lhv2;

    .line 63
    .line 64
    new-instance v2, Lvu7;

    .line 65
    .line 66
    const/4 v3, 0x1

    .line 67
    invoke-direct {v2, p0, v0, v3}, Lvu7;-><init>(Lwu7;Lq51;B)V

    .line 68
    .line 69
    .line 70
    const/4 v3, 0x2

    .line 71
    invoke-static {p1, v1, v2, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lqk2;->M()Landroidx/fragment/app/FragmentActivity;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->b()Lz95;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance v1, Lt16;

    .line 83
    .line 84
    const/16 v2, 0x1c

    .line 85
    .line 86
    invoke-direct {v1, p0, v2}, Lt16;-><init>(Ljava/lang/Object;B)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1, p0, v1}, Lgv3;->f(Lz95;Ld94;Lgn2;)V

    .line 90
    .line 91
    .line 92
    iget-object p0, p0, Lwu7;->t1:Lyk2;

    .line 93
    .line 94
    if-eqz p0, :cond_0

    .line 95
    .line 96
    iget-object p0, p0, Lkw8;->Z:Landroid/view/View;

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    return-object p0

    .line 102
    :cond_0
    invoke-static {p2}, Ldh3;->T(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v0

    .line 106
    :cond_1
    invoke-static {p2}, Ldh3;->T(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v0
.end method
