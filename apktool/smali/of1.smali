.class public final Lof1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final f:Ljava/util/logging/Logger;


# instance fields
.field public final a:Lf63;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lzu4;

.field public final d:Lwr6;

.field public final e:Lwr6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lwe8;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lof1;->f:Ljava/util/logging/Logger;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lzu4;Lf63;Lwr6;Lwr6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lof1;->b:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Lof1;->c:Lzu4;

    .line 7
    .line 8
    iput-object p3, p0, Lof1;->a:Lf63;

    .line 9
    .line 10
    iput-object p4, p0, Lof1;->d:Lwr6;

    .line 11
    .line 12
    iput-object p5, p0, Lof1;->e:Lwr6;

    .line 13
    .line 14
    return-void
.end method
