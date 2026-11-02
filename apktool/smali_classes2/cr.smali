.class public abstract Lcr;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lsu/happ/proxyutility/dto/enums/MuxQuicType;->REJECT:Lsu/happ/proxyutility/dto/enums/MuxQuicType;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsu/happ/proxyutility/dto/enums/MuxQuicType;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcr;->a:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method
