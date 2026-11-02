.class public abstract Lth8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lvm;

.field public static final b:Lvm;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lvm;

    .line 2
    .line 3
    sget-object v1, Lks3;->q:Lfk2;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-direct {v0, v1, v2}, Lvm;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lth8;->a:Lvm;

    .line 13
    .line 14
    new-instance v0, Lvm;

    .line 15
    .line 16
    sget-object v1, Lks3;->r:Lfk2;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1, v2}, Lvm;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lth8;->b:Lvm;

    .line 25
    .line 26
    return-void
.end method
