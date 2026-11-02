.class public abstract Lod4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lvz7;

.field public static final b:Ldb3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lei3;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lei3;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lvz7;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lod4;->a:Lvz7;

    .line 14
    .line 15
    new-instance v0, Ldb3;

    .line 16
    .line 17
    invoke-direct {v0}, Ldb3;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lod4;->b:Ldb3;

    .line 21
    .line 22
    return-void
.end method
