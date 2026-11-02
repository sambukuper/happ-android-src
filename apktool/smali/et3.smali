.class public final Let3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfz3;


# static fields
.field public static final b:Lgz3;


# instance fields
.field public a:Lpt3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lgz3;

    .line 2
    .line 3
    const-class v1, Let3;

    .line 4
    .line 5
    sget-object v2, Lyb6;->a:Lzb6;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lgz3;-><init>(Lzu3;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Let3;->b:Lgz3;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final c()Lgz3;
    .locals 0

    .line 1
    sget-object p0, Let3;->b:Lgz3;

    .line 2
    .line 3
    return-object p0
.end method
