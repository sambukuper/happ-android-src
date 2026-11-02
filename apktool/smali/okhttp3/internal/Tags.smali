.class public abstract Lokhttp3/internal/Tags;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00020\u0001B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J1\u0010\u0008\u001a\u00020\u0000\"\u0008\u0008\u0000\u0010\u0004*\u00020\u00012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00052\u0008\u0010\u0007\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010\u0004*\u00020\u00012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005H\u00a6\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u0082\u0001\u0002\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lokhttp3/internal/Tags;",
        "",
        "<init>",
        "()V",
        "T",
        "Lzu3;",
        "key",
        "value",
        "plus",
        "(Lzu3;Ljava/lang/Object;)Lokhttp3/internal/Tags;",
        "get",
        "(Lzu3;)Ljava/lang/Object;",
        "Lokhttp3/internal/EmptyTags;",
        "Lokhttp3/internal/LinkedTags;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lge1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/internal/Tags;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract get(Lzu3;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lzu3;",
            ")TT;"
        }
    .end annotation
.end method

.method public abstract plus(Lzu3;Ljava/lang/Object;)Lokhttp3/internal/Tags;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lzu3;",
            "TT;)",
            "Lokhttp3/internal/Tags;"
        }
    .end annotation
.end method
