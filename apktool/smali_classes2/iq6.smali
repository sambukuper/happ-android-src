.class public final Liq6;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lmn6;

.field public final c:Loh7;

.field public final d:Lh76;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 5
    .line 6
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Liq6;->b:Lmn6;

    .line 15
    .line 16
    new-instance v0, Lfq6;

    .line 17
    .line 18
    const-string v1, ""

    .line 19
    .line 20
    sget-object v2, Lsu/happ/proxyutility/dto/enums/ERoutingSettingsType;->PROXY:Lsu/happ/proxyutility/dto/enums/ERoutingSettingsType;

    .line 21
    .line 22
    invoke-direct {v0, v1, v1, v2}, Lfq6;-><init>(Ljava/lang/String;Ljava/lang/String;Lsu/happ/proxyutility/dto/enums/ERoutingSettingsType;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Liq6;->c:Loh7;

    .line 30
    .line 31
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Liq6;->d:Lh76;

    .line 36
    .line 37
    return-void
.end method
