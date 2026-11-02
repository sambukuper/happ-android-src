.class public final Lmk4;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:Lsu/happ/proxyutility/feature/main/MainActivity;

.field public final synthetic h0:Ljava/lang/String;

.field public final synthetic i0:Lsu/happ/proxyutility/dto/SubscriptionItem;

.field public final synthetic j0:Z

.field public final synthetic k0:Z

.field public final synthetic l0:Ljava/lang/String;

.field public final synthetic m0:Z

.field public final synthetic n0:Z

.field public final synthetic o0:Lg83;


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZLjava/lang/String;ZZLg83;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmk4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 2
    .line 3
    iput-object p2, p0, Lmk4;->h0:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lmk4;->i0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 6
    .line 7
    iput-boolean p4, p0, Lmk4;->j0:Z

    .line 8
    .line 9
    iput-boolean p5, p0, Lmk4;->k0:Z

    .line 10
    .line 11
    iput-object p6, p0, Lmk4;->l0:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p7, p0, Lmk4;->m0:Z

    .line 14
    .line 15
    iput-boolean p8, p0, Lmk4;->n0:Z

    .line 16
    .line 17
    iput-object p9, p0, Lmk4;->o0:Lg83;

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1, p10}, Luy7;-><init>(ILq51;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lmk4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lmk4;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lmk4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 11

    .line 1
    new-instance v0, Lmk4;

    .line 2
    .line 3
    iget-boolean v8, p0, Lmk4;->n0:Z

    .line 4
    .line 5
    iget-object v9, p0, Lmk4;->o0:Lg83;

    .line 6
    .line 7
    iget-object v1, p0, Lmk4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 8
    .line 9
    iget-object v2, p0, Lmk4;->h0:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p0, Lmk4;->i0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 12
    .line 13
    iget-boolean v4, p0, Lmk4;->j0:Z

    .line 14
    .line 15
    iget-boolean v5, p0, Lmk4;->k0:Z

    .line 16
    .line 17
    iget-object v6, p0, Lmk4;->l0:Ljava/lang/String;

    .line 18
    .line 19
    iget-boolean v7, p0, Lmk4;->m0:Z

    .line 20
    .line 21
    move-object v10, p1

    .line 22
    invoke-direct/range {v0 .. v10}, Lmk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZLjava/lang/String;ZZLg83;Lq51;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lko1;->B1:Lm51;

    .line 5
    .line 6
    iget-object p1, p0, Lmk4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->n()Lml2;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lkm4;->x(Lml2;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lkk4;

    .line 16
    .line 17
    iget-object v1, p0, Lmk4;->g0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 18
    .line 19
    iget-object v2, p0, Lmk4;->h0:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v3, p0, Lmk4;->i0:Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 22
    .line 23
    iget-boolean v4, p0, Lmk4;->j0:Z

    .line 24
    .line 25
    iget-boolean v5, p0, Lmk4;->k0:Z

    .line 26
    .line 27
    iget-object v6, p0, Lmk4;->l0:Ljava/lang/String;

    .line 28
    .line 29
    iget-boolean v7, p0, Lmk4;->m0:Z

    .line 30
    .line 31
    iget-boolean v8, p0, Lmk4;->n0:Z

    .line 32
    .line 33
    iget-object v9, p0, Lmk4;->o0:Lg83;

    .line 34
    .line 35
    invoke-direct/range {v0 .. v9}, Lkk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZLjava/lang/String;ZZLg83;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget p0, Ly46;->warning_text:I

    .line 42
    .line 43
    invoke-virtual {v1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    sget p1, Ly46;->handshake_error_message:I

    .line 48
    .line 49
    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    sget p1, Ly46;->yes:I

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    sget p1, Ly46;->no:I

    .line 60
    .line 61
    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    const/4 v8, 0x0

    .line 66
    const/16 v9, 0x492

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    const/4 v6, 0x0

    .line 70
    move-object v7, v0

    .line 71
    move-object v0, v1

    .line 72
    move-object v1, p0

    .line 73
    invoke-static/range {v0 .. v9}, Lbe;->m(Lsu/happ/proxyutility/ui/BaseActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ldn2;Ldn2;I)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Ldn8;->a:Ldn8;

    .line 77
    .line 78
    return-object p0
.end method
