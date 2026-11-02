.class public abstract Lpz7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lvz7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lmq7;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lmq7;-><init>(B)V

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
    sput-object v1, Lpz7;->a:Lvz7;

    .line 14
    .line 15
    return-void
.end method

.method public static a()Z
    .locals 3

    .line 1
    sget-object v0, Lpz7;->a:Lvz7;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 8
    .line 9
    const-string v1, "pref_tv_ui"

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/tencent/mmkv/MMKV;->getBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method
