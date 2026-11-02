.class public final Lf27;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lbx8;


# instance fields
.field public final a:Landroid/app/Application;

.field public final b:Lsu/happ/proxyutility/dto/SocketServerInfo;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lsu/happ/proxyutility/dto/SocketServerInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf27;->a:Landroid/app/Application;

    .line 5
    .line 6
    iput-object p2, p0, Lf27;->b:Lsu/happ/proxyutility/dto/SocketServerInfo;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lxw8;
    .locals 1

    .line 1
    new-instance p1, Ll27;

    .line 2
    .line 3
    iget-object v0, p0, Lf27;->a:Landroid/app/Application;

    .line 4
    .line 5
    iget-object p0, p0, Lf27;->b:Lsu/happ/proxyutility/dto/SocketServerInfo;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0}, Ll27;-><init>(Landroid/app/Application;Lsu/happ/proxyutility/dto/SocketServerInfo;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method
