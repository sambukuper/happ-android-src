.class public abstract Ldr;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lkf3;

.field public static final b:Lkf3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lkf3;

    .line 2
    .line 3
    const/16 v1, 0x44

    .line 4
    .line 5
    const v2, 0xffff

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    invoke-direct {v0, v1, v2, v3}, Lif3;-><init>(III)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Ldr;->a:Lkf3;

    .line 13
    .line 14
    new-instance v0, Lkf3;

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    const/16 v2, 0xf

    .line 18
    .line 19
    invoke-direct {v0, v1, v2, v3}, Lif3;-><init>(III)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Ldr;->b:Lkf3;

    .line 23
    .line 24
    return-void
.end method
