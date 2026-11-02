.class public abstract La64;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lwf7;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Liz8;->a:Ljava/util/Map;

    .line 2
    .line 3
    new-instance v0, Lhf3;

    .line 4
    .line 5
    const-wide v1, 0x100000001L

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Lhf3;-><init>(J)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    const/high16 v3, 0x43c80000    # 400.0f

    .line 16
    .line 17
    invoke-static {v2, v3, v0, v1}, Lwl7;->V(FFLjava/lang/Object;I)Lwf7;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, La64;->a:Lwf7;

    .line 22
    .line 23
    return-void
.end method
