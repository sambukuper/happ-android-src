.class public abstract Lsy7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lfk2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lfk2;

    .line 2
    .line 3
    const-string v1, "kotlin.suspend"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lfk2;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lsy7;->a:Lfk2;

    .line 9
    .line 10
    new-instance v0, Lkd0;

    .line 11
    .line 12
    sget-object v1, Lug7;->k:Lfk2;

    .line 13
    .line 14
    const-string v2, "suspend"

    .line 15
    .line 16
    invoke-static {v2}, Lv15;->e(Ljava/lang/String;)Lv15;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-direct {v0, v1, v2}, Lkd0;-><init>(Lfk2;Lv15;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
