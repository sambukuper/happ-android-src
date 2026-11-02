.class public final Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;
.super Landroidx/activity/ComponentActivity;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;",
        "Landroidx/activity/ComponentActivity;",
        "<init>",
        "()V",
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
.field public static final synthetic z0:I


# instance fields
.field public final y0:Ly5;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcu7;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lcu7;-><init>(Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ly5;

    .line 11
    .line 12
    const-class v2, Lmu7;

    .line 13
    .line 14
    sget-object v3, Lyb6;->a:Lzb6;

    .line 15
    .line 16
    invoke-virtual {v3, v2}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v3, Lcu7;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-direct {v3, p0, v4}, Lcu7;-><init>(Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;B)V

    .line 24
    .line 25
    .line 26
    new-instance v4, Lcu7;

    .line 27
    .line 28
    const/4 v5, 0x2

    .line 29
    invoke-direct {v4, p0, v5}, Lcu7;-><init>(Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;B)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, v2, v3, v0, v4}, Ly5;-><init>(Lzu3;Ldn2;Ldn2;Ldn2;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;->y0:Ly5;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;->y0:Ly5;

    .line 5
    .line 6
    invoke-virtual {p1}, Ly5;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lmu7;

    .line 11
    .line 12
    sget-object v0, Liu7;->a:Liu7;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lmu7;->e(Llu7;)V

    .line 15
    .line 16
    .line 17
    new-instance p1, Lbu7;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-direct {p1, p0, v0}, Lbu7;-><init>(Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;B)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lzy0;

    .line 24
    .line 25
    const v1, 0x552cfd5c

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v0, v1, v2, p1}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v0}, Lmy0;->a(Landroidx/activity/ComponentActivity;Lzy0;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
